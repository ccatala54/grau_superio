/*6- Escriu una classe amb un mètode que llença una excepció del tipus que has creat a l'exercici 4,
sense capturar-la. Observa què diu el compilador/IDE.*/
package exercici6;

import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        try {
            func();
        } catch (Exception e) {
            if (e instanceof ExceptionOne) {
                System.out.println("Excepció 1");
            } else if (e instanceof ExceptionTwo) {
                System.out.println("Excepció 2");
            } else if (e instanceof ExceptionThree) {
                System.out.println("Excepció 3");
            } else {
                System.out.println("Excepció no reconeguda");
            }
        }
    }

    static void func() throws ExceptionOne, ExceptionTwo, ExceptionThree {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quina excepció vols generar? (1/2/3)");

        int n = sc.nextInt();

        switch (n) {
            case 1:
                throw new ExceptionOne();
            case 2:
                throw new ExceptionTwo();
            case 3:
                throw new ExceptionThree();
            default:
                System.out.println("Opció invàlida");
                break;
        }
    }
}

class ExceptionOne extends Exception {}
class ExceptionTwo extends Exception {}
class ExceptionThree extends Exception {}