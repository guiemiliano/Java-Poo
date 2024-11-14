import java.sql.Array;

public class IteracaoArrays {
    public static void main(String[] args) {

        int[] numeros = {1,2,3,4,5,6,7,8,9};

        for(int i = 0; i < numeros.length; i++){
            System.out.println("índice: " + i +" Número: " + numeros[i]);
        }

        String[] emails = new String[5];
        emails[0] = "Fulano@email.com";
        emails[1] = "Ciclano@email.com";
        emails[2] = "Beltrano@email.com";
        emails[3] = "Virtuano@email.com";
        emails[4] = "Mariano@email.com";

//        for (int i = 0; i < emails.length; i++) {
//            System.out.println("email: " + emails[i]);
//        }

        //FOR ESPECÍFICO PARA COLEÇÃO DE ELEMENTOS e ARRAYS foreach
        //separado por :
        //se eu não precisar acessar o index para fazer nada, posso
        //simplesmente utilizar o foreach
        System.out.println("Foreach");
        for( String email : emails){
            System.out.println("email: " + email);
        }

        int[] numbers2 = {1,10,20,50};

        for(int number : numbers2){
            System.out.println("Números: " + number);
        }

    }
}
