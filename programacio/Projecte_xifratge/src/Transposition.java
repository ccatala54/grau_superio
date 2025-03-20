import java.util.Arrays;

public class Transposition {

    private static String transposition(String s, int dim, boolean isCypher) {
        StringBuilder[] rows = new StringBuilder[dim];
        for (int i = 0; i < dim; i++) {
            rows[i] = new StringBuilder();
        }

        if (isCypher) {
            for (int i = 0; i < s.length(); i++) {
                rows[i % dim].append(s.charAt(i));
            }
        } else {
            int fullColumns = s.length() % dim;
            int columnSize = s.length() / dim;
            int index = 0;

            for (int i = 0; i < dim; i++) {
                int currentColumnSize = columnSize + (i < fullColumns ? 1 : 0);
                for (int j = 0; j < currentColumnSize; j++) {
                    if (index < s.length()) {
                        rows[i].append(s.charAt(index++));
                    }
                }
            }
        }

        StringBuilder result = new StringBuilder();
        if (isCypher) {
            for (StringBuilder row : rows) {
                result.append(row);
            }
        } else {
            int maxRowLength = rows[0].length();
            for (int i = 0; i < maxRowLength; i++) {
                for (StringBuilder row : rows) {
                    if (i < row.length()) {
                        result.append(row.charAt(i));
                    }
                }
            }
        }

        return result.toString().trim();
    }

    static String cypher(String s, int dim) {
        return transposition(s, dim, true);
    }

    static String decypher(String s, int dim) {
        return transposition(s, dim, false);
    }

    static String cypher(String s, String key) {
        Integer[] ordenClave = obtenerOrdenClave(key);
        int longitudTexto = s.length();
        int longitudClave = key.length();

        char[] textoCifrado = new char[longitudTexto];
        Arrays.fill(textoCifrado, 'X');

        int posicion = 0;
        for (int col : ordenClave) {
            for (int row = 0; row < (longitudTexto + longitudClave - 1) / longitudClave; row++) {
                int indiceOriginal = row * longitudClave + col;
                if (indiceOriginal < longitudTexto)
                    textoCifrado[posicion++] = s.charAt(indiceOriginal);
            }
        }

        return new String(textoCifrado);
    }

    static String decypher(String s, String key) {
        Integer[] ordenClave = obtenerOrdenClave(key);
        int longitudTexto = s.length();
        int longitudClave = key.length();

        char[] textoDescifrado = new char[longitudTexto];
        int posicion = 0;

        for (int col : ordenClave) {
            for (int row = 0; row < (longitudTexto + longitudClave - 1) / longitudClave; row++) {
                int indiceOriginal = row * longitudClave + col;
                if (indiceOriginal < longitudTexto)
                    textoDescifrado[indiceOriginal] = s.charAt(posicion++);
            }
        }

        return new String(textoDescifrado).replaceAll("X+$", "");
    }

    static Integer[] obtenerOrdenClave(String key) {
        int longitud = key.length();
        Character[] caracteresClave = new Character[longitud];
        Integer[] orden = new Integer[longitud];

        for (int i = 0; i < longitud; i++) {
            caracteresClave[i] = key.charAt(i);
            orden[i] = i;
        }

        Arrays.sort(orden, (a, b) -> caracteresClave[a].compareTo(caracteresClave[b]));
        return orden;
    }
}
