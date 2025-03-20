/*Codi actual:
String frase = "Hola món";
String majuscula = frase.toUpperCase();
System.out.println(majuscula);

Objectiu: Refactoritza el codi creant una funció anomenada convertirAMajuscules que
converteixi una frase a majúscules. Demana a l'usuari que introdueixi la frase i mostra el
resultat de la funció.*/

import java.util.Scanner;

public class Exercici4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce una frase: ");
        String frase = scanner.nextLine();

        String majuscula = convertirAMajuscules(frase);
        System.out.println(majuscula);

    }
    public static String convertirAMajuscules (String s){

        String res = s.toUpperCase();

        return res;

    }
}
