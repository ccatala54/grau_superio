//Exercici 6: Mitjana de qualificacions amb while
/*Escriu un programa que permeti a l'usuari introduir n qualificacions i calculi la mitjana de
totes elles. L'entrada de qualificacions finalitza quan l'usuari introdueix un número negatiu.
Utilitza un bucle while per a aquest exercici.*/

import java.util.Scanner;

public class Exercici6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nota = 0, cont = 0;
        double media = 0;
        while (nota >= 0 ){

            System.out.println("Introduce una nota: ");
            nota = scanner.nextInt();

            if (nota>=0){
            media += nota;
            cont++;
            }
        }
        media = media/cont;
        System.out.println("La media es: " +media );
    }
}
