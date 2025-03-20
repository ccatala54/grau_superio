/*

1.Escriu un programa que sumi, resti, divideixi i multipliqui dos números. Fes-ho dos cops: primer
amb int i després amb double

*/

import java.util.Scanner;

public class Exercici1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un numero:");
        int num1 = scanner.nextInt();

        System.out.println("Introduce un segundo numero:");
        int num2 = scanner.nextInt();

        int suma = num1 +num2;
        int resta = num1-num2;
        int mult = num1*num2;
        int div = num1/num2;

        System.out.println("La suma con int, entre " +num1 +" i " +num2 +" es: "  +suma);
        System.out.println("La resta con int, entre " +num1 +" i " +num2 +" es: "  +resta);
        System.out.println("La multiplicacion con int, entre " +num1 +" i " +num2 +" es: "  +mult);
        System.out.println("La divicion con int, entre " +num1 +" i " +num2 +" es: "  +div);

        System.out.println();
        System.out.println();

        double sumad = num1 +num2;
        double restad = num1-num2;
        double multd = num1*num2;
        double divd = (double) num1 / num2;

        System.out.println("La suma con double, entre " +num1 +" i " +num2 +" es: "  +sumad);
        System.out.println("La resta con double, entre " +num1 +" i " +num2 +" es: "  +restad);
        System.out.println("La multiplicacion con double, entre " +num1 +" i " +num2 +" es: "  +multd);
        System.out.println("La divicion con double, entre " +num1 +" i " +num2 +" es: "  +divd);


    }
}
