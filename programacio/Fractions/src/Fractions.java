import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Fractions {

    private static String[] numUnics = {"zero", "un", "dos", "tres", "quatre", "cinc", "sis", "set", "vuit", "nou", "deu",
            "onze", "dotze", "tretze", "catorze", "quinze", "setze", "disset", "divuit", "dinou"};

    private static String[] desenes = {"", "", "vint", "trenta", "quaranta", "cinquanta", "seixanta", "setanta", "vuitanta", "noranta"};

    private static String[] fraccions = {"", "unens", "mitjos", "terços", "quarts", "cinquens", "sisens", "setens", "vuitens", "novens", "dècims",
            "onzens", "dotzens", "tretzens", "catorzens", "quinzens", "setzens", "dissetens", "divuitens", "dinovens"};

    private static String[] pluralToSingular = {"", "unè", "mig", "terç", "quart", "cinquè", "sisè", "setè", "vuitè", "novè", "dècim",
            "onzè", "dotzè", "tretzè", "catorzè", "quinzè", "setzè", "dissetè", "divuitè", "dinovè"};

    private static String[] multiples10E = {"", "", "vintè", "trentè", "quarantè", "cinquantè", "seixantè", "setantè", "vuitantè", "norantè", "centè"};
    private static String[] multiples10ENS = {"", "", "vintens", "trentens", "quarantens", "cinquantens", "seixantens", "setantens", "vuitantens", "norantens", "centens"};

    public static String toWords(String fraccio) {

        String[] parts = fraccio.split("/"); // Separar por "/"
        int numerador = Integer.parseInt(parts[0]); //converteix un String a un numero
        int denominador = Integer.parseInt(parts[1]); // pasara la segona part de la barra

        //SIMPLIFICACIO
        String fraccioSimplified;
        if (numerador >= denominador) {
            fraccioSimplified = reduccio(numerador, denominador);
        } else { // si no es simplifica anar a parsetjar cada un
            fraccioSimplified = parseNumerador(numerador) + " " + parseDenominador(numerador, denominador);
        }
        return fraccioSimplified.substring(0, 1).toUpperCase() + fraccioSimplified.substring(1);
    }


    private static String reduccio(int numerador, int denominador) {
        int partEntera = numerador / denominador; // Sera el numerador (primera part)
        int newNumerador = numerador % denominador; // Posterior a la coma ','
        int mcd = calcularMCD(newNumerador, denominador); // cercar el divisor comu per simplificar la fraccio.

        // Ho possam primer per descartar possibles erros "100/5"
        if (numerador % denominador == 0) { // En cas que el residu sigui zero.
            return parseNumerador(partEntera); //Nomes torna el quocient
        }
        if (newNumerador % mcd == 0) {
            return parseNumerador(partEntera) + ", " + parseNumerador(newNumerador) + " " + parseDenominador(newNumerador, denominador);
        }
        newNumerador /= mcd;
        denominador /= mcd;
        return parseNumerador(partEntera) + ", " + parseNumerador(newNumerador) + " " + parseDenominador(numerador, denominador);
    }

    private static int calcularMCD(int a, int b) {
        while (b != 0) {
            if (a < b) {
                return a;
            }
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    private static String parseNumerador(int numerador) {
        if (numerador == 0) {
            return "Zero";
        }
        return numeroToWord(numerador);
    }

    private static String parseDenominador(int numerador, int denominador) {
        String result = numeroToWord(denominador); // Porta la fraccio desde towords

        String[] resultSplitted = result.split(" "); // Separacio de la cadena en array de paraules.
        // Analitza la darrera paraula.
        String lastOne = resultSplitted[resultSplitted.length - 1]; // Agafam es darrer element de l'array (sufix)

        int indexLastOne = Arrays.asList(numUnics).indexOf(lastOne); // cercar aquest element dins la llista de NumUnics.

        if (denominador < 20 && indexLastOne >= 0) { //comporvacions. Es major que zero perque hem trobat el sufix dins la llista.
            resultSplitted[resultSplitted.length - 1] = numerador != 1 ? fraccions[indexLastOne] : pluralToSingular[indexLastOne];
            // miram numerador per substituir el denominador segons la condiio de si es 1 o no. Plural o singular
            return String.join(" ", resultSplitted);
            // juntar els elements d'un array a un string
            // en un principi hem separat per espais per modificar es darrer en arrays
            // pero hem de retornar un string per aixo ho convertim amb el join.
        }
        indexLastOne = Arrays.asList(desenes).indexOf(lastOne);

        if (indexLastOne >= 0) {
            // Modifica el darrer element de l'array (sufixe). Si num != 1 == plural --> Multiples10, sino -ENS
            resultSplitted[resultSplitted.length - 1] = numerador != 1 ? multiples10ENS[indexLastOne] : multiples10E[indexLastOne];
            return String.join(" ", resultSplitted); //Reconstruim la cadena de texte amb els elements de l'array + espais.
        }

        int indexOfUn = Arrays.asList(resultSplitted).indexOf("milió") - 1; // Si trobam la paraula, restam 1 per obtenir l paraula de davant
        if (indexOfUn >= 0 && resultSplitted[indexOfUn].equals("un")) { // Verificacio de l'anterior.
            List<String> list = new ArrayList<>(Arrays.asList(resultSplitted)); // Creacio d'una nova llista
            list.remove(indexOfUn); //Eliminacio de la paraula "UN"
            resultSplitted = new String[resultSplitted.length - 1]; // Cream nou array amb una longitud mes petita.
            resultSplitted = list.toArray(resultSplitted); // Resultat de la nova llista amb diferent llargaria (index)
        }
        resultSplitted[resultSplitted.length - 1] = parseMultiples(numerador, lastOne); // Si no trobam sufix especific, anam a parseMult().
        return String.join(" ", resultSplitted); // Reconstruccio de tots els ements de l'array amb espais.
    }

    private static String parseMultiples(int numerador, String lastOne) { //lastOne es per substituir el numero incial pel corresponent en nomenclatura
        lastOne = lastOne.replace("nou", "nov");

        String[] lastOneSplitted = lastOne.split("-");

        String finalLastOne = lastOneSplitted[lastOneSplitted.length - 1];

        if (finalLastOne.equals("cent")) {
            lastOneSplitted[lastOneSplitted.length - 1] = numerador != 1 ? "centèsims" : "centèsim";
            return String.join("-", lastOneSplitted);
        }

        if (finalLastOne.equals("mil")) {
            lastOneSplitted[lastOneSplitted.length - 1] = numerador != 1 ? "mil·lèsims" : "mil·lèsim";
            return String.join("-", lastOneSplitted);
        }

        if (finalLastOne.equals("milió")) {
            lastOneSplitted[lastOneSplitted.length - 1] = numerador != 1 ? "milionèsims" : "milionèsim";
            return String.join("-", lastOneSplitted);
        }

        if (finalLastOne.equals("deu")) {
            lastOneSplitted[lastOneSplitted.length - 1] = numerador != 1 ? "dècims" : "dècim";
            return String.join("-", lastOneSplitted);
        }

        if (finalLastOne.contains("cinc")) {
            lastOneSplitted[lastOneSplitted.length - 1] = numerador != 1 ? "cinquens" : "cinquè";
            return String.join("-", lastOneSplitted);
        }

        if (finalLastOne.charAt(finalLastOne.length() - 1) == 'e' || finalLastOne.charAt(finalLastOne.length() - 1) == 'è') {
            finalLastOne = finalLastOne.substring(0, finalLastOne.length() - 1);
        }

        lastOneSplitted[lastOneSplitted.length - 1] = numerador != 1 ? finalLastOne + "ens" : finalLastOne + "è";
        return String.join("-", lastOneSplitted);
    }

    private static String numeroToWord(int numero) {
        String result = "";

        if (numero / 1_000_000_000 > 0) {
            result += parseMilMilions(numero);
        } else if (numero / 1_000_000 > 0) {
            result += parseMilions(numero);
        } else if (numero / 100_000 > 0 || numero / 10_000 > 0 || numero / 1_000 > 0) {
            result += parseMilers(numero);
        } else if (numero / 100 > 0) {
            result += parseCentenes(numero);
        } else if (numero / 10 > 0) { // 10 - 99
            result += parseDesenes(numero);
        } else if (numero > 0) { // 0-10
            result = parseUnitats(numero);
        }

        return result;
    }

    private static String parseUnitats(int numero) {
        return numUnics[numero]; //numerador unitat
    }

    private static String parseDesenes(int numero) {
        if (numero != 0 && numero < 20) { // 10 - 19
            return parseUnitats(numero);
        }

        if (numero % 10 == 0) { // 10, 20, 30, 40, 50 ...
            return desenes[numero / 10];
        }

        if (numero < 30) {
            return desenes[numero / 10] + "-i-" + parseUnitats(numero % 10);
        }

        return desenes[numero / 10] + "-" + parseUnitats(numero % 10);
    }

    private static String parseCentenes(int numero) {
        if (numero < 100) {
            return parseDesenes(numero % 1_00);
        }
        if (numero % 100 == 0) {
            if (numero == 100) {
                return "cent";
            }
            return parseUnitats(numero / 1_00) + "-" + "cents";
        }
        if (numero < 200 && numero > 100) {
            return "cent " + parseDesenes(numero % 1_00);
        }
        return parseUnitats(numero / 1_00) + "-" + "cents " + parseDesenes(numero % 1_00);
    }

    private static String parseMilers(int numero) {
        if (numero < 1000) {
            return parseCentenes(numero);
        }

        if (numero == 1_000) {
            return "mil";
        }

        if (numero < 2_000) {
            return "mil " + parseCentenes(numero % 1_000);
        }

        return parseCentenes(numero / 1_000) + " mil " + parseCentenes(numero % 1_000);
    }

    private static String parseMilions(int numero) {
        if (numero < 1_000_000) {
            return parseMilers(numero);
        }

        if (numero < 2_000_000) {
            return "un milió " + parseMilers(numero % 1_000_000);
        }

        return parseCentenes(numero / 1_000_000) + " milions " + parseMilers(numero % 1_000_000);
    }

    private static String parseMilMilions(int numero) {
        if (numero < 1_000_000_000) {
            return parseMilions(numero);
        }

        if (numero == 1_000_000_000) {
            return "mil milions";
        }

        if (numero < 2_000_000_000) {
            return " mil " + parseMilions(numero);
        }

        return parseCentenes(numero / 1_000_000_000) + " mil " + parseMilions(numero);
    }


}