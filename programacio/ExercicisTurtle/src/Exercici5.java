/*5- Dibuixa el següent gràfic. Paràmetres: nombre de quadres concèntrics i longitud inicial del
quadre.*/

import java.util.Scanner;

public class Exercici5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Turtle t = new Turtle(500,500);

        System.out.print("Introdueix el nombre de quadrats : ");
        int nQuadrats = scanner.nextInt();

        System.out.print("Introdueix la longitud inicial: ");
        int lonIn = scanner.nextInt();

       for (int i = 0; i < nQuadrats ; i++) {
            quadrat(t, lonIn);
           repeticionsQuadrat(t);
            lonIn = lonIn +20;
        }

        t.show();
        }
        public static void quadrat (Turtle t, int costat){
            for (int i = 0; i < 4 ; i++) {
                t.forward(costat);
                t.turnRight(90);
            }

        }
        public static void repeticionsQuadrat(Turtle t){
            t.setPenDown(false);
            t.turnLeft(90);
            t.forward(10);
            t.turnLeft(90);
            t.forward(10);
            t.setPenDown(true);
            t.turnRight(180);
    }

    }
