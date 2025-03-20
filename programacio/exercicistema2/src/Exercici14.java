/*14- Fes un programa que calculi la divisió de dos números tipus double i el resultat ho posi en una
variable de tipus int*/

import java.util.Scanner;

public class Exercici14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce un numero: ");
        double num1 = scanner.nextDouble();

        System.out.println("Introduce un segundo numero:");
        double num2 = scanner.nextDouble();

        int div = (int) (num1/num2);
        System.out.println("El resultado de la division, en numeros enteros es: " +div);
    }

}
