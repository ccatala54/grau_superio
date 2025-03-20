public class Funciones2 {
    public static void main(String[] args) {

        funcio1(); //Aunq no tenga parametros es necesrio los parentesis
        funcio2("liceu", 9, 34); //Si tiene parametros se le tiene que poner
        String s = funcio3(7, "liceu");
    }

    public static void /*con volid la funcion no devuelve nada*/ funcio1() {
        //Funcion que no acepta parametros
        //I no devuelve nada
    }

    public static void funcio2(String s, int i, long l){
        //esta funcion necesita que le pasan tres parametros, el primero de tipo string, el segundo de tipo int, y el tercero de tipo long
        //y no devuelbe nada
    }
    public static String funcio3 (long l, String s){
        //Necesita que li passen un long i un String
        // y devuelbe un String
        return "hola";

    }
}
