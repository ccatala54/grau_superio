/*13- Fes un programa que calculi la distància entre dos punts (en un espai bidimensional). Cada
punt ve donat per dos números (coordenada x i coordenada y)*/


public class Exercici13 {
    public static void main(String[] args) {

        //Primer punto
        double x1 = 8;
        double y1 = 10;

        //Segundo punto
        double x2 =-5;
        double y2 =-9;

        double deltax = x2 -x1;
        double deltay = y2 - y1;

        double dist = Math.sqrt(deltax*deltax + deltay*deltay);
        System.out.println(dist);
    }
}
