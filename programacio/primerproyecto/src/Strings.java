import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce string: ");
        String frase = scanner.nextLine();

        int nvocals = 0;
        int nconsonants = 0;

        for (int i = 0; i < frase.length(); i++) {
            char c = frase.charAt(i);
            if (esVocal(c)) {
                nvocals++;
            } else if (esConsonant(c)) {
                nconsonants++;

            }

        }
        System.out.println("Hay " +nvocals + " vocales y " +nconsonants + " consonantes ");
    }
    public static boolean esVocal (char character){

        String vocals = "aeiou";
        for (int i = 0; i < vocals.length(); i++) {
            char vocal = vocals.charAt(i);
            if ( character == vocal) return true;
            if (character == vocal -32) return true;
        }
        return false;

        /*if (character == 'a' || character == 'e' || character == 'i' || character == 'o' ||character == 'u') return true;

        if (character == 'A' || character == 'E' || character == 'I' || character == 'O' ||character == 'U') return true;
            return false;*/
    }

    public static boolean esConsonant (char character){
        String consonants = "bcdfghjklmnpqrstvwxyz";
        for (int i = 0; i < consonants.length(); i++) {
            char cons = consonants.charAt(i);
            if (cons == character) return true;
            if (character == cons -32) return true;
        }
    return false;
    }

}
      /*  String s = "Hello, Liceu";
        String s2  = "123456";
        int i =123_456;

        for (int j = 0; j < s.length(); j++) {
            System.out.println(s.charAt(j));
        }

        System.out.println(s.length()); //saber cuantos caracteres tine
        System.out.println(s.charAt(1)); //Imprimir posision*/


