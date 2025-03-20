/*6- Dibuixa el següent gràfic. Paràmetres: nombre de voltes de l'espiral i número de costats del
polígon de base.*/

import java.util.Scanner;

public class Exercici6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introdueix el nombre de costats del polígo base: ");
        int nCostatsPol = scanner.nextInt();
        System.out.print("Introdueix el nombre de voltes: ");
        int nVoltes = scanner.nextInt();
        Turtle t = new Turtle(500,500);

        //Moviments
    int costat= 30;
        int angle = 360 / nCostatsPol;
        for (int i = 0; i < nVoltes; i++) {
            for (int j = 0; j < nCostatsPol; j++) {
                    costat +=5;
                t.forward(costat);
                t.turnRight(angle);
            }
        }


        //Show canvas
        t.show();
    }
}
