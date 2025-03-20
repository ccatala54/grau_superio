/*7- Dibuixa el següent gràfic. Paràmetres: nombre de fulles.*/

import java.util.Scanner;

public class Exercici7 {
    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

        System.out.print("Introdueix el nombre de fulles: ");
    int nFulles = scanner.nextInt();

    Turtle t = new Turtle(500,500);

    int angle =360 / nFulles;
    int gir = 0;

        for (int i = 0; i < nFulles; i++) {
            dibuixaFulla (t);
            t.resetAngle();
            t.goTo(0,0);
            t.turnRight(gir);
            gir += angle;
        }
        dibuixaFulla(t);
        t.show();

}
public static void dibuixaFulla(Turtle t) {
    for (int i = 0; i < 60; i++) {
        t.forward(2);
        t.turnRight(1);

    }

    t.turnRight(120);
    for (int i = 0; i < 60; i++) {
        t.forward(2);
        t.turnRight(1);

    }
}
}