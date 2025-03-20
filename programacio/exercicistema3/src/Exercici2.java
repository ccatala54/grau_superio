//Exercici 2: Generar una sèrie de números utilitzant for

/*Crea un programa que imprimeixi els primers n números de la sèrie: 1, 4, 9, 16,
25... (és a dir, els quadrats dels números naturals), on n és un número introduït per
l'usuari. Utilitza un bucle for.*/


import java.util.Scanner;

public class Exercici2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un numero: ");
        int n = scanner.nextInt();
        System.out.println("La serie de numeros de " +n +" es: ");
        for (int i = 1; i<=n ;i++){

            System.out.print((i*i) + ", ");
        }
    }
}
