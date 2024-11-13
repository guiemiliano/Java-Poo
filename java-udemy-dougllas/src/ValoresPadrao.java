public class ValoresPadrao {
    /*
        Uma variável deve estar no mínimo numa classe, static
        deve ser declarado somente dentro do escopo de uma classe
     */
    static double numero;
    static boolean verdadeiroOuFalso;

    /*
        int = 0
        boolean = false
        double 0.0
        String = null
     */


    public static void main(String[] args) {
        System.out.println(numero);
        //caso eu declare uma variável estática como declarei acima, automaticamente
        //a variável recebe seu valor padrão, no caso de um int seria 0

        if(verdadeiroOuFalso){
            int outroNumero = 2;
            System.out.println(outroNumero);
        }
        System.out.println("Não posso printar a variável outroNumero aqui, pois" +
                "a mesma está somente no escopo do if");

    }
}
