/*public class FrcPru {


public class Fractions {
    public static String toWords(String s) {

        String[] parts = s.split("/");
        int num = Integer.parseInt(parts[0]);
        int den = Integer.parseInt(parts[1]);


        String[] unitats = {
                "zero", "un", "dos", "tres", "quatre", "cinc", "sis", "set", "vuit", "nou"
        };

        String[] desenes = {
                "deu", "un", "dos", "tres", "quatre", "cinc", "sis", "set", "vuit", "nou"
        };

        String[] numDeuaVint = {
                "onze", "dotze", "tretze", "catorze", "quinze", "setze", "disset", "divuit", "dinou", "vint"
        };


        String primeraLetra = priMaj(num);

        String primernum = "";
        Boolean esSingular = false;

        switch (num){
            case 0: primernum ="zero"; break;
            case 1: primernum ="un"; break; //esSingular = true; break;
            case 2: primernum ="dos"; break;
            case 3: primernum ="tres"; break;
            case 4: primernum ="quatre"; break;
            case 5: primernum ="cinc"; break;
            case 6: primernum ="sis"; break;
            case 7: primernum ="set"; break;
            case 8: primernum ="vuit"; break;
            case 9: primernum ="nou"; break;
            case 10: primernum ="deu"; break;
            case 11: primernum ="onze"; break;
            case 12: primernum ="dotze"; break;
            case 13: primernum ="tretze"; break;
            case 14: primernum ="catorze "; break;
            case 15: primernum ="quinze"; break;
            case 16: primernum ="setze"; break;
            case 17: primernum ="disset"; break;
            case 18: primernum ="divuit"; break;
            case 19: primernum ="dinou"; break;
            case 20: primernum ="vint"; break;
        }

        if (esSingular){

            switch (den){
                case 2: primernum ="mig"; break;
                case 3: primernum ="terç"; break;
                case 4: primernum ="quart"; break;
                case 5: primernum ="cinquè"; break;
                case 6: primernum ="sisè"; break;
                case 7: primernum ="setè"; break;
                case 8: primernum ="vuitè"; break;
                case 9: primernum ="novè"; break;
                case 10: primernum ="dècim"; break;
                case 11: primernum ="onzè"; break;
                case 12: primernum ="dotzè"; break;
                case 13: primernum ="tretzè"; break;
                case 14: primernum ="catorzè"; break;
                case 15: primernum ="quinzè"; break;
                case 16: primernum ="setzè"; break;
                case 17: primernum ="dissetè"; break;
                case 18: primernum ="divuitè"; break;
                case 19: primernum ="dinovè"; break;
                case 20: primernum ="vintè"; break;
            }

        }

        return primernum;
    }

    private static String priMaj( int numero) {
        char primeraLletraMaj = numero.toUppercase().charAt(0);
        String restaParaula = numero.substring(1).toLowercase();
        return primeraLletraMaj + restaParaula;

     //   String palabra = "hola";
     //   for (int i = 0; i < palabra.length(); i++) {
     //      palabra.charAt(i);
     //       System.out.println(palabra.charAt(i));
     //   }
     //   return palabra;

    }

}
}*/