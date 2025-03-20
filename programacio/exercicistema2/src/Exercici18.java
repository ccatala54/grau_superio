/*18- Escriu un programa que donat un any, dins la variable “any”, escrigui el valor “true” dins la
variable “esBixest” si aquest any és bixest i “false” si no és així. Segons la wikipedia:
Un any bixest és un any civil que té un dia més que els anys comuns, és a dir, té 366 dies. El dia de
més s'afegeix al final del mes que era el darrer del calendari romà: el febrer, de tal manera que
aquest mes passa a tenir 29 dies.
El repartiment dels anys civils en anys comuns i de traspàs es fa d'acord amb el calendari gregorià:
en cada període de 400 anys n'hi ha 303 de comuns i 97 de traspàs. S'alternen de la següent
manera: són de traspàs els anys en què les dues darreres xifres de l'any són múltiples de 4,
excepte si aquestes xifres són 00. Aleshores, cal tenir en compte les dues primeres xifres de l'any.
Si són múltiples de 4, l'any també serà de traspàs.*/

import java.util.Scanner;

public class Exercici18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un año: ");
        int any = scanner.nextInt();


     String respuesta = ((any % 4 == 0 && any % 100 != 0) || (any % 400 == 0)) ? "El año introducido es bisiesto" : "El año introducido NO es bisiesto";
        System.out.println(respuesta);

    }
}
