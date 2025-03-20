/*8- Fes un petit programa per testejar les classes anteriors. Simplement, creeu un objecte de tipus
«Baralla» i mostreu les cartes que conté.*/

import java.util.Arrays;

public class exercici8 {
    public static void main(String[] args) {

        Baralla baralla = new Baralla();
        mescla(baralla);
        System.out.println(Arrays.toString(baralla.cartas));
    }

    static void mescla(Baralla baralla) {
        for (int i = 47; i > 0; i--) {
            int index = aleatori(i);
            Carta c = baralla.cartas[index];
            baralla.cartas[index] = baralla.cartas[i];
            baralla.cartas[i] = c;

        }
    }

    static int aleatori(int n) {

        return (int) (Math.random() * n);
    }
}

