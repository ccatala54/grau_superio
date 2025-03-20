/*10- Escriu un programa que declari tres variables: a, b i c, amb valors 111, 444, i 8888
respectivament. Efectua a xor b i després el resultat d’aquesta operació xor a.*/

public class Exercici10 {
    public static void main(String[] args) {

        /*int a = 111, b = 444, c = 888, res;

        res = a ^ b;
        System.out.println("Resultado al ejecutar el XOR entre 'a' y 'b' " +res);

        System.out.println();

        res = res ^ a;
        System.out.println("Resultado al ejecutar el XOR entre el resultado anterior y 'a' " +res);*/

        int a = 111;
        int b = 444;
        int axorb = a ^ b;

        System.out.println("Resultado al ejecutar el XOR entre 'a' y 'b' " +axorb);

        System.out.println();

       int res = axorb ^ a;
        System.out.println("Resultado al ejecutar el XOR entre el resultado anterior y 'a' " +res);

    }
}
