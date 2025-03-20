import java.util.Arrays;

public class Aun {
    public static void main(String[] args){
    /*    int [] ar = {5,6,7,8, 4, 3};
        */
        int [] ar = generaArray(10_000);
        long millis = System.currentTimeMillis();
      //  bubblesort(ar);
        long delta = System.currentTimeMillis() - millis;
        System.out.println("Has tardat " +delta +" ms");
        System.out.println(Arrays.toString(ar));
    }
   static int [] generaArray(int limit){
        int[] ar = new  int[limit];
       for (int i = 0; i < limit; i++) {
           ar[i]=(int) (Math.random()*10_000);

       }
       return ar;
   }
    static void bubblesort(int[] ar){
        //Ordenar, de menor a major
        // els numeros que hi ha dins la taula "ar"

        for (int j = ar.length-1; j > 0 ; j--) {
            for (int i = 0; i < j; i++) {
                if (ar[i] > ar [i+1]){
                    int t = ar [i];
                    ar [i] = ar [i+1];
                    ar[i+1] = t;
                }
            }
        }


    }
}
