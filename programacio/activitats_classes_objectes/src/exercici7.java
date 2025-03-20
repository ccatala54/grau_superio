/*7- Escriu una classe anomenada «Baralla» que conté un joc complet de cartes (espanyoles).*/

import java.util.Arrays;

public class exercici7 {
        public static void main(String[] args) {
        }
    }
    class Baralla {
        Carta[] cartas = new Carta[48];

        Baralla() {

            int cont = 0;
            Carta.Tcoll[] totsElsColls = Carta.Tcoll.values();
            Carta.Tnum[] totsElsNums = Carta.Tnum.values();
            for (int coll = 0; coll < 4; coll++) {
                for (int num = 0; num < 12; num++) {
                    this.cartas[cont] = new Carta(totsElsColls[coll], totsElsNums[num]);
                    cont++;
                }
            }
        }
    }


/*int cont = 0;

        for (int coll = 0; coll < 4; coll++) {
            for (int num = 0; num < 12; num++) {
                baralla[cont] = new Carta(tranformaNUMaCOLL(coll), tranformaNUMaNUMCARTA(num));
           cont++;
            }

        }
        System.out.println(Arrays.toString(baralla));
    }
    static Carta.Tcoll tranformaNUMaCOLL(int num){
        if (num == 0) return Carta.Tcoll.OROS;
        if (num == 1) return Carta.Tcoll.COPES;
        if (num == 2) return Carta.Tcoll.BASTOS;
        if (num == 3) return Carta.Tcoll.ESPASES;
        throw new RuntimeException("Coll no vàlid");

    }

    static Carta.Tnum tranformaNUMaNUMCARTA(int num){
        if (num == 0) return Carta.Tnum.AS;
        if (num == 1) return Carta.Tnum.DOS;
        if (num == 2) return Carta.Tnum.TRES;
        if (num == 3) return Carta.Tnum.QUATRE;
        if (num == 4) return Carta.Tnum.CINC;
        if (num == 5) return Carta.Tnum.SIS;
        if (num == 6) return Carta.Tnum.SET;
        if (num == 7) return Carta.Tnum.VUIT;
        if (num == 8) return Carta.Tnum.NOU;
        if (num == 9) return Carta.Tnum.SOTA;
        if (num == 10) return Carta.Tnum.CAVALL;
        if (num == 11) return Carta.Tnum.REI;
        throw new RuntimeException("Num no vàlid");
    }
}
        */