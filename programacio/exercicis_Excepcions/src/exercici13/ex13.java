/*13- Comproveu que una sentència «return» dins un bloc «try» també executa una clàusula «finally».*/

package exercici13;

public class ex13 {
    public static void main(String[] args) {
        try {
            return;
        }finally {
            System.out.println("dins finally");
        }
    }
}
