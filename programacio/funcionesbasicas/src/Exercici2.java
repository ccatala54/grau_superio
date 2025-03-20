/*Codi actual:
int resultat = 1;
for (int i = 1; i <= 5; i++) {
resultat *= i;
}
System.out.println("El factorial de 5 és: " + resultat);

Objectiu: Refactoritza el codi creant una funció anomenada factorial que calculi el
factorial d'un número donat. Demana a l'usuari que introdueixi el número i mostra el resultat
de la funció.*/

import java.util.Scanner;

public class Exercici2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un numero: ");
        int num = scanner.nextInt();
        int res = factorial(num);

        System.out.println("El factorial de " +num +" és: " + res);
    }
    public static int factorial (int numero){
        int resultat = 1;
        for (int i = 1; i <= numero; i++) {
            resultat *= i;
        }
        return resultat;
    }
}
