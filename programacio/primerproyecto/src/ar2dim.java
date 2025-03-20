public class ar2dim {
    public static void main(String[] args) {

        char [][] screen = new char[50][20];
        fillScreen (screen, '.');
        printScreen (screen);
    }

    private static void printScreen(char[][] screen) {
    }


    public static void fillScreen (char[][] screen, char c){
        for (int i = 0; i < screen.length; i++) {
            for (int j = 0; j < screen[i].length; j++) {
                screen[i][j] = c;

            }

        }
    }
}

