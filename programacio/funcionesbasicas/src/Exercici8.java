/*
Codi actual:
double base = 5;
double altura = 10;
double area = (base * altura) / 2;
System.out.println("L'àrea del triangle és: " + area);

Objectiu: Refactoritza el codi creant una funció anomenada areaTriangle que calculi
l'àrea d'un triangle donada la base i l'altura. Demana a l'usuari que introdueixi aquests valors
i mostra el resultat de la funció.*/

import java.util.Scanner;

public class Exercici8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce la base: ");
        double base = scanner.nextDouble();

        System.out.print("Introduce la altura: ");
        double altura = scanner.nextDouble();

        double area = areaTriangle(base,altura);
        System.out.println("L'àrea del triangle és: " + area);

    }
    public static double areaTriangle (double b, double a){
        double res = (b*a)/2;
        return res;


    }
}
