import java.util.Scanner;

public class Tema3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        //Estructures de control
        // Permite tomar decisiones sobre que instruccioes se tienen que ejecutar en algun punto del programa (depende de alguna condicion)

        //Estructura de seleccion simple
        /*Permite ejecuta un conjunto de instruciones si i nada mas, si se cumple una condicion. En caso contrario, estas instruciones no se ejecutan*/

        /*if (condicion){
        Instrucuines que se tienen qe ejecutar si la condicion es cierta
        }*/
          /*  int a = 6;
            int b = 9;
            //El codigo siguiente solo se ejectur si es cierta

            if (a < b) {

                System.out.println("A es menor que B");
            }*/

            // Se le pide un precio al usuario y si este precio es mayor que un 100 se le aplica un 15% de descuento. Se tiene que imprimir el precio final

           /* int precio = 150;

            if ( precio > 100) {

                int descuento = precio * 15 /100;
                precio = precio -descuento;
            }
             System.out.println(precio);*/

        //Estuctura de seleccion doble

        /*Ejecuta un conjunto de intrucciones si se cumple la condicion y si esta no se cumple, ejecua otro conjunto de insrucionnes*/

        /*if (condicion){
        Instrucuines que se tienen qe ejecutar si la condicion es cierta
        }else{
        Instruciones que se ejecutan si la condicion es falsa
        }

        */

        /*int n1 =6;
        int n2 = 9;
        if (n1 <n2){

            //La condicion es cierta
            System.out.println("N1 es menor que n2");
        }else {

            //La condicion es falsa (n1>=n2)
            System.out.println("N1 es mayor o igual que n2")}

            ;*/
       /* int precio = 20;

        if ( precio > 100) {

            int descuento = precio * 15 /100;
            precio = precio -descuento;
            System.out.println("Enorabuena, tienes un  descuento  de:" +descuento);
        }else {
            System.out.println("No tienes ningun descuento, gusta mas");

        }
        System.out.println("El precio final es de:" +precio);*/

        /*int secret1 = 50;
        int secret2 =11;

        System.out.println("Dime un numero: ");
        int num = scanner.nextInt();

        if ( secret1 == num || secret2 == num){
            System.out.println("Has adivinado uno de los dos");
        }else {
            System.out.println("No has adivinado");
        }*/

        //Estructura de seleccion multipe
        /*Nos permite controlar que instruciones se ejecutan cuando se cumplen una de un conjunto de condiciones*/
        /*if (cond1){
        Instrucuines que se tienen qe ejecutar si la condicion es cierta
        }

        else if (cond2) {
        Instruciones que se ejecutan si condicion1 es falsa, y condicion 2 es cierta
        }

        else if (cond3) {
        Instruciones que se ejecutan si condicion1 y condicion2 es falsa, y condicion 3 es cierta
        }

        else if (cond4) {
        Instruciones que se ejecutan si condicion1, condicion2 i condicion3 es falsa, y condicion 4 es cierta
        }

        etc...



        int nota = 7;
        if (nota < 0 || nota > 10){
        System.out.println("Nota invalida");
        }else{
            if (nota < 5){
                System.out.println("Insuficiente");
            }
            else if (nota < 6){
                System.out.println("Suficiente");
            }
            else if (nota < 7){
                System.out.println("Bien");
            }
            else if (nota < 9){
                System.out.println("Notable");
            }
            else{
                System.out.println("Excelente");
        }}


    *//*
        Scanner scanner1 =new Scanner(System.in);
        int nota = scanner1.nextInt();

        switch (nota){
            case 0:
                System.out.println("Insuficiente"); break;

            case 1:
                System.out.println("Insuficiente"); break;

            case 2:
                System.out.println("Insuficiente"); break;

            case 3:
                System.out.println("Insuficiente"); break;

            case 4:
                System.out.println("Insuficiente"); break;

            case 5:
                System.out.println("Sufiiente"); break;

            case 6:
                System.out.println("Bien"); break;

            case 7:
                System.out.println("Notable"); break;

            case 8:
                System.out.println("Notable"); break;

            case 9:
                System.out.println("Excelente"); break;

            default:
                System.out.println("Excelente"); break;


        }/*
        switch (nota){
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
                System.out.println("Insuficiente"); break;

            case 5:
                System.out.println("Sufiiente"); break;

            case 6:
                System.out.println("Bien"); break;

            case 7:
            case 8:
                System.out.println("Notable"); break;

            case 9:
            case 10:
                System.out.println("Excelente"); break;


        }*/

