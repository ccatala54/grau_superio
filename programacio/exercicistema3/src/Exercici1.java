//Exercici 1: Sumar les xifres d'un número utilitzant while
/*Escriu un programa que demani un número a l'usuari i sumi totes les seves xifres utilitzant
un bucle while. Per exemple, si l'usuari introdueix 123, el programa ha de retornar 6 (1 + 2
+ 3).*/

import java.util.Scanner;

public class Exercici1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un numero: ");
        int num = scanner.nextInt();

        int div = 1_000_000;
        int suma = 0, cociente = 0, residuo = 0;

        while (div > 0){

            cociente = num / div;
            residuo = num % div;
            suma = suma + cociente;
            num = residuo;
            div = div / 10;
        }
        System.out.println("La suma de los digitos es: " +suma);

    }

}