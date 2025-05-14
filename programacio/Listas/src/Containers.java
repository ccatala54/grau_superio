import java.util.*;

public class Containers {
    public static void main(String[] args) {
        System.out.println("--- LListes1 ---");
        llistes1();
        System.out.println("--- Iterators ---");
        iterators();
        System.out.println("--- Cua ---");
        cues();
        System.out.println("--- Piles ---");
        piles();
        System.out.println("--- Conjunts ---");
        conjunts();
        System.out.println("--- Mapes ---");
        mapes();

    }

    static void llistes1() {
        // Crea llista d'enters anomenada "l1"
        List<Integer> l1 = new ArrayList<>();

        // Afegeix els números 10, 20 i 15
        Collections.addAll(l1, 10,20,15);

        // Imprimeix la llista

        System.out.println(l1);

        // Elimina el segon element
        l1.remove(1);

        // Imprimeix la llista
         System.out.println(l1);

        // Crea llista d'enters anomenada "l2"
        List<Integer> l2 = new ArrayList<>();

        // Afegeix els números 3, 6 i 9
        Collections.addAll(l2, 3,6,9);

        // Afegeix la llista l1 a la llista l2
        l2.addAll(l1);

        // Imprimeix la llista l2
        System.out.println(l2);

        // Elimina tots els valors de l1
        l1.clear();

        // Afegeix els tres primers elements de l2 a l1
        l1.addAll(l2.subList(0,3));
        /*
        l1.add(l2.get(0));
        l1.add(l2.get(1));
        l1.add(l2.get(2));
*/
        // Comprova si dins l1 hi ha el número 6
        System.out.println(l1.contains(6));
         //System.out.println(l1);

        // Afegeix el numero 6 un altre cop a l1 al principi de la llista
        l1.addFirst(6);
            //l1.add(0,6);

        // Cerca la posicio de l'element que te el numero 9 a la llista l1
        System.out.println(l1.indexOf(9));

        // A l1, substitueix l'element a la posició 1 per el valor 5

        l1.set(1, 5);

        // A l1, insereix a la posició 2 l'element 4

        l1.add(2, 4);

        // Imprimeix la llista l1
        System.out.println(l1);

        // Converteix l1 a array i imprimeix-ho
        Integer[] ar = new Integer[l1.size()];
        for (int i = 0; i < l1.size(); i++) {
            ar[i] =l1.get(1);
        }
      //Integer [] ar1 = l1.toArray(new Integer[0]);

    }

    static void iterators() {
        // Crea llista d'enters anomenada "l1"
        List<Integer> l1 = new ArrayList<>();

        // Afegeix a l1 els elements 10, 20, 50 i 90
        Collections.addAll(l1, 10,20,50, 90);

        // Treu Iterator (it)
        Iterator<Integer> it = l1.iterator();

        // Mentre hi hagi element següent, imprimeix l'element


        while (it.hasNext()){
            System.out.println(it.next());
        }            System.out.println("----------------------");


        // Torna a crear l'objecte iterator i has de recórrer la llista, però has d'esborrar l'element "50"
        it = l1.iterator();
        while (it.hasNext()){
            int el = it.next();
            if (el == 50){
                it.remove();
            }
        }
        // Imprimeix la llista
        System.out.println(l1);

        // Crea un ListIterator de la llista l1 (anomenat "li")
        ListIterator<Integer> li = l1.listIterator();

        // Avança l'iterador fins al final de la llista
        while (li.hasNext()) li.next();

        // Recorre la llista al reves amb l'iterador, imprimint els elements
        while (li.hasPrevious()){
            System.out.println(li.previous());
        }

        // Torna a recorrer la llista amb l'iterador, pero aquest cop imprimeix tambe l'index de l'element
        while (li.hasNext()){
            int index = li.nextIndex();
            int element = li.next();
            System.out.printf("Indez: %d, element: %d\n", index, element);
        }
    }

