/*Codi actual:
int a = 5;
int b = 10;
int suma = a + b;
System.out.println("La suma és: " + suma);

Objectiu: Refactoritza el codi creant una funció anomenada suma que calculi la suma de
dos nombres. Demana a l'usuari que introdueixi aquests dos nombres i mostra el resultat de
la funció.*/

import java.util.Scanner;

public class Exercici1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un numero: ");
        int a = scanner.nextInt();
        System.out.print("Introduce un segundo numero: ");
        int b = scanner.nextInt();
        int suma = sumar(a, b);
        System.out.println("La suma és " +suma);
    }
    public static int sumar (int num1, int num2){
      int resultat = num1+num2;

      return  resultat;
    }
}
