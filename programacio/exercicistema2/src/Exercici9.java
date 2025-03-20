/*9- Escriu un programa que efectui una operació bit a bit AND amb els números hexadecimals EE7A
i CAF3*/

public class Exercici9 {
    public static void main(String[] args) {

       /* int a = 0xEE7A & 0xCAF3;

        System.out.println("Resultado: " +a);*/

        int a = 0xEE7A;
        int x = 0xCAF3;
        int and = a & x;
        System.out.println(Integer.toBinaryString(a));
        System.out.println(Integer.toBinaryString(x));
        System.out.println(Integer.toBinaryString(and));

    }
}
