import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LightBot {
    String[] map;
    String[] mapOriginal;
    Mapa mapa;
    Robot robot;
    Robot robotOriginal;
    private static final Map<String, Funcion> funciones = new HashMap<>();

    LightBot(String[] mapaIniciar) {
        this.map = mapaIniciar;
        this.mapOriginal = Arrays.copyOf(mapaIniciar, mapaIniciar.length);
        this.mapa = new Mapa();
        this.mapa.generarMapa(mapaIniciar);
        this.robot = mapa.posicionarRobot();

        if (this.robot == null) {
            throw new IllegalStateException("Robot no trobat al mapa!");
        }

        this.robotOriginal = robot.copia();
    }

    public void reset() {
        this.map = Arrays.copyOf(mapOriginal, mapOriginal.length);
        this.mapa.generarMapa(map);
        this.robot = mapa.posicionarRobot();
    }

    void execute(String instr) {
        switch (instr) {
            case "FORWARD" -> robot.moure(mapa.ar);
            case "LEFT" -> robot.girarEsquerra();
            case "RIGHT" -> robot.girarDreta();
            case "LIGHT" -> mapa.encendre(robot.posX, robot.posY);
        }
    }

    public void runProgram(String[] instruccions) {
        funciones.clear();
        List<Instruciones> parsed = parseInstrucciones(instruccions);
        ejecutar(parsed, new HashMap<>());
    }

    private void ejecutar(List<Instruciones> lista, Map<String, Integer> contexto) {
        for (Instruciones instr : lista) {
            if (instr.isRepeat()) {
                int veces = parseInt(instr.para, contexto);
                for (int i = 0; i < veces; i++) {
                    ejecutar(instr.repeat, contexto);
                }
            } else if (instr.name.startsWith("CALL")) {
                String[] partes = instr.name.split(" ");
                String nombre = partes[1];
                Funcion f = funciones.get(nombre);
                if (f == null) {
                    throw new IllegalArgumentException("Función no definida: " + nombre);
                }

                List<Integer> valoresArgs = new ArrayList<>();
                if (instr.para != null && !instr.para.isEmpty()) {
                    String[] argsSplit = instr.para.split("\\|");
                    for (String arg : argsSplit) {
                        valoresArgs.add(parseInt(arg, contexto));
                    }
                }

                if (valoresArgs.size() != f.parametros.size()) {
                    throw new IllegalArgumentException("Número de argumentos incorrecto en llamada a " + nombre);
                }

                Map<String, Integer> nuevoContexto = new HashMap<>(contexto);
                for (int i = 0; i < f.parametros.size(); i++) {
                    nuevoContexto.put(f.parametros.get(i), valoresArgs.get(i));
                }

                ejecutar(f.cuerpo, nuevoContexto);
            } else {
                execute(instr.name);
            }
        }
    }

    private int parseInt(String valor, Map<String, Integer> contexto) {
        try {
            return Integer.parseInt(valor);
        } catch (NumberFormatException e) {
            if (contexto.containsKey(valor)) {
                return contexto.get(valor);
            } else {
                throw new IllegalArgumentException("Variable no definida: " + valor);
            }
        }
    }

    public int[] getRobotPosition() {
        if (robot == null) {
            throw new IllegalStateException("Robot no està inicialitzat!");
        }
        return new int[]{robot.posY, robot.posX};
    }

    public String[] getMap() {
        return mapa.getMapaSenseRobot();
    }

    public static List<Instruciones> parseInstrucciones(String[] input) {
        List<Instruciones> result = new ArrayList<>();
        parseRecursive(input, 0, result);
        return result;
    }

    private static int parseRecursive(String[] input, int index, List<Instruciones> out) {
        while (index < input.length) {
            String token = input[index];

            if (token.startsWith("REPEAT")) {
                String times = token.split(" ")[1];
                Instruciones rep = new Instruciones("REPEAT", times);
                index = parseRecursive(input, index + 1, rep.repeat);
                out.add(rep);
            } else if (token.equals("ENDREPEAT")) {
                return index + 1;
            } else if (token.startsWith("FUNCTION")) {
                String rest = token.substring("FUNCTION".length()).trim();
                String nombre = rest.contains("(") ? rest.substring(0, rest.indexOf("(")) : rest;
                String paramsStr = rest.contains("(") ? rest.substring(rest.indexOf("(") + 1, rest.indexOf(")")) : "";
                List<String> params = paramsStr.isEmpty() ? new ArrayList<>() : Arrays.asList(paramsStr.split(","));
                for (int i = 0; i < params.size(); i++) {
                    params.set(i, params.get(i).trim());
                }

                List<Instruciones> cuerpo = new ArrayList<>();
                index = parseRecursive(input, index + 1, cuerpo);
                funciones.put(nombre, new Funcion(nombre, params, cuerpo));
            } else if (token.equals("ENDFUNCTION")) {
                return index + 1;
            } else if (token.startsWith("CALL")) {
                String rest = token.substring("CALL".length()).trim();
                String nombre;
                List<String> args = new ArrayList<>();

                if (rest.contains("(")) {
                    nombre = rest.substring(0, rest.indexOf("("));
                    String argsStr = rest.substring(rest.indexOf("(") + 1, rest.indexOf(")"));
                    if (!argsStr.isEmpty()) {
                        args = Arrays.asList(argsStr.split(","));
                        for (int i = 0; i < args.size(); i++) {
                            args.set(i, args.get(i).trim());
                        }
                    }
                } else {
                    nombre = rest;
                }

                String argConcat = String.join("|", args);
                out.add(new Instruciones("CALL " + nombre, argConcat));
                index++;
            } else {
                out.add(new Instruciones(token));
                index++;
            }
        }
        return index;
    }
}

