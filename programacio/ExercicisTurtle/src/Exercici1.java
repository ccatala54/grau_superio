/*1- Dibuixa el següent gràfic. Paràmetres: Nombre de quadres en horitzontal, nombre de quadres en
vertical i longitud de costat.*/

import java.util.Scanner;

public class Exercici1 {
    public static void main(String[] args) {
        /**
         Exemple:

         // Create Turtle object
         Turtle t = new Turtle(500,500);

         // Movements
         t.goTo(-100,-100);
         t.forward(200);
         t.turnRight(90);
         t.forward(200);
         t.turnRight(90);
         t.forward(200);
         t.turnRight(90);
         t.forward(200);

         // Show cursor
         t.markCursor();

         // Show canvas
         t.show();

         */
        Scanner scanner = new Scanner(System.in);
        Turtle t = new Turtle(500,500);

        System.out.print("Introdueix el nombre de quadrats horitzontals: ");
        int nQuadratsHoritzontal = scanner.nextInt();

        System.out.print("Introdueix el nombre de quadrats verticals: ");
        int nQuadratsVerticals = scanner.nextInt();

        System.out.print("Introdueix el nombre de costat: ");
        int costat = scanner.nextInt();

        for (int i = 0; i < nQuadratsHoritzontal ; i++) {
            dibuixaColumna(t, costat, nQuadratsVerticals);
            posicionaPerDibuixarSeguentColumna(t, nQuadratsVerticals,costat);
        }
        t.show();

    }
    public static void posicionaPerDibuixarSeguentColumna(Turtle t, int nQuadratsVerticals, int costat){
        t.setPenDown(false);
        t.forward(-nQuadratsVerticals*(costat+costat/2));
        t.turnRight(90);
        t.forward(costat+costat/2);
        t.turnLeft(90);
        t.setPenDown(true);
    }


    public static void dibuixaColumna(Turtle t, int costat,  int nQuadratsVerticals){
        for (int i = 0; i < nQuadratsVerticals; i++) {
            quadrat(t,costat);
            t.setPenDown(false);
            t.forward(costat/2+costat);
            t.setPenDown(true);
        }
    }
    public static void quadrat (Turtle t, int costat){
        for (int i = 0; i < 4; i++) {
            t.forward(costat);
            t.turnRight(90);
}
}
}