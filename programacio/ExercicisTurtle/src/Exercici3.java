/*3- Dibuixa el següent gràfic. Paràmetres: longitud de costat, nombre de quadres en horitzontal i
nombre de quadres en vertical.*/

import java.util.Scanner;

public class Exercici3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Turtle t = new Turtle(500,500);

        System.out.print("Introdueix el nombre de quadrats horitzontals: ");
        int nQuadratsHoritzontal = scanner.nextInt();

        System.out.print("Introdueix el nombre de quadrats verticals: ");
        int nQuadratsVerticals = scanner.nextInt();

        System.out.print("Introdueix el nombre de costat: ");
        int lCost = scanner.nextInt();

        for (int i = 0; i < nQuadratsHoritzontal ; i++) {
            dibuixaColumna(t, lCost, nQuadratsVerticals);
            posicionaPerDibuixarSeguentColumna(t, nQuadratsVerticals,lCost);
        }
        t.show();

    }
    public static void posicionaPerDibuixarSeguentColumna(Turtle t, int nQuadratsVerticals, int costat){
        t.setPenDown(false);
        t.forward(-nQuadratsVerticals*(costat));
        t.turnRight(90);
        t.forward(costat);
        t.turnLeft(90);
        t.setPenDown(true);
    }


    public static void dibuixaColumna(Turtle t, int costat,  int nQuadratsVerticals){
        for (int i = 0; i < nQuadratsVerticals; i++) {
            quadrat(t,costat);
            t.setPenDown(false);
            t.forward(costat);
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