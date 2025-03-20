/*Exercici 6
Codi actual:
int any = 2024;
boolean esDeTraspas;
if ((any % 4 == 0 && any % 100 != 0) || (any % 400 == 0)) {
esDeTraspas = true;
} else {
esDeTraspas = false;
}
System.out.println("És any de traspàs: " + esDeTraspas);

Objectiu: Refactoritza el codi creant una funció anomenada esAnyDeTraspas que
determini si un any és de traspàs. Demana a l'usuari que introdueixi l'any i mostra el resultat
de la funció.*/

import java.util.Scanner;

class Exercici6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un año: ");
        int any = scanner.nextInt();

        boolean esDeTraspas = esAnyDeTraspas(any);
        System.out.println("És any de traspàs: " + esDeTraspas);

    }

    public static boolean esAnyDeTraspas(int any) {

        if ((any % 4 == 0 && any % 100 != 0) || (any % 400 == 0)) return true;
        return false;
        //Tambe pot ferse directament: return ((any % 4 == 0 && any % 100 != 0) || (any % 400 == 0));
    }
}
