//Exercici 8: Imprimir números en ordre invers amb for
/*Escriu un programa que demani un número n i després imprimeixi els números des de n fins
a 1 en ordre invers utilitzant un bucle for.*/

import java.util.Scanner;

public class Exercici8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un numero: ");
        int n = scanner.nextInt();

        for (int i = n; i >= 1; i--) {
            System.out.println(i);
        }
    }
}
