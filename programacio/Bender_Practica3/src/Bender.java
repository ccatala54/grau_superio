// Enum que defineix les quatre direccions possibles amb el seu símbol associat
enum Direccion {
    SUR('S'),
    ESTE('E'),
    NORTE('N'),
    OESTE('W');

    public final char simboloDireccion;

    // Constructor per assignar el símbol a cada direcció
    Direccion(char simbolo) {
        this.simboloDireccion = simbolo;
    }

    // Mètode per calcular la nova posició segons la direcció actual
    public int[] mover(int x, int y) {
        switch (this) {
            case SUR:
                return new int[]{x + 1, y};
            case ESTE:
                return new int[]{x, y + 1};
            case NORTE:
                return new int[]{x - 1, y};
            case OESTE:
                return new int[]{x, y - 1};
            default:
                throw new IllegalArgumentException("Dirección desconocida: " + this);
        }
    }
}

// Classe que representa el robot amb la seva posició i direcció
class Robot {
    int posicionX, posicionY;
    Direccion direccion;

    public Robot(int posicionX, int posicionY, Direccion direccion) {
        this.posicionX = posicionX;
        this.posicionY = posicionY;
        this.direccion = direccion;
    }
}

// Classe per representar una casella de teletransportació
class Teletransport {
    int posicionX, posicionY;

    public Teletransport(int posicionX, int posicionY) {
        this.posicionX = posicionX;
        this.posicionY = posicionY;
    }
}

// Classe principal on es desenvolupa tota la lògica del robot Bender
public class Bender {
    private char[][] mapa; // Matriu que representa el mapa
    private int filas; // Nombre de files del mapa
    private int columnasMaximas; // Nombre màxim de columnes entre totes les files
    private Robot robot; // Instància del robot
    private boolean direccionesInvertidas = false; // Indica si l'ordre de direccions està invertit
    private int contadorTeletransportes = 0; // Nombre de teleports trobats
    private Teletransport[] teletransportes = new Teletransport[10]; // Array de teleports
    private final Direccion[] direccionesNormales = {Direccion.SUR, Direccion.ESTE, Direccion.NORTE, Direccion.OESTE}; // Ordre normal de direccions
    private final Direccion[] direccionesInvertidasArr = {Direccion.NORTE, Direccion.OESTE, Direccion.SUR, Direccion.ESTE}; // Ordre invertit
    private Direccion[] direccionesActivas = direccionesNormales; // Referència a l'ordre actual de direccions

    private int[][] celdasVisitadas; // Per evitar bucles, es guarda l'estat visitat de cada cel·la

    // Constructor que processa el mapa i inicialitza el robot
    public Bender(String mapaString) {
        procesarMapa(mapaString);
        celdasVisitadas = new int[filas][columnasMaximas];
    }

