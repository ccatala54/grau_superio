/*Fes un programa que efectui els següents càlculs, donades dues variables “a” i “b” (de tipus int:*/

import java.util.Scanner;

public class Exercici16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce un numero: ");
        int a = scanner.nextInt();

        System.out.println("Introduce un segundo numero:");
        int b = scanner.nextInt();

        System.out.println("Introduce un tercer numero:");
        int c = scanner.nextInt();


        int f1 = (a - b) * (a + b);
        System.out.println("Ej. calc 1 = a^2 - b^2 = " + f1);

        int f2 = (a * a) + (2 * a * b) + (b * b);
        System.out.println("Ej. calc 2 = (a + b)^2" + f2);

        int f3 = ((a + b) * (a + b)) - 2 * a * b;
        System.out.println("Ej. calc 3 = a^2 + b^2 = " + f3);

        int f4 = (a * a) - 2 * a * b + (b * b);
        System.out.println("Ej. calc 4 = a^2 - b^2 = " + f4);

        int f5 = (a * a) + (b * b) + (c * c) + 2 * a * b + 2 * b * c + 2 * c * a;
        System.out.println("Ej. calc 5 = (a + b + c)^2 = " + f5);

        int f6 = (a * a) + (b * b) + (c * c) - 2 * a * b - 2 * b * c - 2 * c * a;
        System.out.println("Ej. calc 6 = (a - b - c)^2 = " + f6);

        int f7 = (a * a * a) + 3 * a * a * b + 3 * a * b * b + (b * b * b);
        System.out.println("Ej. calc 7 = (a + b)^3 = " + f7);

        int f8 = (a * a * a) - 3 * a * a * b + 3 * a * b * b - (b * b * b);
        System.out.println("Ej. calc 8 = (a - b)^3 = " + f8);

        int f9 = (a - b) * (a * a + a * b + b * b);
        System.out.println("Ej. calc 9 = a^3 - b^3 = " + f9);

        int f10 = (a + b) * (a * a - a * b + b * b);
        System.out.println("Ej. calc 10 = a^3 + b^3 = " + f10);

        int f11 = (a*a*a*a) + 4 * (a*a*a) * b + 6 * (a*a) * (b*b) + 4 * a * (b*b*b) + (b*b*b*b);
        System.out.println("Ej. calc 11 = (a + b)^4 = " + f11);

        int f12 =  (a*a*a*a) - 4 * (a*a*a) * b + 6 * (a*a) * (b*b) - 4 * a * (b*b*b) + (b*b*b*b);
        System.out.println("Ej. calc 12 = (a - b)^4 = " + f12);

        int f13 = (a - b) * (a + b) * (a * a + b * b);
        System.out.println("Ej. calc 13 = a^4 - b^4 = " + f13);

    }
}
