import java.util.Scanner;

public class Piramidefor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("introduce un valor");
        int grand = scanner.nextInt();

        for (int i = 0; i < grand ; i++) {
            System.out.print("");
            for (int j = 0; j < grand ; j++) {
                System.out.println();
            }
        }
    }
}
