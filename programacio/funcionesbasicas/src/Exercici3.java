/*Codi actual:
int nombre = 7;
if (nombre % 2 == 0) {
System.out.println("És parell");
} else {
System.out.println("És senar");
}

Objectiu: Refactoritza el codi creant una funció anomenada esParell que determini si un
número és parell o senar. Demana a l'usuari que introdueixi el número i mostra el resultat de
la funció.*/

import java.util.Scanner;

public class Exercici3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un numero: ");
        int nombre = scanner.nextInt();

        if (esParell(nombre) ) {
            System.out.println("És parell");
        } else {
            System.out.println("És senar");
        }
    }
    public static boolean esParell (int num){

        if (num % 2 == 0) return true;
        return false;
    }
}
