/*
Codi actual:
int a = 3;
int b = 9;
int menor;
if (a < b) {
menor = a;
} else {
menor = b;
}
System.out.println("El menor és: " + menor);

Objectiu: Refactoritza el codi creant una funció anomenada menorDeDos que determini
quin és el menor de dos nombres. Demana a l'usuari que introdueixi els dos nombres i
mostra el resultat de la funció.*/

import java.util.Scanner;

public class Exercici10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un numero: ");
        int num1 = scanner.nextInt();

        System.out.print("Introduce un segundo numero: ");
        int num2 = scanner.nextInt();

        int menor = menorDeDos(num1, num2)
        System.out.println("El menor és: " + menor);

    }
    public static int menorDeDos(int a, int b){


    }
}
