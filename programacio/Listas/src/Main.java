import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        String frase = "hola escola marratxi liceu hola ordinador programa ";
        String[] paraules = frase.split("");
        Set<String> conjunt = new HashSet<>();
        for (int i = 0; i < paraules.length; i++) {
            conjunt.add(paraules[i]);

        }
        System.out.println(conjunt);
        System.out.println(conjunt.size());
    }
/*
      /*  int[] ar = {1, 2, 3, 4};
        ar = growArray(ar, 10000);
        System.out.println(Arrays.toString(ar));

        List<String> noms = new ArrayList<>();
        noms.add("Bill");
        noms.add("Richard");
        noms.add("Tom");
        System.out.println(noms);


        Scanner  scanner = new Scanner(System.in);
        System.out.println("Escriu un numero");
        int n = scanner.nextInt();

        List<Integer> ar =  calculaDivisors(n);
        System.out.println(ar); */

     /*   List<Integer> list =  new ArrayList<>();
        Collections.addAll(list, 1,2,3,4,5,6);
        System.out.println(list);

        int [] ar = {10, 20, 30, 40};
        List<Integer> list2 = Arrays.asList(ar);

        int [] ar2 = new  int[list2.size()];
        for (int i = 0; i < list2.size(); i++) {
            ar2[i] = list2.get(i);

        }

        Integer[] ar3 = new Integer[0];
        ar3 = list2.toArray(ar3);
        System.out.println(Arrays.toString(ar3));


        List<Integer> list =  new ArrayList<>();
        Collections.addAll(list, 1,2,3,4,5,6);



    }
    static List<Integer> calculaDivisors(int n){
        List<Integer> res = new ArrayList<>();
        for (int i = 1; i <=n ; i++) {
            if (n % i == 0){
                res.add(i);
            }
        } return res;
    }
    //aquesta funció crea un nou array de grandària "size"
    //I copia les dades originals dins el nou
/*
    static int[] growArray(int[] ar, int size){
        int[] ar2 = new int[size];
        for (int i = 0; i < ar.length; i++) {
            ar2[i] = ar [i];
        }
        return ar2;
    }*/
}