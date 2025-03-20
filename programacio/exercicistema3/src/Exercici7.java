//Exercici 7: Nombre de termes per superar un valor amb do...while

/*Crea un programa que sumi termes consecutius (1, 2, 3,...) fins que la suma superi un
valor S introduït per l'usuari. Utilitza un bucle do...while per calcular quants termes van
ser necessaris per superar S.*/

import java.util.Scanner;

public class Exercici7 {
    public static void main(String[] args) {
/*        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un numero: ");
        int s = scanner.nextInt();
        int contador = 0, suma = 0;

        do {
            suma += contador++;
            //System.out.println(suma);
        }while (suma<=s);

        System.out.println("La suma final es: " +suma);*/

        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un numero: ");
        int s = scanner.nextInt();
        int contador = 1, suma = 0;

        do {
            suma = suma+contador;
            contador++;
        }while (suma<=s);

        System.out.println("Ha tenido que sumar: " +(contador-1) +" terminos");
    }
}
