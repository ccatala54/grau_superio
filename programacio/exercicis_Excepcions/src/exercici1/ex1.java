/*1- Crea una classe amb un mètode main() que llança un objecte de tipus Exception dins un bloc
«try». Passa al constructor un String qualsevol. Captura l'excepció dins una clàusula «catch» i
imprimeix l'argument String. Afegeix una clàusula «finally» i imprimeix un missatge per assegurar-
te que s'executa.*/

package exercici1;

public class ex1 {
    public static void main(String[] args) {
        try {
            funcio();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }finally {
            System.out.println("Se ha ejecutado el último apartado de 'finaly'");
        }
    }

    static void funcio() throws Exception {
        throw new Exception("Prueba excepción");
    }

}
