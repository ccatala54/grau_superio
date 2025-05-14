/*9- Repeteix l'exercici anterior, però dins la clàusula «catch», llança una RuntimeException.*/

package exercici9;

class MyException1 extends RuntimeException {}
class MyException2 extends RuntimeException {}
public class ex9 {
    public static void main(String[] args) {
        try {
            f();
        } catch (MyException2 e) {
            System.out.println("MyException2 capturada al main()");
        }
    }
    static void f() {
        try {
            g();
        } catch (MyException1 e) {
            System.out.println("MyException1 capturada dins f()");
            throw new MyException2(); // Llancem una nova RuntimeException
        }
    }
    static void g() {
        throw new MyException1(); // Llancem la primera RuntimeException
    }
}