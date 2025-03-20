/*17- Fes un programa que, donades les variables “mes” i “dia” (de tipus int) que representen una
data de naixament d’una persona, emmagatzemi el valor “true” dins la variable “libra” si es
correspon a una data del signe zodiacal libra i el valor “false” si no és així.
Nota: el mes es representa amb un número, corresponent el gener al valor “1” i el desembre al
valor “12”.*/

import java.util.Scanner;

public class Exercici17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce el dia de tu nacimiento:");
        int dia = scanner.nextInt();

        System.out.println("Introduce el mes de tu nacimiento:");
        int mes = scanner.nextInt();

        boolean libra = (dia >= 23 && mes ==9) || (dia <=22 && mes ==10);

        System.out.println(libra);

    }
}
