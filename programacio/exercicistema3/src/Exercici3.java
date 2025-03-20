//Exercici 3: Comptar números positius i negatius amb do...while
/*Escriu un programa que permeti a l'usuari introduir números fins que introdueixi un 0. El
programa ha de comptar quants d'aquests números van ser positius i quants negatius
utilitzant un bucle do...while.*/

import java.util.Scanner;

public class Exercici3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int contPos = 0, contNeg = 0;
        int num;
        do {
            System.out.print("Introduce un numero: ");
            num = scanner.nextInt();

            if (num > 0) {
                contPos++;
            } else if (num < 0) {
                contNeg++;
            }
        } while (num != 0);

        System.out.println("Has introducido: " + contPos + " Positivos " + " y " + contNeg + " Negativos");


    }
}
