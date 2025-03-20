public class Vigenere {

    static String encode(String s, String password) {
        s = normalizarTexto(s);
        password = normalizarTexto(password);
        return vigenere(s, password, true);
    }

    static String decode(String s, String password) {
        s = normalizarTexto(s);
        password = normalizarTexto(password);
        return vigenere(s, password, false);
    }

    private static String vigenere(String s, String pass, boolean encrypt) {
        StringBuilder result = new StringBuilder();
        pass = pass.toUpperCase();

        int longitud = pass.length();
        int j = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (Character.isLetter(c)) {
                int delta = caracterAnum(pass.charAt(j % longitud));

                if (!encrypt) {
                    delta = -delta;
                }

                c = despazarCar(c, delta);
                j++;
            }

            result.append(c);
        }

        return result.toString();
    }

    private static String normalizarTexto(String s) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            switch (c) {
                case 'á':
                case 'à':
                case 'ä':
                case 'â':
                case 'ã':
                    result.append('A');
                    break;
                case 'é':
                case 'è':
                case 'ë':
                case 'ê':
                    result.append('E');
                    break;
                case 'í':
                case 'ì':
                case 'ï':
                case 'î':
                    result.append('I');
                    break;
                case 'ó':
                case 'ò':
                case 'ö':
                case 'ô':
                case 'õ':
                    result.append('O');
                    break;
                case 'ú':
                case 'ù':
                case 'ü':
                case 'û':
                    result.append('U');
                    break;
                default:
                    result.append(Character.toUpperCase(c));
                    break;
            }
        }

        return result.toString();
    }

    private static int caracterAnum(char c) {
        return c - 'A' + 1;
    }

    private static char despazarCar(char c, int delta) {
        int shifted = (c - 'A' + delta + 26) % 26;
        return (char) ('A' + shifted);
    }
}