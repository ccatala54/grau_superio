/*4- Crea la teva pròpia classe d'excepció generant una subclasse de la classe «Exception». Escriu un
constructor per aquesta classe que accepti un String i l'emmagatzemi internament. Escriu un mètode
per imprimir el missatge. Crea una clàusula «try-catch» per provar que la classe que has programat
funciona correctament.*/

package exercici4;

public class ex4 {
    public static void main(String[] args) {
        try{
            throw new PropioException("Prueba");
        }catch (PropioException e){
            System.out.println(e.getMessage());
        }
    }
}
class PropioException extends Exception {
    private String error;

    public PropioException(String errorMisage) {
        this.error = errorMisage;
    }

    public void printMissage1(){
        System.out.println(this.error);
    }

}
