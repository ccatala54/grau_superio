/*5- Escriu un bucle «while» que repeteix un bloc de codi fins que no hi ha excepcions.*/
package exercici5;

public class ex5 {
    public static void main(String[] args) {
        int[] ar = {1, 2, 3, 4, 5};
        int index = 10;
        while (index >= 0){
            try {
                System.out.println(ar[index]);

            } catch (ArrayIndexOutOfBoundsException e){
                System.out.printf("Posicio %d no vàlida\n", index);
            }finally {
                index--;
            }
        }
    }
}
