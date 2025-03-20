enum Direccion {
    SUR('S'),
    ESTE('E'),
    NORTE('N'),
    OESTE('W');

    public final char simboloDireccion;

    Direccion(char simbolo) {
        this.simboloDireccion = simbolo;
    }

    public int[] mover(int x, int y) {
        switch (this) {
            case SUR: return new int[]{x + 1, y};
            case ESTE:  return new int[]{x, y + 1};
            case NORTE: return new int[]{x - 1, y};
            case OESTE:  return new int[]{x, y - 1};
            default: throw new IllegalArgumentException("Dirección desconocida: " + this);
        }
    }
}

class Robot {
    int posicionX, posicionY;
    Direccion direccion;

    public Robot(int posicionX, int posicionY, Direccion direccion) {
        this.posicionX = posicionX;
        this.posicionY = posicionY;
        this.direccion = direccion;
    }
}

class Teletransport {
    int posicionX, posicionY;

    public Teletransport(int posicionX, int posicionY) {
        this.posicionX = posicionX;
        this.posicionY = posicionY;
    }
}

public class Bender {
    private char[][] mapa;
    private int filas;
    private int columnasMaximas;
    private Robot robot;
    private boolean direccionesInvertidas = false;
    private int contadorTeletransportes = 0;
    private Teletransport[] teletransportes = new Teletransport[10];
    private final Direccion[] direccionesNormales = {Direccion.SUR, Direccion.ESTE, Direccion.NORTE, Direccion.OESTE};
    private final Direccion[] direccionesInvertidasArr = {Direccion.NORTE, Direccion.OESTE, Direccion.SUR, Direccion.ESTE};
    private Direccion[] direccionesActivas = direccionesNormales;

    private int[][] celdasVisitadas;

    public Bender(String mapaString) {
        procesarMapa(mapaString);
        celdasVisitadas = new int[filas][columnasMaximas];
    }

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
                    robot = new Robot(i, j, Direccion.SUR);
                } else if (c == 'T') {
                    if (contadorTeletransportes < 10) {
                        teletransportes[contadorTeletransportes++] = new Teletransport(i, j);
                    }
                }
            }
        }
    }

    public String run() {
        StringBuilder camino = new StringBuilder();

        while (true) {
            int estado = obtenerEstado(robot.posicionX, robot.posicionY, robot.direccion, direccionesInvertidas);
            if (celdasVisitadas[robot.posicionX][robot.posicionY] == estado) {
                return null; // Se detecta ciclo
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
                if (celda == '$') return camino.toString();
                if (celda == 'I') {
                    direccionesInvertidas = !direccionesInvertidas;
                    direccionesActivas = direccionesInvertidas ? direccionesInvertidasArr : direccionesNormales;
                }
                if (celda == 'T') {
                    teletransportar();
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
                return null;
            }
        }
    }

    private boolean esMovimientoValido(int nx, int ny) {
        if (nx < 0 || nx >= filas) return false;
        if (ny < 0 || ny >= mapa[nx].length) return false;
        return mapa[nx][ny] != '#';
    }

    private char obtenerCelda(int i, int j) {
        if (i < 0 || i >= filas || j < 0 || j >= mapa[i].length) return '#';
        return mapa[i][j];
    }

    private int obtenerEstado(int x, int y, Direccion direccion, boolean direccionesInvertidas) {
        return (x * columnasMaximas + y) * 8 + (direccionesInvertidas ? 1 : 0) * 4 + direccion.ordinal();
    }

    private int distanciaManhattan(int x1, int y1, int x2, int y2) {
        return Math.abs(x1 - x2) + Math.abs(y1 - y2);
    }

    private double obtenerAnguloDesdeElNorte(int cx, int cy, int tx, int ty) {
        double angulo = Math.atan2((ty - cy), (cx - tx));
        if (angulo < 0) angulo += 2 * Math.PI;
        return angulo;
    }

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
