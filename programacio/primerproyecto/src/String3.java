import java.util.Scanner;

public class String3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       /* System.out.println("Primer string: " );
        String s1 = scanner.nextLine();
        System.out.println("Segundo string: " );
        String s2 = s1.substring(1,3);
        System.out.println(s2);
        boolean sonIguals = s1.contains(s2);
        System.out.println(sonIguals);*/


       /* System.out.println("String: " );
        String s = scanner.nextLine();

        System.out.println("Primer indice: ");
        int i1 =scanner.nextInt();

        System.out.println("Segundo indice: ");
        int i2 =scanner.nextInt();

        String s2 = s.substring(i1, i2);
        System.out.println(s2);*/

      /*  System.out.println("String: " );
        String s = scanner.nextLine();
        s = s.replace("a", "b");
        System.out.println(s);*/

      /*  String nom = "Pere";
        String prof = "Informatica";
        int anysExp = 10;

        double alt = 1.7546545646;

        System.out.printf("Hola %s, professió: %s, exp: %d, alt: %.3f",
                nom,
                prof,
                anysExp,
                alt
        );*/

       /* String a1 = "Teclats";
        double p1 = 10.2;
        String a2 = "Mouse";
        double p2 =9.99;
        String a3 = "Adaptador HDMI";
        double p3 = 12.5;

        System.out.println("Article    |  Preu");
        System.out.printf("%s            |  %.2f",a1, p1);
        System.out.println();
        System.out.printf("%s            |  %.2f",a2, p2);
        System.out.println();
        System.out.printf("%s             |  %.2f",a3, p3);
        System.out.println();

*/
   /*     String srt = "liceu";

        System.out.printf("|%20s| %%", srt);*/

       /* //Demanar un string a l'usuario i imprmirlo girado
        //Ej: liceu --> uecil

        System.out.println("Introduce una palabra: ");
        String pal = scanner.nextLine();

        pal = giraString(pal);
        System.out.println(pal);

    }

    public static String giraString(String s) {
        String res = "" ;
        for (int i = (s.length()-1); i >= 0; i--) {
            res += s.charAt(i);

        }
        return res;
        }*/

/*
        System.out.println("Introduce una palabra: ");
    String pal = scanner.nextLine();

    pal = giraParaula(pal);
        System.out.println(pal);

}
public static String giraParaula (String s){
        boolean entreParaule = true;
        int index = 0;
        String res = "";
        String paraule = "";
        while (index < s.length()){
            char c = s.charAt(index);
            if (!entreParaule){
                paraule += c;
            }
            entreParaule = (c == '');
        }



}

public static String giraString(String s) {
    String res = "" ;
    for (int i = (s.length()-1); i >= 0; i--) {
        res += s.charAt(i);

    }
    return res;*/

   /*     System.out.println("Escriu una paraula: ");
        String paraula = scanner.nextLine();
        boolean esPalidrom = palindrom(paraula);

        if (esPalidrom){
            System.out.printf("La paraula %s és palindrom ", paraula);
        }else {
            System.out.printf("La paraula %s no és palindrom ", paraula);
        }
}
public static boolean palindrom(String s){
        String girat = giraString
}*/


    }

}
