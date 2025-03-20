/*6- Escriu un programa que multipliqui per 8 un número emprant només l’operació de desplaçament
bit a bit.*/

import java.util.Scanner;

public class Exercici6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*System.out.println("Introduce un numero:");
        int mult = scanner.nextInt();

         mult = mult << 3;

        System.out.println("El resultado de la multiplicacion es: " +mult);*/

        System.out.println("Introduce un numero:");
        int mult = scanner.nextInt();

        int multP = mult << 3;

        System.out.println("El resultado de la multiplicacion es: " +multP);


    }
}
