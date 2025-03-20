//Exercici 5: Números primers en un rang amb for
/*Crea un programa que mostri tots els números primers entre 1 i n, on n és un número
introduït per l'usuari. Utilitza un bucle for per realitzar-ho.*/

import java.util.Scanner;

public class Exercici5 {
    public static void main(String[] args) {
      /*  Scanner scanner= new Scanner(System.in);

        System.out.println("Mostraremos los numeros entre 2 i el numero que intruduzcas: ");
        int numMax = scanner.nextInt();

        for (int n = 2; n <= numMax ; n++) {
            boolean esPrimero = true;

            for (int i = 2; i < n ; i++) {
                if (n % i == 0){
                    esPrimero = false;
                    break;
                }

            }
            if (esPrimero){
                System.out.println(n + " ");
            }
        }*/

        Scanner scanner= new Scanner(System.in);
        System.out.println("Mostraremos los numeros entre 2 i el numero que intruduzcas: ");

        int numMax = scanner.nextInt();

        for (int n = 2; n <= numMax ; n++) {
            //Tenemos que decidir si n es primo o no, si lo es mostramos, sino, pasamos al siguiente

            boolean esPrimer = true;
            for (int i = 2; i < n ; i++) {
                if (n % i ==0){
                    esPrimer = false;
                    break;
                }

            }if (esPrimer){
                System.out.println("El numero " +n +" es primo");
            }
            
        }
        
    }
}
