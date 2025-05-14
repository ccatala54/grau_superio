/*6- Tenim una classe anomenada «IntList» que serà subclasse de «AbstractList»:
class IntList extends AbstractList {
Integer[] data;
IntList(int[] data) {
...
}
@Override
public Object get(int index) {
...
}
@Override
public int size() {
...
}
}
Completa el següent:
List il = new IntList(new int[]{1,2,3});
// Comprova que el mètode «size()» funciona
// Comprova que es poden treure elements amb «get()»
// Què passa si intento afegir elements (il.add(10))?
// Recórre la llista amb un Iterador
// Comprova si funciona el mètode «contains()»
// Comprova si funciona el mètode «sublist()»
// Comprova si funciona el mètode «remove()»
// Converteix la llista a un Array d'Objects i imprimeix-la
*/

package Exercici6;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;

public class ExercicisContainers_6 {
    public static void main(String[] args) {
        List il = new IntList(new int[]{1,2,3});
        System.out.println(il.size());
        System.out.println(il.get(1));
        System.out.println(il.add(10)); //Al executar-ho torna un error, per arreglarlo hem de fer un Override

        Iterator it = il.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println(il.contains(1));

        List sub = il.subList(1,3);
        for (Object o: sub){
            System.out.println(o);
        }
        il.remove(3);
        System.out.println(il);

        Object[] ar = new Object[0];
        ar = il.toArray();
    }


}

class IntList extends AbstractList {
    Integer[] data;
    IntList(int[] data) {
        this.data = new Integer[data.length]; // Amb el new, cream una nova memoria RAM

        for (int i = 0; i < data.length; i++) {
            this.data[i] = data[i];
        }
    }

    @Override
    public Object remove(int index) {
        Integer[] newData = new Integer[this.data.length-1];
        Integer obj = this.data[index];
        int i1 = 0;
        int i2 = 0;
        while (i1 < this.data.length){
            if (i1 == index){
                i1++;
            }else {
                newData[i2] =this.data[i1];
                i1++;
                i2++;
            }

        }
        this.data = newData;
        return obj;
    }

    @Override
    public boolean add(Object o) {
        //Crea un nou array amb una posiscio més
        Integer[] newData = new Integer[this.data.length+1];
        for (int i = 0; i < this.data.length; i++) {
            newData[i] = this.data[i];
        }
        newData[this.data.length] =(Integer) o;
        //Copia les dades del antic al nou, y en el vuit l'element nou
        this.data = newData; //Elimina la data de la memoria RAM, i posa aquesta informacio, fentla principal
        return true;
    }

    @Override
    public Object get(int index) {
        return this.data[index];
    }
    @Override
    public int size() {
        return this.data.length;
    }
}