    // Processa el mapa: assigna la matriu i detecta la posició inicial i teleports
    private void procesarMapa(String mapaString) {
        String[] lineas = mapaString.split("\n");
        filas = lineas.length;
        mapa = new char[filas][];
        columnasMaximas = 0;

        for (int i = 0; i < filas; i++) {
            mapa[i] = lineas[i].toCharArray();
            if (mapa[i].length > columnasMaximas) {
                columnasMaximas = mapa[i].length;
            }
        }

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < mapa[i].length; j++) {
                char c = mapa[i][j];
                if (c == 'X') {
                    robot = new Robot(i, j, Direccion.SUR); // Inicialitza el robot a la posició de partida
                } else if (c == 'T') {
                    if (contadorTeletransportes < 10) {
                        teletransportes[contadorTeletransportes++] = new Teletransport(i, j); // Desa la posició del teleport
                    }
                }
            }
        }
    }

    // Mètode principal que executa el moviment del robot
    public String run() {
        StringBuilder camino = new StringBuilder();

        while (true) {
            int estado = obtenerEstado(robot.posicionX, robot.posicionY, robot.direccion, direccionesInvertidas);
            if (celdasVisitadas[robot.posicionX][robot.posicionY] == estado) {
                return null; // Bucle detectat
            }
            celdasVisitadas[robot.posicionX][robot.posicionY] = estado;

            int[] nuevaPosicion = robot.direccion.mover(robot.posicionX, robot.posicionY);
            int nuevaX = nuevaPosicion[0];
            int nuevaY = nuevaPosicion[1];

            if (esMovimientoValido(nuevaX, nuevaY)) {
                robot.posicionX = nuevaX;
                robot.posicionY = nuevaY;
                camino.append(robot.direccion.simboloDireccion);

                char celda = obtenerCelda(robot.posicionX, robot.posicionY);
                if (celda == '$') return camino.toString(); // Arribem a la sortida
                if (celda == 'I') {
                    direccionesInvertidas = !direccionesInvertidas; // Inverteix les direccions
                    direccionesActivas = direccionesInvertidas ? direccionesInvertidasArr : direccionesNormales;
                }
                if (celda == 'T') {
                    teletransportar(); // Teletransporta si cau en una T
                }
                continue;
            }

            boolean movido = false;
            for (int i = 0; i < direccionesActivas.length; i++) {
                Direccion d = direccionesActivas[i];
                int[] pos = d.mover(robot.posicionX, robot.posicionY);
                nuevaX = pos[0];
                nuevaY = pos[1];
                if (esMovimientoValido(nuevaX, nuevaY)) {
                    robot.direccion = d;
                    robot.posicionX = nuevaX;
                    robot.posicionY = nuevaY;
                    camino.append(d.simboloDireccion);
                    movido = true;

                    char celda = obtenerCelda(robot.posicionX, robot.posicionY);
                    if (celda == '$') return camino.toString();
                    if (celda == 'I') {
                        direccionesInvertidas = !direccionesInvertidas;
                        direccionesActivas = direccionesInvertidas ? direccionesInvertidasArr : direccionesNormales;
                    }
                    if (celda == 'T') {
                        teletransportar();
                    }
                    break;
                }
            }

            if (!movido) {
                return null; // Si no pot moure’s a cap direcció, finalitza
            }
        }
    }

    // Comprova si la nova posició és dins del mapa i no és un mur
    private boolean esMovimientoValido(int nx, int ny) {
        if (nx < 0 || nx >= filas) return false;
        if (ny < 0 || ny >= mapa[nx].length) return false;
        return mapa[nx][ny] != '#';
    }

    // Obté el caràcter de la cel·la, o mur si està fora dels límits
    private char obtenerCelda(int i, int j) {
        if (i < 0 || i >= filas || j < 0 || j >= mapa[i].length) return '#';
        return mapa[i][j];
    }

    // Calcula un codi únic per a la combinació posició + direcció + mode invertit
    private int obtenerEstado(int x, int y, Direccion direccion, boolean direccionesInvertidas) {
        return (x * columnasMaximas + y) * 8 + (direccionesInvertidas ? 1 : 0) * 4 + direccion.ordinal();
    }

    // Calcula la distància de Manhattan entre dues coordenades
    private int distanciaManhattan(int x1, int y1, int x2, int y2) {
        return Math.abs(x1 - x2) + Math.abs(y1 - y2);
    }

    // Calcula l’angle respecte al nord per determinar el millor teleport
    private double obtenerAnguloDesdeElNorte(int cx, int cy, int tx, int ty) {
        double angulo = Math.atan2((ty - cy), (cx - tx));
        if (angulo < 0) angulo += 2 * Math.PI;
        return angulo;
    }

    // Cerca el millor teleport i trasllada el robot allà
    private void teletransportar() {
        int mejorDistancia = Integer.MAX_VALUE;
        double mejorAngulo = Double.MAX_VALUE;
        Teletransport elegido = null;

        for (int i = 0; i < contadorTeletransportes; i++) {
            Teletransport t = teletransportes[i];
            if (t.posicionX == robot.posicionX && t.posicionY == robot.posicionY) continue;
            int d = distanciaManhattan(robot.posicionX, robot.posicionY, t.posicionX, t.posicionY);
            if (d < mejorDistancia) {
                mejorDistancia = d;
            }
        }

        for (int i = 0; i < contadorTeletransportes; i++) {
            Teletransport t = teletransportes[i];
            if (t.posicionX == robot.posicionX && t.posicionY == robot.posicionY) continue;
            int d = distanciaManhattan(robot.posicionX, robot.posicionY, t.posicionX, t.posicionY);
            if (d == mejorDistancia) {
                double angulo = obtenerAnguloDesdeElNorte(robot.posicionX, robot.posicionY, t.posicionX, t.posicionY);
                if (angulo < mejorAngulo) {
                    mejorAngulo = angulo;
                    elegido = t;
                }
            }
        }

        if (elegido != null) {
            robot.posicionX = elegido.posicionX;
            robot.posicionY = elegido.posicionY;
        }
    }
}
