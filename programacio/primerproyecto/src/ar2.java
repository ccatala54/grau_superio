/*import java.util.Arrays;
import java.util.Scanner;

public class ar2
{
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);

        System.out.println("Introduce cuatas notas quieres introducir: ");
        int cantidad = scanner.nextInt();

        int [] notes = new int[cantidad];

        for (int i = 0; i < notes.length ; i++) {
            System.out.println(" Introduce una nota: ");
            int n = scanner.nextInt();
            notes[i] = n;
        }


        double mitjana = calculaMitjana(notes);
        int max = calculaMax (notes);
        int min = calculaMin (notes);
        System.out.println(mitjana);
        System.out.println(Arrays.toString(notes));



    }
    public static double calculaMitjana (int[] ar){
        int suma = 0;
        for (int i = 0; i < ar.length; i++) {
            suma = suma + ar[i];
        }
        double mitjana = suma / (double) ar.length;
        return mitjana;
    }

    public static int calculaMax (int[] ar){
        int suma = 0;
        for (int i = 0; i < ar.length; i++) {
            suma = suma + ar[i];
        }
        double mitjana = suma / (double) ar.length;
        return mitjana;
    }

    public static int calculaMin (int[] ar){
        int suma = 0;
        for (int i = 0; i < ar.length; i++) {
            suma = suma + ar[i];
        }
        double mitjana = suma / (double) ar.length;
        return mitjana;
    }
}
*/