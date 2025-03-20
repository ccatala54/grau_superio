/*Codi actual:
int a = 3;
int b = 5;
int c = 7;
int suma = a + b + c;
System.out.println("La suma dels nombres és: " + suma);

Objectiu: Refactoritza el codi creant una funció anomenada sumaTresNumeros que calculi
la suma de tres nombres. Demana a l'usuari que introdueixi aquests tres nombres i mostra
el resultat de la funció.*/

import java.util.Scanner;

public class Exercici5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un numero: ");
        int a = scanner.nextInt();

        System.out.print("Introduce un segundo numero: ");
        int b = scanner.nextInt();

        System.out.print("Introduce un tercer numero: ");
        int c = scanner.nextInt();

        int suma = sumaTresNumeros(a, b, c);
        System.out.println("La suma és " +suma);
    }
    public static int sumaTresNumeros (int num1, int num2, int num3){
        int resultat = num1+num2+num3;

        return  resultat;
    }

}
