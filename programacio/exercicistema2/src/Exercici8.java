/*8- Escriu un programa que multipliqui per 9 un número emprant només l’operació de desplaçament
i l’operació de suma.*/

import java.util.Scanner;

public class Exercici8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       /* System.out.println("Introduce un numero:");
        int mult9 = scanner.nextInt();

        mult9 = (mult9 << 3) + mult9;

        System.out.println(mult9);*/

        System.out.println("Introduce un numero:");
        int mult9 = scanner.nextInt();
        int orginal = mult9;
        int multP = (mult9 << 3) + orginal;

        System.out.println(multP);
    }
}
