/*2- Realitza una classe anomenada «Peix», que tingui una variable membre anomenada «nom». Fes
un mètode «setNom(String nom)» i un mètode «getNom()» (que retorna el nom del peix).
Implementa un constructor «còpia», que a partir d'un objecte «Peix» generi un nou objecte «Peix».
Implementa el mètode «public boolean equals(Peix p)» per poder comparar objectes «Peix» i
comprova que funciona correctament. Finalment, a la classe, implementa una variable «count» que
compti quants de peixos hem creat.*/

public class Exercici2 {
    public static void main(String[] args) {

        Peix nemo = new Peix();
        nemo.setNom("Nemo");
        Peix nemoClon = new Peix(nemo);
        Peix clon3 = new Peix(nemo);

        System.out.println("Numero de peixos creats: " +Peix.contador);

        if (nemo.equals(nemoClon)) {
            System.out.println("Son iguals");

        } else {
            System.out.println("Son diferents");
        }
    }
}

class Peix {
    String nom;
    static int contador = 0;

    Peix() {
        contador++;
    }

    Peix(Peix peix) {
        contador++;
        this.nom = peix.getNom();
    }

    void setNom(String nom) {
        this.nom = nom;
    }

    String getNom() {
        return this.nom;
    }

    @Override
    public boolean equals(Object obj) {
        Peix violeta = (Peix) obj;

        if (this.nom.equals(violeta.nom)) return true;
        return false;
    }
}

