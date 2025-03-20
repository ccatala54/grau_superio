//Exercici 10: Piràmide de números amb for
/*Escriu un programa que generi una piràmide de números com la següent, on n és el nombre
de files (introduït per l'usuari):
1
22
333
4444
...
nnnnn...n (n vegades)

Cada fila i ha de contenir el número i repetit i vegades. Utilitza un bucle for per
aconseguir-ho.*/

import java.util.Scanner;

public class Exercici10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un numero: ");
        int pira = scanner.nextInt();

        for (int contNum = 1; contNum <= pira; contNum++) {
            System.out.println();

            for (int j = 1; j <= contNum ; j++) {
                System.out.print(contNum);
            }
        }
    }
}
