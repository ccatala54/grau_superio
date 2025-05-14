/*7- Crea les classes «Cat» i «Dog». Ara crea una llista on es pugui inserir objectes de les dues classes
següents. Fes un bucle on es tregui element per element i indiqui si es tracta d'un «Cat» o un «Dog».*/

package Exercici7;
import java.util.ArrayList;
import java.util.List;

public class ExercicisContainers_7 {
    public static void main(String[] args) {
        List<Animal> list = new ArrayList<>();
        list.add(new Dog("fido"));
        list.add(new Cat("fluffy"));
        list.add(new Dog("jack"));
        list.add(new Cat("miau"));
        list.add(new Dog("jerry"));
        list.add(new Cat("tom"));
        for (Animal animal: list){
            System.out.println(animal);

            if (animal instanceof Dog){ //instanceof Es per si volem tria una classe especifica
                System.out.println("WOOF");
            }
            if (animal instanceof Cat){
                System.out.println("MEWOOOOW");
            }
        }
    }
}
class Animal{

}

class Cat extends Animal{
    String name ;

    Cat(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
}
class Dog extends Animal{
    String name ;

    Dog(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                '}';
    }
}