/*10- Dibuixa el següent gràfic.*/

public class Exercici10 {
    public static void main(String[] args) {

        Turtle t = new Turtle(500, 500);

        int gir = 130;
        t.forward(gir);

        semiCercle1(t, gir);
        t.resetAngle();
        t.goTo(0,0);
        semiCercle2(t);
        t.show();

    }
    public static void semiCercle1(Turtle t, int gir) {
        t.turnRight(90);
        for (int i = 0; i < 20; i++) {
            t.forward(5);
            t.turnRight(5);
        }
       t.resetAngle();
       t.turnLeft(90);
       t.forward(gir-10);
    }
   public static void semiCercle2(Turtle t) {
        t.turnLeft(90);
       for (int i = 0; i < 20; i++) {
           t.forward(5);
           t.turnRight(5);
       }
    }
}
