/*2- Tenim el següent codi:
Queue<Car> pq = new PriorityQueue<Car>();
pq.offer(new Car("Renault", 15));
pq.offer(new Car("Fiat", 5));
pq.offer(new Car("Mercedes",25));
pq.offer(new Car("Volkswagen", 20));
while (!pq.isEmpty()) {
System.out.println(pq.poll());
}
Implementa la classe «Car». El resultat del codi anterior ha d'ésser que ha d'imprimir els objectes
d'acord amb el valor que es passa juntament amb la marca. És a dir: Fiat, Renault, Volkswagen i
Mercedes. Pista: implementeu la interfície «Comparable».
*/
import java.util.PriorityQueue;
import java.util.Queue;

public class ExercicisContainers_2 {
    public static void main(String[] args) {
        Queue<Car> pq = new PriorityQueue<Car>();
        pq.offer(new Car("Renault", 15));
        pq.offer(new Car("Fiat", 5));
        pq.offer(new Car("Mercedes", 25));
        pq.offer(new Car("Volkswagen", 20));
        while (!pq.isEmpty()) {
            System.out.println(pq.poll());
        }
    }
}

class Car implements Comparable<Car>{ //clase
        String marca;
        int num;

    @Override
    public int compareTo(Car c) {
        if (c.num == this.num) return 0;
        if (c.num > this.num) return -1;
        return 1;
    }

    @Override
    public String toString() {
        return "Car{" +
                "marca='" + marca + '\'' +
                ", num=" + num +
                '}';
    }

    Car (String marca, int num){ //Constructor
            this.marca = marca;
            this.num = num;

        }
}