class Robot {
    int posX, posY;
    char direccion;

    Robot(int posX, int posY, char direccion) {
        this.posX = posX;
        this.posY = posY;
        this.direccion = direccion;
    }

    public void moure(char[][] mapa) {
        switch (direccion) {
            case 'R' -> posY = (posY + 1) % mapa[0].length;
            case 'L' -> posY = (posY - 1 + mapa[0].length) % mapa[0].length;
            case 'U' -> posX = (posX - 1 + mapa.length) % mapa.length;
            case 'D' -> posX = (posX + 1) % mapa.length;
        }
    }

    public void girarEsquerra() {
        switch (direccion) {
            case 'R' -> direccion = 'U';
            case 'U' -> direccion = 'L';
            case 'L' -> direccion = 'D';
            case 'D' -> direccion = 'R';
        }
    }

    public void girarDreta() {
        switch (direccion) {
            case 'R' -> direccion = 'D';
            case 'D' -> direccion = 'L';
            case 'L' -> direccion = 'U';
            case 'U' -> direccion = 'R';
        }
    }

    public Robot copia() {
        return new Robot(posX, posY, direccion);
    }
}

class Mapa {
    char[][] ar;

    public String[] getMapaSenseRobot() {
        String[] resultat = new String[ar.length];
        for (int i = 0; i < ar.length; i++) {
            resultat[i] = new String(ar[i]);
        }
        return resultat;
    }

    public void generarMapa(String[] mapaInicia) {
        int filas = mapaInicia.length;
        int columnas = mapaInicia[0].length();
        ar = new char[filas][columnas];
        for (int i = 0; i < filas; i++) {
            ar[i] = mapaInicia[i].toCharArray();
        }
    }

    public Robot posicionarRobot() {
        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar[0].length; j++) {
                char c = ar[i][j];
                if (c == 'R' || c == 'L' || c == 'U' || c == 'D') {
                    ar[i][j] = '.';
                    return new Robot(i, j, c);
                }
            }
        }
        return null;
    }

    public void encendre(int x, int y) {
        if (ar[x][y] == 'O') {
            ar[x][y] = 'X';
        } else if (ar[x][y] == '.') {
            ar[x][y] = 'x';
        }
    }

    public String[] getMapaAmbRobot(Robot robot) {
        char[][] copia = new char[ar.length][];
        for (int i = 0; i < ar.length; i++) {
            copia[i] = Arrays.copyOf(ar[i], ar[i].length);
        }
        copia[robot.posX][robot.posY] = robot.direccion;
        String[] resultat = new String[ar.length];
        for (int i = 0; i < ar.length; i++) {
            resultat[i] = new String(copia[i]);
        }
        return resultat;
    }
}

class Instruciones {
    String name;
    String para;
    List<Instruciones> repeat = new ArrayList<>();

    Instruciones(String name) {
        this.name = name;
        this.para = null;
    }

    Instruciones(String name, String para) {
        this.name = name;
        this.para = para;
    }

    boolean isRepeat() {
        return name.equals("REPEAT");
    }
}

class Funcion {
    String nombre;
    List<String> parametros;
    List<Instruciones> cuerpo;

    Funcion(String nombre, List<String> parametros, List<Instruciones> cuerpo) {
        this.nombre = nombre;
        this.parametros = parametros;
        this.cuerpo = cuerpo;
    }
}
