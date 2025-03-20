/*9- Dibuixa el següent gràfic. Paràmetres: longitud de costat i número de triangles.*/

import java.util.Scanner;

public class Exercici9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introdueix el nombre de triangles: ");
        int nTriangle = scanner.nextInt();

        System.out.print("Introdueix la longitud dels costats: ");
        int costat = scanner.nextInt();


        double alfa = (360d / nTriangle);
        double beta = alfa / 2;
        double sinus = (Math.sin(beta*Math.PI / 180d));
        double gamma = 180 - 90 - beta;
        double hipotenusa = (costat/2d) / sinus;

        Turtle t = new Turtle(500,500);
        double gir = 0;

        for (int i = 0; i <= nTriangle; i++) {
            dibuixaTriangle(t, hipotenusa, costat, gamma);
            t.resetAngle();
            t.turnRight((int) gir);
            gir += alfa;
        }
        t.show();
    }
    public static void dibuixaTriangle (Turtle t, double hip, int costat, double gamma){
        t.forward((int)hip);
        t.turnRight((int) (180 - gamma));
        t.forward(costat);
        t.turnRight((int) (180 - gamma));
        t.forward((int) (hip));
    }
}
