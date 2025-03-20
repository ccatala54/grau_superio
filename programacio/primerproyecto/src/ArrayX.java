import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class ArrayX {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introdueix un numero: ");
        int grand = scanner.nextInt();

        char[][] ar = new char [grand] [grand];
        for (int i = 0; i < grand ; i++) {
            for (int j = 0; j < grand; j++) {
                ar [i] [j] = ' ';
            }
        }
        for (int i = 0; i < grand; i++) {
            ar [i] [i] = 'x';
            ar [i] [grand-1-i] = 'x';
        }

        for (int i = 0; i < grand ; i++) {
            for (int j = 0; j < grand; j++) {
                System.out.print(ar [i][j]);
            }
            System.out.println();
        }
    }
}
