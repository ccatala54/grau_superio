import java.util.Arrays;

public class ardos {
    public static void main(String[] args){

        int [] ar = {5, 7, 4, 1, 9, -6, 4, 2};
        ordenacioGRanera(ar);
        System.out.println(Arrays.toString(ar));
    }
    static void ordenacioGRanera (int []ar){
        int rigth =ar.length -1;
        int left = 0;
        while (left<rigth){
            for (int i = left; i < rigth; i++) {
                if (ar[i] > ar [i+1]){
                    int t = ar[i];
                    ar[i] =  ar[i+1];
                    ar[i+1] = t;
                }

            }
            rigth = rigth -1;
            System.out.println(Arrays.toString(ar));

            for (int i = rigth; i >= left; i--) {
                if (ar[i] > ar [i+1]){
                    int t = ar[i];
                    ar[i] =  ar[i+1];
                    ar[i+1] = t;
                }

            }
            left = left +1;
            System.out.println(Arrays.toString(ar));
        }
    }
}
