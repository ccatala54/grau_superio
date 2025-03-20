import java.util.Scanner;

public class Strings2 {
    public static void main(String[] args) {

        /*Los Strings en Java son objetos inmutables es decir, no pueden canviar de valor*/
       /* String s = "Es Liceu";
        String s2 = s.toUpperCase();

        System.out.println(s);
        System.out.println(s2);
        /*Podemos recuperar dentro de la misma variable el nuevo objeto, creado por el metodo "toUpperCase",
        pero debemos entender que se trata de un objeto nuevo, NO EL MISMO*/

      /*  String s3 = "Bon dia";

        String s4 = s + " " + s3;
        System.out.println(s4);*/

       /* Scanner scanner = new Scanner(System.in);
        System.out.println("Num, maxim? ");
        int max = scanner.nextInt();

        //Generar un string con los numeros hasta el maximo

        String resultat = "";

        for (int i = 1; i <= max; i++) {
            resultat = resultat+ " " +i;

        }
        System.out.println(resultat);*/

      /*  Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce palabra: ");
        String palabra = scanner.nextLine();

        System.out.println("Introduce un numero: ");
        int num = scanner.nextInt();

        String resulado = repiteString(num, palabra);
        System.out.println(resulado);

    }

    public static String repiteString(int num, String s) {
    String res = "";
        for (int i = 0; i < num; i++) {
            res += " " +s ;
        }
        return res;
    }*/

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce una frase: ");
        String frase = scanner.nextLine();

        //Tenemos q transoformar la frase, hacienodo q la primera letra de cada palabra sea mayuscula, y las demas en minuscula Ej: bon dia --> Bon Dia // qUe TAL --> Que Tal

    boolean entreParaules = true;
    String resultat = " ";
        for (int i = 0; i < frase.length(); i++) {
            char c = frase.charAt(i);

            if (c != ' ' && entreParaules == true){
                resultat += (char) (c -32);
            }else {
                resultat += c;
            }

            if (c == ' '){
                entreParaules = true;
            }else {
                entreParaules = false;
            }
        }
        System.out.println(resultat);
    }
}
