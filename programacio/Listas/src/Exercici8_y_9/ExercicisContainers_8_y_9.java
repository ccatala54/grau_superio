/*
8- Anem a comprovar el rendiment de ArrayList front a LinkedList per accessos aleatoris:
List<Integer> l1 = new ArrayList<Integer>();
fill(l1);
List<Integer> l2 = new LinkedList<Integer>();
fill(l2);
test(l1);
test(l2);
La vostra tasca és implementar els procediments «fill», que agafa una llista i hi inserta 5 milions
d'elements aleatoris (empreu java.util.Random), i també el procediment «test», que el que fa és
accedir als elements de la llista de manera aleatòria 1000 vegades. Pista: utilitzeu el procediment
«System.currentTimeMillis()» per controlar el temps d'execució.

9- De manera simil·lar a l'exercici anterior, comprova la diferència de rendiment entre ArrayList i
LinkedList per les operacions d'inserir i esborrar elements pel mig de la llista.
*/

package Exercici8_y_9;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ExercicisContainers_8_y_9 {
    public static void main(String[] args) {
        List<Integer> l1 = new ArrayList<Integer>();
        fill(l1);
        List<Integer> l2 = new LinkedList<Integer>();
        fill(l2);
        test(l1);
        test(l2);
        System.out.println("-------------------");

        //Exercici 9
        test2(l1);
        test2(l2);
    }
    static void fill (List<Integer> list){
        //Hem d'emplenar la llista amb 5 millons d'elements
        for (int i = 0; i < 5000000; i++) {
            list.add ((int) (Math.random()*10000000));
        }
    }

    static void test (List<Integer> list){
        long t1 = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            int index = (int) (Math.random()*list.size());
            Integer element = list.get(index);
        }
        long t2 = System.currentTimeMillis();
        System.out.println("Temps: " +( t2 - t1));
    }

    //Exercici 9
    static void test2 (List<Integer> list){
        long t1 = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
           list.remove(0);
        }
        long t2 = System.currentTimeMillis();
        System.out.println("Temps: " +( t2 - t1));
    }


}

