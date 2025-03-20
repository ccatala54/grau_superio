/*5- Escriu un programa que, donat un número (int) canvii tots els seus bits (els 0 per 1 i els 1 per 0).*/

import java.util.Scanner;
import java.util.function.BinaryOperator;

public class Exercici5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*System.out.println("Introduce un numero:");
        int num1 = scanner.nextInt();

        System.out.println(num1);
        System.out.println(Integer.toBinaryString(~(num1)));*/

        System.out.println("Introduce un numero:");
        int num1 = scanner.nextInt();

        System.out.println(num1);
        System.out.println(Integer.toBinaryString(num1));
        System.out.println(Integer.toBinaryString(~num1));

    }
}
