/*7- Escriu un programa que divideixi un número per 2 només emprant l’operació de desplaçament
bit a bit.*/

import java.util.Scanner;

public class Exercici7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       /* System.out.println("Introduce un numero:");
        int div = scanner.nextInt();

        div = div >> 1;

        System.out.println("El resultado de la division es: " +div);*/

        System.out.println("Introduce un numero:");
        int div = scanner.nextInt();

       int divP = div >> 1;

        System.out.println("El resultado de la division es: " +divP);
    }
}
