/*8- Dibuixa el següent gràfic.*/

public class Exercici8 {
    public static void main(String[] args) {
        Turtle t = new Turtle(500, 500);

        int longitud = 100;

        t.turnRight(300);
        triangle2(t, longitud);

        t.show();
    }
    public static void triangle1(Turtle t, int lon) {
        t.setPenDown(true);
        for (int i = 0; i < 3; i++) {
            t.forward(lon);
            t.turnLeft(120);
        }
    }

    public static void triangle2(Turtle t, int lon) {
        for (int i = 0; i < 4; i++) {
            triangle1(t, lon);
            t.turnLeft(90);
        }
    }
}
