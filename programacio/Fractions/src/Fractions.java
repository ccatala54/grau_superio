import java.util.Scanner;

public class Fractions {
    public static String toWords(String s) {
       // Scanner scanner = new Scanner(System.in);

    //    System.out.println("Quina fracció vols?");
      //  String fraccio =scanner.nextLine();
        //System.out.println(toWords(fraccio));

        String[] parts = s.split("/");
        int numerador = Integer.parseInt(parts[0]);
        int denominador = Integer.parseInt(parts[1]);



        boolean singular = false;
        String resultatNum = numtoWord(numerador);


        if (resultatNum.equals("un")) {
            singular = true;
        }

        String resultatDen = dentoWord(denominador, singular);

        return priMaj(resultatNum) + " " + resultatDen;

    }

    //  if (s == "zero") {
    //      return "Zero";
    // }

    ;

    // Aquí puedes hacer una función donde pueda CONTROLAR los numeros que te van a dar(ifs, if-else...)


    // Deolver la cadena de caracteres, es decir aquí se devolverá el resultado de los tests
    // ex: return resultado -> Esto en los tests será la cadena que le das!!


    //Denominadors del 1 al 10

    public static String numtoWord(int num) {

        if (num == 0) {
            return "zero";
        } else if (num > 0 && num <= 10) {

            return switch (num) {

                case 1 -> "un";
                case 2 -> "dos";
                case 3 -> "tres";
                case 4 -> "quatre";
                case 5 -> "cinc";
                case 6 -> "sis";
                case 7 -> "set";
                case 8 -> "vuit";
                case 9 -> "nou";
                case 10 -> "deu";
                default -> "ERROR";
            };
        } else if (num > 10 && num <= 19) {
            String[] deuens = {"onze", "dotze", "tretze", "catorze", "quinze", "setze", "disset", "divuit", "dinou"};
            return deuens[num - 11];
        } else if (num > 19 && num <= 90) {
            String[] decims = {"vint", "trenta", "quaranta", "cinquanta", "seixanta", "setanta", "vuitanta", "noranta"};
            if (num % 10 == 0) {
                return decims[(num / 10) - 2];
            } else {
                int numNumA = num % 10;

                if (num > 20 && num < 30) {
                    return "vint-i-" + numtoWord(numNumA);
                } else {
                    return decims[(num / 10) - 2] + "-" + numtoWord(numNumA);
                }

            }
        }


        return "";
    }


    public static String dentoWord(int den, boolean esSingular) {

        if (den == 0) {
            return "zero";
        } else if (den > 0 && den <= 10) {
            return switch (den) {
                case 1 -> esSingular ? "unè" : "unena";
                case 2 -> esSingular ? "mig" : "mitjos";
                case 3 -> esSingular ? "terç" : "terços";
                case 4 -> esSingular ? "quart" : "quarts";
                case 5 -> esSingular ? "cinquè" : "cinquens";
                case 6 -> esSingular ? "sisè" : "sisens";
                case 7 -> esSingular ? "setè" : "setens";
                case 8 -> esSingular ? "vuitè" : "vuitens";
                case 9 -> esSingular ? "novè" : "novens";
                case 10 -> esSingular ? "dècim" : "dècims";
                default -> "ERROR";
            };
        } else if (den > 10 && den <= 19) {

            String[] deuens = {"onz", "dotz", "tretz", "catorz", "quinz", "setz", "disset", "divuit", "dinov, vint"};
            return esSingular ? deuens[den - 11] + "è" : deuens[den - 11] + "ens";
        } else if (den > 19 && den <= 90) {
            String[] decims = {"vint", "trent", "quarant", "cinquant", "seixant", "setant", "vuitant", "norant"};

            if (den % 10 == 0) {
                return esSingular ? decims[(den / 10) - 2] + "è" : decims[(den / 10) - 2] + "ens";
            } else {
                int numDenA = den % 10;
                
                if (den > 20 && den < 30) {
                    return "vint-i-" + dentoWord(numDenA, esSingular);
                } else if (den > 50 && den < 60) {
                    return decims[(den / 10) - 2] + "a" + "-" + dentoWord(numDenA, esSingular);
                } else {


                   /* if (numDenA == 2 || numDenA == 3 ){

                        return switch (numDenA){
                                case 2 ->  decims[(den / 10) - 2] + "-" +"dosens";
                                case 3-> decims[(den / 10) - 2] + "-" +"tresens";
                                default -> "ERROR";
                            };
                    }else {*/
                    return decims[(den / 10) - 2] + "-" + dentoWord(numDenA, esSingular);
                }

            }

        }
        return "";

    }
    private static String priMaj(String numero) {
        char primeraLletraMaj = numero.toUpperCase().charAt(0);
        String restaParaula = numero.substring(1);
        return primeraLletraMaj + restaParaula;

    }

}