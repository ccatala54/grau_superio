/*4- Crea una classe anomenada «Country» (el constructor agafarà el nom del país). Ara crea una
llista (ArrayList o LinkedList) anomenada «countryList». Afegeix uns quants objectes a aquesta
llista. Ara crida a «Collections.suffle(countryList)» unes quantes vegades, imprimint la llista cada
vegada.

5- Prova que no es poden afegir objectes de cap altre tipus més que «Country» a la llista anterior.
*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExercicisContainers_4_y_5 {
    public static void main(String[] args) {
        List<Country> countryList = new ArrayList<>();
        countryList.add(new Country("Germany"));
        countryList.add(new Country("France"));
        countryList.add(new Country("USA"));

        countryList.add(new Country("Spain"));
        System.out.println(countryList);
        System.out.println("---------------------");
        Collections.shuffle(countryList);
        System.out.println(countryList);
        System.out.println("---------------------");
        Collections.shuffle(countryList);
        System.out.println(countryList);
        System.out.println("---------------------");
        Collections.shuffle(countryList);
        System.out.println(countryList);
        System.out.println("---------------------");
        Collections.shuffle(countryList);
        System.out.println(countryList);

        //Activitat 5
        /*
        countryList.add(10); //Dona error perque es una llista Country (List<Country>), si no fos aíxi compilaria
        countryList.add("SPAIN");
         */
    }
}
    class Country{
        String name;
        Country(String name){
            this.name = name;
        }

        @Override
        public String toString() {
            return "Country{" +
                    "name='" + name + '\'' +
                    '}';
        }
    }

