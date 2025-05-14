/*14- Examina el següent codi, analitza'l, explica per què no funciona i com ho podem arreglar:
public class Main {
public static void main(String[] args) {
Animal a = new Dog();
a.makeSound();
}
}
class muteException extends Exception {}
abstract class Animal {
abstract void makeSound();
}
class Dog extends Animal {
@Override
void makeSound() {
System.out.println("Bark");
}
}
class Cat extends Animal {
@Override
void makeSound() {
System.out.println("Meow");
}
}
class MuteBird extends Animal {
@Override
void makeSound() throws muteException {
throw new muteException();
}
}*/

package exercici14;

public class ex14 {
    public static void main(String[] args) {
        Animal a = new MuteBird();
        try {
            a.makeSound();
        }catch (MuteException m){
            System.out.println("MUTE");
        }

    }
}
class MuteException extends Exception {}
abstract class Animal {
    abstract void makeSound() throws MuteException;
}
class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Bark");
    }
}
class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Meow");
    }
}
class MuteBird extends Animal {
    @Override
    void makeSound() throws MuteException {
        throw new MuteException();
    }
}
