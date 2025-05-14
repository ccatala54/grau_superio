import java.lang.reflect.Array;
import java.util.Arrays;

public class LightBot {
 String[]  map;
    Mapa mapa;

    LightBot(String[]mapaIniciar) {
        mapa = new Mapa();
        this.map = mapaIniciar;
    }

    public void reset() {
    }

    void execute(String instr) {



    }

    public void runProgram(String[] strings) {
        for (int i = 0; i < strings.length; i++) {
            execute(strings[i]);
        }
    }

    public int[] getRobotPosition() {

        //Donde esta el robot por ultima vez
    }

    public Object[] getMap() {
        //Recoge el ultimo mapa que tengo
       mapa.generarMapa(map); //No, esta mal
    }
}

class Robot{
int posX, posY;
char direccion;

Robot(int posX, int posY, char direccion){
    this.posX = posX;
    this.posY =posY;
    this.direccion = direccion;
}

}

class Instruction{
    String nombre;
    int parametro;
    private Robot robot;

    public void movDireccion(String nombre) {

        switch (nombre) {
            case "FORWARD":
                switch (robot.direccion) {
                    case 'R':
                        robot.posX++;
                        break;
                    case 'L':
                        robot.posX--;
                        break;
                    case 'U':
                        robot.posY--;
                        break;
                    case 'D':
                        robot.posY++;
                        break;
                    default:
                        System.out.println("Direccion erronia");
                }
                break;
            case "RIGHT":

        }
    }
    public void cambioDireccion(String nombre) {
        if (nombre == "RIGHT"){
            

        }


    }

}

class Mapa{
    char[][] ar;
   private Robot robot;

    public void generarMapa(String[] mapaInicia) {
        int filas =mapaInicia.length;
        int columnas =mapaInicia[0].length();

       ar = new char[filas][columnas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
               ar[i][j] =mapaInicia[i].charAt(j);
            }
        }
    }

    public void posicionRobot() {
        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar[0].length; j++) {
                if (ar[i][j] == 'R' || ar[i][j] == 'L' || ar[i][j] == 'U' || ar[i][j] == 'D') {
                    robot.posX =i;
                    robot.posY=j;
                    robot.direccion = ar[i][j];
                    ar[i][j] = '.';
                }

            }
        }
    }
}


