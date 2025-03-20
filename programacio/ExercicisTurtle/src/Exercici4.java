/*4- Dibuixa el següent gràfic. Paràmetres: número de «fulles», longitud de la fulla.*/

import java.util.Scanner;

public class Exercici4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Turtle t = new Turtle(500,500);

        System.out.print("Introduce el nombre de fulles: ");
        int fulles = scanner.nextInt();

        System.out.print("Introdueix la longitut de la fulla: ");
        int lFull = scanner.nextInt();

        int hipotenusa = (int) Math.sqrt((lFull * lFull) + (lFull * lFull));

        for (int i = 0; i < fulles; i++) {
            abrepujada(t, lFull, hipotenusa, fulles);
            abrebaixada(t, lFull, hipotenusa, fulles);
            break;
        }
        t.show();
    }

    public static void abrepujada(Turtle t, int costFulla, int hip, int fulla) {
        t.forward(costFulla);
        t.turnLeft(90);
        t.forward(costFulla);
        t.turnRight(135);
        t.forward(hip);
        for (int i = 0; i < fulla - 1; i++) {
            t.turnLeft(135);
            t.forward(costFulla);
            t.turnRight(135);
            t.forward(hip);
        }
        t.forward(hip);
        t.turnLeft(135);
    }

    public static void abrebaixada(Turtle t, int costFulla, int hip, int fulla) {
        t.turnRight(225);
        t.forward(hip);
        t.forward(hip);
        for (int i = 0; i < fulla - 1; i++) {
            t.turnRight(135);
            t.forward(costFulla);
            t.turnRight(225);
            t.forward(hip);
        }
        t.turnRight(135);
        t.forward(costFulla);
        t.turnRight(-90);
        t.forward(costFulla);
    }
}