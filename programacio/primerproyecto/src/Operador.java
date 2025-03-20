import java.util.Scanner;

public class Operador {
  public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      System.out.println("Escriu un numero");
      int num1 = scanner.nextInt();
      System.out.println("Escriu un segon numero");
      int num2 = scanner.nextInt();

      int division = num1/num2;
      int res = num1%num2;
      System.out.println("El quacient es: " +division +" y el residu: " +res);

     boolean aMajorqB = num1 > num2;
     boolean aMenorqB = num1 < num2;
     boolean aMajoroIgualqB = num1 >= num2;
     boolean aMenoroIgualqB = num1 <= num2;

     String s1 = "Hala";
     String s2 = "Hala";

     boolean esIgual = s1 == s2; //Es lo mismo a la linea 24
     boolean esIgual2 = s1.equals(s2);

      System.out.println(esIgual2);

      boolean plou = true;
      boolean faVent = false;

      boolean noPucSortir = plou || faVent;


  }
}
