/*1- Implementa una classe anomenada «QuadratMagic» que tingui un mètode «void imprimeix(int n)» que mostri el quadrat següent (segons la dimensió que passem com a paràmetre):
1 1 1 1 1
1 2 3 4 5
1 3 6 10 15
1 4 10 20 35
1 5 15 35 70
etc...*/

import java.util.Scanner;

public class exercici1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Quina grandaria vols: ");
        int n = scanner.nextInt();
        QuadratMagic quadrat = new QuadratMagic(n);
        quadrat.imprimeix();

    }

}

class QuadratMagic {

    int[][] quadrat;

    QuadratMagic(int size) {
        quadrat = new int[size][size];

        for (int i = 0; i < size; i++) {
            quadrat[0][i] = 1;
            quadrat[i][0] = 1;
        }

        for (int i = 1; i < size; i++) {
            for (int j = 1; j < size; j++) {
                quadrat[i][j] = quadrat[i - 1][j] + quadrat[i][j - 1];
            }
        }
    }

    void imprimeix() {
        int espais = calculaDigits(quadrat[quadrat.length - 1][quadrat.length - 1]);
        for (int i = 0; i < quadrat.length; i++) {
            for (int j = 0; j < quadrat.length; j++) {
                String s = "%-" + espais + "d ";
                System.out.printf(s, quadrat[i][j]);
            }

            System.out.println();
        }
    }


    int calculaDigits(int n) {
        String s = "" + n;
        return s.length();
    }
}