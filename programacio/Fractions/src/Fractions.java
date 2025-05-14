import java.util.Scanner;

public class Fractions {
    public static String toWords(String s) {
        String[] parts = s.split("/");
        int numerador = Integer.parseInt(parts[0]);
        int denominador = Integer.parseInt(parts[1]);

        boolean singular = false;
        String resultatNum = numtoWord(numerador);

        // Si el numerador es "un", marcar como singular
        if (resultatNum.equals("un")) {
            singular = true;
        }

        String resultatDen = dentoWord(denominador, singular);

        // Cuando el numerador es 1, solo queremos el denominador
        if (numerador == 1) {
            return priMaj(resultatNum) + " " + resultatDen;
        } else {
            // Si el numerador es distinto de 1, concatenamos tanto el numerador como el denominador
            return priMaj(resultatNum) + " " + resultatDen;
        }
    }

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
        } else if (den == 1) {
            return esSingular ? "unè" : "unena";
        } else if (den == 2) {
            return "mig";
        } else if (den > 0 && den <= 10) {
            return switch (den) {
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
        } else if (den == 21) {
            return "vint-i-unè"; // Caso especial para 21
        } else if (den > 10 && den <= 19) {
            String[] deuens = {"onz", "dotz", "tretz", "catorz", "quinz", "setz", "disset", "divuit", "dinov"};
            return esSingular ? deuens[den - 11] + "è" : deuens[den - 11] + "ens";
        } else if (den == 99) {
            return "noranta-novens"; // Caso especial para 99
        } else if (den > 19 && den <= 29) {
            String[] decims = {"vint", "trent", "quarant", "cinquant", "seixant", "setant", "vuitant", "norant"};
            if (den == 22) {
                return "vint-i-dosens"; // Caso especial para 22
            } else {
                int numDenA = den % 10;
                return decims[(den / 10) - 2] + "-i-" + numtoWord(numDenA) + "ens";
            }
        } else if (den > 29 && den <= 90) {
            String[] decimsFracc = {"vint", "trent", "quaranta", "cinquant", "seixanta", "setanta", "vuitanta", "noranta"};
            String[] decimsCard = {"vint", "trenta", "quaranta", "cinquanta", "seixanta", "setanta", "vuitanta", "noranta"};

            if (den % 10 == 0) {
                return esSingular ? decimsFracc[(den / 10) - 2] + "è" : decimsFracc[(den / 10) - 2] + "ens";
            } else {
                int numDenA = den % 10;
                String prefix = decimsCard[(den / 10) - 2];
                String sufix = ordinalSimple(numDenA, esSingular);
                return prefix + "-" + sufix;
            }
        }
        return "ERROR"; // Si el denominador no se encuentra en ningún caso gestionado
    }

    private static String priMaj(String numero) {
        if (numero == null || numero.isEmpty()) {
            return numero;
        }
        char primeraLletraMaj = numero.toUpperCase().charAt(0);
        String resto = numero.substring(1);
        return primeraLletraMaj + resto;
    }

    private static String ordinalSimple(int num, boolean esSingular) {
        return switch (num) {
            case 1 -> esSingular ? "primer" : "primers";
            case 2 -> esSingular ? "segon" : "segons";
            case 3 -> esSingular ? "tresè" : "tresens";
            case 4 -> esSingular ? "quart" : "quarts";
            case 5 -> esSingular ? "cinquè" : "cinquens";
            case 6 -> esSingular ? "sisè" : "sisens";
            case 7 -> esSingular ? "setè" : "setens";
            case 8 -> esSingular ? "vuitè" : "vuitens";
            case 9 -> esSingular ? "novè" : "novens";
            case 10 -> esSingular ? "dècim" : "dècims";
            default -> esSingular ? numtoWord(num) + "è" : numtoWord(num) + "ens";
        };
    }
}
