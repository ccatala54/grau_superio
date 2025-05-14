/*11- Completeu aquest codi perquè funcioni correctament:
import java.util.Random;
public class Main {
static void f() throws Exc1, Exc2, Exc3 {
int i = new Random().nextInt(3);
if (i == 0) throw new Exc1();
if (i == 1) throw new Exc2();
if (i == 2) throw new Exc3();
}
public static void main(String[] args) {
Switch s = new Switch();
s.on();
// Aquesta funció pot generar excepcions
f();
// El mètode «off()» s'ha d'executar sempre!!!
s.off();
}
}
class Switch {
private boolean state = false;
void on() { state = true; System.out.println(this); }
void off() { state = false; System.out.println(this); }
public String toString() { return state ? "on" : "off"; }
}
class Exc1 extends Exception {}
class Exc2 extends Exception {}
class Exc3 extends Exception {}*/

package exercici11;
import java.util.Random;
public class ex11 {
    static void f() throws Exc1, Exc2, Exc3 {
        int i = new Random().nextInt(3);
        if (i == 0) throw new Exc1();
        if (i == 1) throw new Exc2();
        if (i == 2) throw new Exc3();
    }
    public static void main(String[] args) {
        Switch s = new Switch();
        s.on();
        // Aquesta funció pot generar excepcions
        try {
            f();
        }catch (Exception e){
            System.out.println("Exepció!" + e.getClass().toString());
        }finally {
            // El mètode «off()» s'ha d'executar sempre!!!
            s.off();
        }
    }
}
class Switch {
    private boolean state = false;
    void on() { state = true; System.out.println(this); }
    void off() { state = false; System.out.println(this); }
    public String toString() { return state ? "on" : "off"; }
}
class Exc1 extends Exception {}
class Exc2 extends Exception {}
class Exc3 extends Exception {}