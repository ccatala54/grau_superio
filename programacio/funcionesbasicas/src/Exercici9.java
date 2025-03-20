/*Codi actual:
int hores = 2;
int minuts = 30;
int segons = (hores * 3600) + (minuts * 60);
System.out.println("Total en segons: " + segons);

Objectiu: Refactoritza el codi creant una funció anomenada convertirASegons que
converteixi hores i minuts a segons. Demana a l'usuari que introdueixi les hores i els minuts,
i mostra el resultat de la funció.*/

import java.util.Scanner;

public class Exercici9 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.print("Hores: ");
        int hores = scanner.nextInt();
        System.out.print("minuts: ");
        int minuts = scanner.nextInt();
        System.out.print("Segons: ");
        int segons = scanner.nextInt();

        int totalSegons =convertirASegons(hores,minuts, segons);
        System.out.println("Resultat en segons:" +totalSegons);
    }
    public static int convertirASegons (int h, int min, int s){
        int total = s + min*60 + h*3600;
        return total;
    }
}
