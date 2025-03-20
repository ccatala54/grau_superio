import java.util.Arrays;

public class PlayFair {
    private static final char[] ABC = "ABCDEFGHIKLMNOPQRSTUVWXYZ".toCharArray();

    public PlayFair() {}

    public static String encrypt(String text, String pass) {
        text = cleanText(text);
        char[][] keyMatrix = createKey(pass);
        return procesoText(text, keyMatrix, true);
    }

    public static String decrypt(String text, String pass) {
        text = cleanText(text);
        char[][] keyMatrix = createKey(pass);
        return procesoText(text, keyMatrix, false);
    }

    private static String cleanText(String text) {
        return text.toUpperCase()
                .replaceAll("[ÀÁÂÃÄ]", "A")
                .replaceAll("[ÈÉÊË]", "E")
                .replaceAll("[ÌÍÎÏ]", "I")
                .replaceAll("[ÒÓÔÕÖ]", "O")
                .replaceAll("[ÙÚÛÜ]", "U")
                .replace("Ç", "C")
                .replaceAll("[^A-Z]", "")
                .replace(" ", "");
    }

    private static char[][] createKey(String key) {
        key = cleanText(key);
        key = eliminarCaracteresDuplicados(key);
        char[][] matrix = new char[5][5];
        int row = 0, col = 0;

        for (char c : key.toCharArray()) {
            if (row == 5) break;
            matrix[row][col] = c;
            col++;
            if (col == 5) {
                col = 0;
                row++;
            }
        }

        for (char c : ABC) {
            if (key.indexOf(c) == -1) {
                if (row == 5) break;
                matrix[row][col] = c;
                col++;
                if (col == 5) {
                    col = 0;
                    row++;
                }
            }
        }

        return matrix;
    }

    private static String eliminarCaracteresDuplicados(String str) {
        StringBuilder result = new StringBuilder();
        boolean[] seen = new boolean[26];

        for (char c : str.toCharArray()) {
            int pos = c - 'A';
            if (!seen[pos]) {
                seen[pos] = true;
                result.append(c);
            }
        }

        return result.toString();
    }

    private static String formatTextPairs(String text) {
        StringBuilder formatted = new StringBuilder(text);
        for (int i = 0; i < formatted.length() - 1; i += 2) {
            if (formatted.charAt(i) == formatted.charAt(i + 1)) {
                formatted.insert(i + 1, 'X');
            }
        }
        if (formatted.length() % 2 != 0) formatted.append('X');
        return formatted.toString();
    }

    private static String procesoText(String text, char[][] keyMatrix, boolean encrypt) {
        text = formatTextPairs(text);
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < text.length(); i += 2) {
            char c1 = text.charAt(i);
            char c2 = text.charAt(i + 1);
            int[] pos1 = posicionFinal(c1, keyMatrix);
            int[] pos2 = posicionFinal(c2, keyMatrix);

            if (pos1[0] == pos2[0]) {
                result.append(keyMatrix[pos1[0]][(pos1[1] + (encrypt ? 1 : 4)) % 5]);
                result.append(keyMatrix[pos2[0]][(pos2[1] + (encrypt ? 1 : 4)) % 5]);
            } else if (pos1[1] == pos2[1]) {
                result.append(keyMatrix[(pos1[0] + (encrypt ? 1 : 4)) % 5][pos1[1]]);
                result.append(keyMatrix[(pos2[0] + (encrypt ? 1 : 4)) % 5][pos2[1]]);
            } else {
                result.append(keyMatrix[pos1[0]][pos2[1]]);
                result.append(keyMatrix[pos2[0]][pos1[1]]);
            }
            result.append(" ");
        }

        return result.toString().trim();
    }

    private static int[] posicionFinal(char c, char[][] matrix) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (matrix[i][j] == c) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }

}