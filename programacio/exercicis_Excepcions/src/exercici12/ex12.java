/*12- Programeu a dins una classe anomenada «Exercici12» un mètode main() on hi hagi la següent
estructura, i comproveu què s'executa.
try {
try {
throw new Exception()
} finally {
...
}
} catch Exception {
...
} finally {
...
}*/

package exercici12;

public class ex12 {
    public static void main(String[] args) {
        try {
            try {
                throw new Exception();
            } finally {
                System.out.println("dins finally1");
            }
        } catch (Exception e) {
            System.out.println("Dins catch");
        } finally {
            System.out.println("Dins finally2");
        }
    }
}
