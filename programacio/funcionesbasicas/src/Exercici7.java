/*String paraula = "radar";
boolean esPalindrom = true;
for (int i = 0; i < paraula.length() / 2; i++) {
if (paraula.charAt(i) != paraula.charAt(paraula.length() - i -
1)) {

esPalindrom = false;
break;
}
}
System.out.println("És un palíndrom: " + esPalindrom);

Objectiu: Refactoritza el codi creant una funció anomenada esPalindrom que determini si
una paraula és un palíndrom. Demana a l'usuari que introdueixi la paraula i mostra el
resultat de la funció.*/

import java.util.Scanner;

public class Exercici7 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.print("Introduce una palabra: ");
        String paraula = scanner.nextLine();
        if (esPalindrom(paraula)){
            System.out.println("La paraula és palindroma");
        }
        else {
            System.out.println("No és palindroma");
        }

    }
    public static boolean esPalindrom (String p){

        for (int i = 0; i < p.length() / 2; i++) {
            if (p.charAt(i) != p.charAt(p.length() - i -
                    1)) {
                return false;
            }
        }
        return true;
    }
}
