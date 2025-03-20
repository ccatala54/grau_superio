//Exercici 9: Seqüència de Collatz amb while
/*Escriu un programa que demani un número a l'usuari i generi la seqüència de Collatz. La
seqüència de Collatz es defineix així:
● Si el número és parell, es divideix entre 2.
● Si és senar, es multiplica per 3 i se suma 1. El bucle continua fins que el número
sigui 1. Utilitza un bucle while per a aquest exercici.*/

import java.util.Scanner;

public class Exercici9 {
    public static void main(String[] args) {
      /*  Scanner scanner = new Scanner(System.in);

        int num = 0;
        int pos = 0, neg = 0;

        while (num != 1){

            System.out.print("Introduce un numero: ");
            num = scanner.nextInt();

            if (num % 2 == 0) {
                pos = num /2;
                System.out.println(pos);
            }else {
                neg = (num*3)+1;
                System.out.println(neg);
            }

        }*/
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        int pos = 0, neg = 0;

        System.out.print("Introduce un numero: ");
        num = scanner.nextInt();

        while (num != 1) {
            System.out.println(num);

            if ((num & 1) == 0) {
                num = num / 2;
            } else {
                num = (num * 3) + 1;
            }
        }
        System.out.println(num);
    }
}
