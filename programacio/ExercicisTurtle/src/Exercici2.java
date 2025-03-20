/*2- Dibuixa el següent gràfic. Paràmetres: número d'escalons, píxels totals en vertical i píxels totals
en horitzontal.*/

import java.util.Scanner;

public class Exercici2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Turtle t = new Turtle(500,500);

        System.out.print("Introdueix el nombre de escalons: ");
        int numEsc = scanner.nextInt();

        System.out.print("Introdueix el nombre de pixeles totales en vertical: ");
        int pxTver = scanner.nextInt();

        System.out.print("Introdueix el nombre de pixeles totales en horizontal: ");
        int pxThor = scanner.nextInt();

        t.goTo(-200, 200);
        t.turnRight(90);

        for (int i = 0; i < numEsc; i++) {

            t.forward(pxThor);
            t.turnRight(90);
            t.forward(pxTver);
            t.turnLeft(90);
        }

        t.forward(pxThor);
        t.turnLeft(90);

        for (int i = 0; i < numEsc; i++) {

            t.forward(pxTver);
            t.turnRight(90);
            t.forward(pxThor);
            t.turnLeft(90);

        }

    // Show canvas
        t.show();


    }
}
