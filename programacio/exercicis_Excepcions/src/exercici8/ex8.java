/*8- Crea una classe amb dos mètodes: f() i g(). Al mètode g(), llança una excepció d'un nou tipus que
tu mateix defineixes. Al mètode f() crida a g(), captura l'excepció i llança una excepció distinta
(d'un segon tipus que també defineixes tu mateix). Testeja el teu codi dins una funció «main()».*/


package exercici8;

class MyException1 extends Exception {}
class MyException2 extends Exception {}


public class ex8 {
    public static void main(String[] args) {
        try {
            f();
        } catch (MyException2 e) {
            System.out.println("Excepció MyException2 capturada al main()");
        }
    }

    static void f() throws MyException2 {
        try {
            g();
        } catch (MyException1 e) {
            System.out.println("Excepció MyException1 capturada dins f()");
            throw new MyException2();
        }
    }

    static void g() throws MyException1 {
        throw new MyException1();
    }
}