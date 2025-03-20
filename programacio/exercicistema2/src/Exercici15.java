/*15- Fes un programa que escrigui “Hello” i a continuació el vostre nom (a la mateixa línia)*/

import java.util.Scanner;
public class Exercici15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce tu nombre:");
        String nombreCompleto = scanner.nextLine();

        System.out.println("Hello " +nombreCompleto);
        
    }
}
