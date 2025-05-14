/*2- Defineix una variable que tingui una referència a un objecte null. Prova de cridar un mètode de
l'objecte a través d'aquesta variable. Ara envolta el codi amb una clàusula try-catch per capturar
l'excepció*/

package exercici2;
import java.util.Scanner;
public class ex2 {
    public static void main(String[] args) {
        try {
            Scanner scanner = null;
            scanner.nextLine();
        } catch (NullPointerException e) {
            System.out.println("Punter Null");
        }
        System.out.println("Sigue funcionando");
    }
}
