//Exercici 4: Dibuixar un triangle d'asteriscs amb for
/*Escriu un programa que imprimeixi un triangle d'asteriscs de n files (sent n un número
introduït per l'usuari). Per exemple, si l'usuari introdueix 4, el programa ha de mostrar:
*
**
***
****
*/

import java.util.Scanner;

public class Exercici4 {
    public static void main(String[] args) {
     /*   Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un numero: ");
        int filas = scanner.nextInt();

        for (int i = 1; i <= filas; i++) {
            System.out.println();

            for (int j = 1; j <= i ; j++) {
                System.out.print("*");
            }

        }*/
        Scanner scanner = new Scanner(System.in);

        System.out.print("Que tan grande quieres el triangulo: ");
        int grande = scanner.nextInt();

        for (int contEstrellas = 0; contEstrellas < grande; contEstrellas++) {

            for (int i = 0; i < contEstrellas + 1; i++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }


}
