/*6- Escriu una classe anomenada «Carta» per representar una carta (naip). Cada carta té dues
característiques principals: coll (oros, copes, espases, bastos) i número (de 1 a 12).*/

public class exercici6 {
    public static void main(String[] args){
        Carta asEspases = new Carta(Carta.Tcoll.ESPASES, Carta.Tnum.AS);
        Carta sotaOros = new Carta(Carta.Tcoll.OROS, Carta.Tnum.SOTA);

    }
}

class Carta{

    enum Tcoll {OROS, COPES, BASTOS, ESPASES};

    enum Tnum {AS, DOS, TRES, QUATRE, CINC, SIS, SET, VUIT, NOU, SOTA, CAVALL, REI};

    Tnum num;
    Tcoll coll;

    Carta(Tcoll coll, Tnum num){
        this.coll = coll;
        this.num =num;

    }

    @Override
    public String toString() {
        return "Carta{" +
                "num=" + num +
                ", coll=" + coll +
                '}';
    }
}