/*Queremos hacer un programa qe pregunte al usuario (a i B), i despues pregunte la operacion que quiere realizar,
*escribimos 1 para sumar, 2 para estar, 3 para multiplicar, 4 para dividir
El programa tiene que hacer la operacion indicada y ha de mastrar el resultado

        System.out.println("Introduce un numero: ");
        int a = scanner.nextInt();

        System.out.println("Introduce un segundo numero:");
        int b = scanner.nextInt();

        System.out.println("1.Sumar 2.Restar 3.Multiplicar 4. Dividir, elige una de las opciones");
        int opcion = scanner.nextInt();

        int res;
        switch (opcion){

            case 1: res = a + b;
                System.out.println("La suma es:" +res);
                break;

            case 2: res = a - b;
                System.out.println("La resta es:" +res);
                break;

            case 3: res = a * b;
                System.out.println("La multiplicacion es:" +res);
                break;

            case 4:
                if (b == 0) {
                    System.out.println("No podemos dividir entre cero");
                }
                else {
                    res = a / b;
                System.out.println("La division es:" +res);}
                break;
            default:
                System.out.println("La operacion es invalida");
                break;
        }*/

        /*Haz un prograna que calcule el coste de aparcamiento de un veiculo
        Se tiene que preguntar el tipo de veiculo (1 moto, 2-cotxe , 3-camion)
        cada tipo de viculo te una tarifa  (1.50, 3.20, 5.50) (por hora)
        Cada tipo de veiculo esta aparcado mas de 5 horas se aplica un recargo
        de un 10%, 15% o un 17% dependiendo de tipo
        Si un veiculo esta aparcado mas de 10 horas se aplica un recarrgo fijo de un 30%
         */

        /*

        //Mio:

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("1.Moto 2.Cotxo 3.Camion, elige una de las opciones");
        int tipoVheiculo = scanner1.nextInt();

        System.out.println("Introduce las horas de aparcamiento");
        int hores = scanner1.nextInt();

        System.out.println("Introdueix els minuts");
        int minuts = scanner1.nextInt();

        final double TARIFA_MOTO = 1.50;
        final double TARIFA_COTXO = 3.20;
        final double TARIFA_CAMION = 5.50;

        double temps = (hores*60 + minuts)/60;

        if (temps <= 5){

            double total = 0;

            switch (tipoVheiculo){
                case 1:
                    total = temps*TARIFA_MOTO;
                    break;

                case 2:
                    total = temps*TARIFA_COTXO;
                    break;

                case 3:
                    total = temps*TARIFA_CAMION;
                    break;

            }
            }else if (temps <=10){
            double total = 0;
                switch (tipoVheiculo){
                    case 1:
                        total = temps*TARIFA_MOTO;
                        total = total*30/100;
                        break;

                    case 2:
                        total = temps*TARIFA_COTXO;
                        total = total*30/100;
                        break;

                    case 3:
                        total = temps*TARIFA_CAMION;
                        total = total*30/100;
                        break;

            }}

            else{
            double total = 0;
                switch (tipoVheiculo){
                    case 1:
                        total = temps*TARIFA_MOTO;
                        break;

                    case 2:
                        total = temps*TARIFA_COTXO;
                        break;

                    case 3:
                        total = temps*TARIFA_CAMION;
                        break;

                }

            }
            System.out.println("Has de pagar" +total);
        }*/
        /*
        //Suyo:
        // Fes un programa que calculi el cost d'aparcament d'un vehicle// S'ha de demanar el tipus de vehicle (1- moto, 2- cotxe, 3- camió)// Cada tipus de vehicle té una tarifa (1.50, 3.20, 5.50)// Si un vehicle està aparcat més de 5 hores, s'aplica un recàrrec// d'un 10%, 15% o un 17% depenent del tipus// Si un vehicle està aparcat més de 10 hores s'aplica un recàrrec// fixe d'un 30%import java.util.Scanner;

        public class ExerciciTarifes {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introdueix el tipus de vehicle: (1-moto, 2-cotxe, 3-camió) ");
        int tipusVehicle = scanner.nextInt();
        System.out.println("Introdueix les hores d'aparcament:");
        int hores = scanner.nextInt();
        System.out.println("Introdueix els minuts: ");
        int minuts = scanner.nextInt();
        final double TARIFA_MOTO = 1.50;
        final double TARIFA_COTXE = 3.20;
        final double TARIFA_CAM = 5.50;

        double temps = (hores*60 + minuts) / 60d;
        System.out.println(temps);
        if (temps <= 5) {
        double total = 0;
        switch(tipusVehicle) {
        case 1:
        total = temps*TARIFA_MOTO;
        break;
        case 2:
        total = temps*TARIFA_COTXE;
        break;
        case 3:
        total = temps*TARIFA_CAM;
        break;
        }
        System.out.println("Has de pagar: " + total);
        } else if (temps <= 10) {
        double total = 0;
        switch(tipusVehicle) {
        case 1:
        total = temps*TARIFA_MOTO;
        total = total + total*10/100;
        break;
        case 2:
        total = temps*TARIFA_COTXE;
        total = total + total*15/100;
        break;
        case 3:
        total = temps*TARIFA_CAM;
        total = total + total*17/100;
        break;
        }
        System.out.println("Has de pagar: " + total);
        } else {
        double total = 0;
        switch(tipusVehicle) {
        case 1:
        total = temps*TARIFA_MOTO;
        total = total + total*30/100;
        break;
        case 2:
        total = temps*TARIFA_COTXE;
        total = total + total*30/100;
        break;
        case 3:
        total = temps*TARIFA_CAM;
        total = total + total*30/100;
        break;
        }
        System.out.printf("Has de pagar: %.2f ", total);
        }


        }
        }

        */

        //Estructuras de repeticion
        /*Permite repetir una sequencia de instruccioes varias veces segun una condicion

       Un bucle es un conjunto de instruciones que se tiene que repetir.
       Cada que se repite este conjunto, se le llama: ITERACION.

       //Hay un bucle llamado bucle infinito
        Este es un bucle que consiste en repetir de manera indefinada una instruccion. Ej: reloj

        En un bucle hay variables de control.
        COMPTADOR: es una variabe que va aumentando o disminullendo indicando el numero de iteracines que hace falta hacer.

        ACUMULADOR: Es una variable donde vamos acumulando los calculos que quieren realizar.

        La sentencia "while" permite repetir la ejecucio del bucle mientras se cumpla una determina condicion.
        Esta condicion se verifica antes de cada interacion. Si la condicion no se cumple al principio, el bucle no se ejecuta.

        //while (cond){
        Instruciones que se ejecutan dentro del bucle
        }
        */

       /* int comptador = 11;

        while (comptador <=10){
            System.out.println(comptador);
            comptador = comptador +1;
        }*/
   /* //Programa que pregunte un numero y haga guiones por el numero dicho.

        Scanner scanner1 = new Scanner(System.in);

        System.out.print("Introduce un numero: ");
        int num = scanner1.nextInt();
        int compt = 1;
        while (compt <= num){

            System.out.print("-");
            compt++;


        }*/

      /*  Scanner scanner1 = new Scanner(System.in);

        System.out.print("Introduce un numero: ");
    int num = scanner1.nextInt();

        while ( num >0){

        System.out.print("-");
        num--;}*/
