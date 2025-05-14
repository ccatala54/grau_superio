/*3- Escriu codi que generi i capturi l'excepció ArrayIndexOutOfBoundsException.*/

package exercici3;

public class ex3 {
    public static void main(String[] args) {
        int ar[] = new int[8];
        try{
            numeroArray(ar);
        }catch(IndexOutOfBoundsException e ){
            System.out.println(e.getMessage());
            //Mensaje propio
            System.out.println("Se intenta añadir un valor a una posición que no corresponde al Array");
        }


    }
    static int numeroArray(int[] ar) {
        return ar[12] = 12;
    }
}