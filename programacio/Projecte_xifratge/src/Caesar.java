public class Caesar {

    public static String cypher(String s, int delta) {
        return abecedari(s, delta);
    }

    public static String decypher(String s, int delta) {
        return abecedari(s, -delta);
    }

    public static String magic(String s, String ss) {
        char mayorFrequenciaA = lletraRepetida(s);
        char mayorFrequenciaB = lletraRepetida(ss);

        int delta = (mayorFrequenciaA - mayorFrequenciaB + 26) % 26;
        return decypher(s, delta);

    }

    private static String abecedari(String s, int delta) {
        StringBuilder result = new StringBuilder();
        s = s.toUpperCase();

        delta = delta % 26;
        for (char c : s.toCharArray()) {
            if (c >= 'A' && c <= 'Z') {
                if (c + delta > 'Z') {
                    c = (char) ('A' + (c + delta - 'Z' - 1));
                } else if (c + delta < 'A') {
                    c = (char) ('Z' - ('A' - (c + delta) - 1));
                } else {
                    c = (char) (c + delta);
                }
            }
            result.append(c);
        }
        return result.toString();
    }

    static char lletraRepetida(String frase) {
        int[] freq = new int[26];
        frase = frase.toUpperCase();

        for (char c : frase.toCharArray()) {
            if (c >= 'A' && c <= 'Z') {
                freq[c - 'A']++;
            }
        }

        int maxIndex = 0;
        for (int i = 1; i < 26; i++) {
            if (freq[i] > freq[maxIndex]) {
                maxIndex = i;
            }
        }

        return (char) (maxIndex + 'A');

    }
}
