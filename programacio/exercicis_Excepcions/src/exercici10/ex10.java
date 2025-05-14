/*10- Crea una classe que emmagatzemi 5 números enters (internament dins un Array o una List),
amb un mètode «add», i fes que generi una excepció pròpia quan s'intenta afegir més números.*/

package exercici10;

public class ex10 {
    public static void main(String[] args) {

        try{
            Caixa5 caixa5 = new Caixa5();
            caixa5.add(4);
            caixa5.add(2);
            caixa5.add(1);
            caixa5.add(0);
            caixa5.add(14);
            caixa5.add(10);
        }  catch (Caixa5DesboradaException e){
            System.out.println("Caixa desbordada");
        }
    }




}
class Caixa5DesboradaException extends RuntimeException{

}

class Caixa5{
    int[] contingut = new int[5];
    int index = 0;

    void add (int n){
        if (n >= 5){
            throw new Caixa5DesboradaException();
        }
        contingut[index] =n;
        index++;
    }
}