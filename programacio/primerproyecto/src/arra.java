import java.util.Arrays;

public class arra {
    public static void main(String[] args) {
      /*  int notA1 = 6;
        int notA2 = 8;
        int notA3= 10;

        double mitjana = (notA1 + notA2 + notA3) / 3d;*/

        int [] notes = new int[30];
        //Declarar una tabla o array de 30 elementos, donde ada elemento de la tabla es int

        notes[0] = 5;
        notes[1] = 7;
        notes[2] = 10;
        notes[29] = 5;

        int[] notes2 = notes;

        notes2[3] = 100;


        /*Una tabla de String a on cada elemento es un String*/

        String[] paraules = new String[3];
        paraules[0] ="Hola";
        paraules[1] ="liceu";
        paraules[2] ="sol";

        double mitjana = calculaMitjana(notes);
        System.out.println(mitjana);
        System.out.println(Arrays.toString(notes));


        /*Para imprimir una array necesitamos llamar la funcion "Arrays.toString"*/


    }
    public static double calculaMitjana (int[] ar){
        int suma = 0;
        for (int i = 0; i < ar.length; i++) {
            suma = suma + ar[i];
        }
        double mitjana = suma / (double) ar.length;
        return mitjana;
    }


    }

