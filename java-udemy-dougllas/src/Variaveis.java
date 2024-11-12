public class Variaveis {

    //Constante, não pode ser reatribuído e nem ser declarado dentro do escopo
    //de um método e deve estar em CAPS e deve estar static final (tipo)
    static final float VALOR_PI = 3.14f;
    static final double OUTRA_CONSTANTE = 13.55;

    public static void main(String[] args) {
        //variavel é um valor volátil, pode sofrer alterações
        int idade = 25;
        idade = 30;

        System.out.println("A idade é: " + idade);

        System.out.println("Valor do PI é: " + VALOR_PI);

    }
}