/*
        Scanner scanner1 = new Scanner(System.in);

        System.out.print("Tabla de multiplicar: ");
        int tabla = scanner1.nextInt();

        int cont = 1;

        while (cont < 11){
            System.out.print(tabla +"*" + cont +"= " );
        System.out.println(tabla*cont);
        cont++;
        }*/

        //Hacer un programa que pida dos numeros al usuario y calcule el residuo de la division entre ellas. Sin usuar el operador %.

      /*  Scanner scanner1 = new Scanner(System.in);
        System.out.println("Dime un numero");
        int n1 = scanner1.nextInt();

        System.out.println("Dime un segundo numero");
        int n2  = scanner1.nextInt();

        if (n2>n1){

            // Giramos los nueros de manera que n1 > n2
            int t = n1;
            n1 = n2;
            n2 = t;
        }

        int residuo = n1 - n2 ;
        while (residuo >n2){
            System.out.println(residuo);
            residuo = residuo -n2;

        }

        System.out.println(residuo);/*

        /*El usuario intenta adivinar un numero tiene 3 oportunidades, cada vez que el usuario
         introduce un numero, el ordenador dice si es demasiado grande o demasiado pequeño*/


        /*Scanner scanner1 = new Scanner(System.in);

        int secreto = (int) (Math.random()*10);
        int num = 0;
        int cont = 0;

        while ((cont < 3) && (num != secreto) ){

            System.out.print("Introduce un numero: ");
            num = scanner1.nextInt();

            if (num == secreto){}
            else if (secreto > num ){
                System.out.println("El numero es mayor");
            }else {
                System.out.println("El numero es menor");
            }

            cont++;
        }
        String respuesta = (secreto == num) ? "Muy bien has acertado" : "Vuelve a intentarlo, el numero secreto era " +secreto;
        System.out.println(respuesta);*/

      /*  // versio del profesor
      int secretP = (int) (Math.random()*10;
        boolean endevinat = false;
        boolean oportEsgotades = false;
        int oportunitats = 3;

        while (!endevinat && !oportEsgotades){
            System.out.println("Introdueix un nombre");
            int numUsuari = scanner.nextInt();
            if (numUsuari ==secretP){
                //Hem adivinat
                System.out.println("HAs guanyat");
            }else if (numUsuari < secretP) {
                System.out.println("El secret és més gran");
                oportunitats--;
            }else {
                System.out.println("El secret es més petit");
                oportunitats--;
            }
        }if (oportunitats == 0){
            oportEsgotades = true;
            System.out.println("Has perdut");
            System.out.println("El nombre secret es " +secretP);
        }*/

