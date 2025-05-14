/*7- Crea tres sub-classes de la classe «Exception». Escriu una nova classe amb un mètode que les
llanci totes tres, però només empra una sola clàusula «catch» per capturar-les.*/

package exercici7;

import java.util.Scanner;

class EjercicioException1 extends Exception {

}

class EjercicioException2 extends Exception {

}

class EjercicioException3 extends Exception {

}
public class ex7 {
    public static void main(String[] args) {
        try {
            func();

        }catch (Exception e){
            if (e instanceof EjercicioException1){
                System.out.println("ejercicio 1");
            }
            if (e instanceof EjercicioException2){
                System.out.println("ejercicio 2");
            }
            if (e instanceof EjercicioException3){
                System.out.println("ejercicio 3");
            }

        }

    }

    static void func() throws EjercicioException1, EjercicioException2, EjercicioException3 {
        Scanner scanner = new Scanner(System.in);
        System.out.println("¿Que excepción quieres? (1,2,3)");
        int n = scanner.nextInt();
        if (n == 1) {
            throw new EjercicioException1();
        }
        if (n == 2) {
            throw new EjercicioException2();
        }
        if (n == 3) {
            throw new EjercicioException3();
        }
    }
}