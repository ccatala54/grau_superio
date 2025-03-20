/*2- Fes un programa que calculi l’àrea d’un triangle. A = (base * altura) / 2*/

import java.util.Scanner;

public class Exercici2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Que mide la base del triangulo?");
        double base = scanner.nextDouble();

        System.out.println("Que mide la altura del triangulo?");
        double altura = scanner.nextDouble();

        double area = (base*altura)/2;

        System.out.println("El area del triangulo es: " +area);
    }
}