    static void cues() {
        // Declara una cua (anomenada "cua") com una LinkedList
        Queue<Integer> queue = new LinkedList<>();

        // Afegeix els elements 12, 14 i 99 a la cua
        queue.offer(12);
        queue.offer(14);
        queue.offer(99);

        // Mostra el primer element (sense treurer-lo) de la cúa i imprimeix-ho
        System.out.println(queue.peek());

        // Treu el primer element de la cúa
        int first = queue.poll();
        
        // Imprimeix la cúa
        System.out.println(queue);

        // Declara una cúa de prioritat anomenada "cuaPrioritat"
        PriorityQueue<Integer> cuaProritat = new PriorityQueue<>();

        // Afegeix els elements 5, 2, -1, 9 i 7
        cuaProritat.offer(5);
        cuaProritat.offer(2);
        cuaProritat.offer(-1);
        cuaProritat.offer(9);
        cuaProritat.offer(7);

        // Imprimeix la cúa
        System.out.println(cuaProritat);

        // Fes un bucle que vagi traient cada element i l'imprimeixi de la cúa de prioritat, mentre en quedin
        while (!cuaProritat.isEmpty()){
            int elem = cuaProritat.poll();
            System.out.println(elem);
        }
    }

    static void piles() {
        // Declara una pila (stack) com una LinkedList
        LinkedList<Integer> stack = new LinkedList<>();

        // Push a la pila dels valors 15, 56, 21 i -5
        stack.push(15);
        stack.push(56);
        stack.push(21);
        stack.push(-5);

        // Imprimeix la pila
        System.out.println(stack);

        // Imprimeix el valor de damunt la pila, sense treurer-lo
        System.out.println(stack.peekLast());

        // Treu i imprimeix els valors de la pila
        while (!stack.isEmpty()){
            int elem = stack.pop();
            System.out.println(elem);
        }
    }

    static void conjunts() {
        // Declara un conjunt d'enters anomenat "set"
        Set<Integer> set = new HashSet<>();

        // Afegeix els elements 14, 6 i 3
        set.add(14);
        set.add(6);
        set.add(3);

        // Imprimeix el conjunt
        System.out.println(set);

        // Afegeix l'element 6 un altre cop
        set.add(6);

        // Imprimeix el conjunt
        System.out.println(set);


        // Construeix un conjunt de caràcters anomenat set2 (Usa la class Character, no char)
        // i introdueix totes les lletres de la paraula "ESTERNOCLEIDOMASTOIDEO"
        // Després, imprimeix el conjunt
        Set<Character> set2 = new HashSet<>();
        String s= "ESTERNOCLEIDOMASTOIDEO";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            set2.add(c);
        }

        // Empra un iterador (it) per recórrer tot el conjunt de caràcters anterior i imprimeix element a element
        Iterator<Character> it = set2.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }

    static void mapes() {
        // Construeix un mapa (map) que associi un String amb un altre String
        Map<String, String> map = new HashMap<>();
        // Introdueix el parell: "RENAULT" - "CLIO"
        map.put("RENAULT","CLIO");
        // Introdueix el parell: "VOLKSWAGEN" - "GOLF"
        map.put("VOLKSWAGEN","GOLF");
        // Introdueix el parell: "PEUGEOT" - "308"
        map.put("PEUGEOT","308");
        // Introdueix el parell: "HONDA" - "CIVIC"
        map.put("HONDA","CIVIC");
        // Introdueix el parell: "PEUGEOT" - "RCZ"
        map.put("PEUGEOT","RCZ");

        // Imprimeix el mapa
        System.out.println(map);

        // Treu el conjunt de claus del mapa (variable kset)
        Set<String> kset = map.keySet();

        // Imprimeix aquest conjunt
        System.out.println(kset);

        // Treu el valor de la clau "PEUGEOT" i imprimeix-ho
        String valor = map.get("PEUGEOT");
        System.out.println(valor);

        // Mitjançant un iterador, imprimeix tots els parells clau-valor del mapa
        Iterator<String> it = kset.iterator();
        while (it.hasNext()){
            String k = it.next();
            String v = map.get(k);
            System.out.printf("%s -> %s\n", k, v);        }

        // Empra un mapa que associi un caràcter a un número enter per dur el compte
        // de quantes vegades surt cada lletra a la paraula "ESTERNOCLEIDOMASTOIDEO"
        Map<Character, Integer> map2 = new HashMap<>();
        String s = "ESTERNOCLEIDOMASTOIDEO";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!map2.containsKey(c)){
                map2.put(c,1);
            }else {
                int count = map2.get(c);
                map2.put(c, count+1);
            }

        }
        System.out.println(map2);

    }
}