/*   //Vaya pidiendo numeros al usuario mientra sean parejos


        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Mientras introduzcas numeros pares el programa se ejecutara");
        System.out.println();
    int num = 0;
        while (num %2 == 0){
            System.out.print("Introduce un numero: ");
            num = scanner1.nextInt();

        }
        System.out.println("Adios");
*//*
        Scanner scanner1 = new Scanner(System.in);
        int num;

        do {
            System.out.println("Introduce un numero: ");
            num =scanner1.nextInt();
        }while (num %2 ==0);*/

   /*     //for (inicializacion; condicion; incremento/decremento)
        int i1 = 1, i2 = 6;
        while (i1<=10){
            System.out.println(i1);
            System.out.println(i2);
            i1++;
            i2--;
        }
        System.out.pr


        intln();
        for (int j1 = 1, j2 =6; j1 <=10; j1++, j2--){
            System.out.println(j1);
            System.out.println(j2);
        }*/
/*
        Scanner scanner1 = new Scanner(System.in);

        System.out.print("Tabla de multiplicar: ");
        int tabla = scanner1.nextInt();

        for (int i = 0; i <= 10; i++ ){
            System.out.print(tabla +"*" + i +"= " );
            System.out.println(tabla*i);

        }*/

//No pida nada al usuario y haga todas las tablas hasta el 10

/*
        for (int tablaM = 1; tablaM <= 10;tablaM++ ){
            System.out.println();

            for (int i = 0; i <= 10; i++ ){
            System.out.print(tablaM +"*" + i +"= " );
            System.out.println(tablaM*i);
            }

        }*/





    }
}
