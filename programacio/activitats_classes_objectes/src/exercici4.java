/*4- Fes una classe anomenada «Nombre» amb les següents característiques:
• El constructor accepta un valor «int»
• El constructor accepta un «String» representant la forma «romana» del número
• Té un mètode anomenat «hex» que retorna un string amb la forma hexadecimal del número
• Té un mètode anomenat «bin» que retorna un string amb la forma binària del número.*/

import java.util.Scanner;

public class exercici4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Vols introduir un número romà o amb dígits? (R/D) ");
        String resp = scanner.nextLine();

        if (resp.equalsIgnoreCase("R")) {
            System.out.println("Introdueix el número romà: ");
            String rom = scanner.nextLine();
            Nombre nombre = new Nombre(rom);
            System.out.println("Valor en decimal: " + nombre.getValor());
            System.out.println("Forma hexadecimal: " + nombre.hex());
            System.out.println("Forma binària: " + nombre.bin());
        } else {
            System.out.println("Introdueix el número en dígits: ");
            int n = scanner.nextInt();
            Nombre nombre = new Nombre(n);
            System.out.println("Valor en decimal: " + nombre.getValor());
            System.out.println("Forma hexadecimal: " + nombre.hex());
            System.out.println("Forma binària: " + nombre.bin());
        }

        scanner.close();
    }
}

class Nombre {
    private int valor;

    // Constructor que accepta un valor enter
    public Nombre(int valor) {
        this.valor = valor;
    }

    // Constructor que accepta un String amb un número romà
    public Nombre(String rom) {
        this.valor = converteixRomaaNumero(rom);
    }

    // Mètode per retornar el valor en decimal
    public int getValor() {
        return this.valor;
    }

    // Mètode que retorna la forma hexadecimal del número
    public String hex() {
        return String.format("%x", this.valor);
    }

    // Mètode que retorna la forma binària del número
    public String bin() {
        return Integer.toBinaryString(this.valor);
    }

    // Mètode per convertir un número romà a un enter
    private int converteixRomaaNumero(String s) {
        int[] valors = new int[26]; // A-Z
        valors['I' - 'A'] = 1;
        valors['V' - 'A'] = 5;
        valors['X' - 'A'] = 10;
        valors['L' - 'A'] = 50;
        valors['C' - 'A'] = 100;
        valors['D' - 'A'] = 500;
        valors['M' - 'A'] = 1000;

        int total = 0;
        int anterior = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            int valorActual = valors[s.charAt(i) - 'A'];
            if (valorActual < anterior) {
                total -= valorActual;
            } else {
                total += valorActual;
            }
            anterior = valorActual;
        }

        return total;
    }
}
