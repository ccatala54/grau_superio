/*
1- Tenim una classe anomenada «Sequence»:
class Sequence {
private int[] data = {1,5,6,7,-1,2};
}
Volem que aquesta classe funcioni amb el següent codi (Pista: implementeu la interfície «Iterable»):

for(Integer i: Sequence) {
System.out.println(i);
}
*/


import javax.sound.midi.Sequence;
import java.util.Iterator;

public class ExercicisContainers {
    public static void main(String[] args){
        Sequencea sequence = new Sequencea();
        /*for (Integer i: sequence){
            System.out.println(i);
        }*/
        Iterator<Integer> it = sequence.iterator();
        while (it.hasNext()){
            int n = it.next();
            System.out.println(n);
        }
    }
}

class Sequencea implements Iterable<Integer>{
    private int[] data = {1,5,6,7,-1,2};
    int pos = 0;

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            @Override
            public boolean hasNext() {
                if (pos >= data.length) return false;
                return true;
            }

            @Override
            public Integer next() {
                int tpm = data[pos];
                pos++;
                return tpm;
            }
        };
    }
}
