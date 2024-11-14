/*
    Arrays
    Estrutura de dados que armazena uma coleção de elementos do mesmo tipo
 */
public class ArraysJava {
    public static void main(String[] args) {
        //tipo[] variavel; declaração de um array
        // variavel = {itens separados por virgula} iniciando a variavel

        String[] filhos = {"Ana", "Mateus", "Paula"};
        System.out.println("nome primeiro filho: " + filhos[0]);
        System.out.println("nome segundo filho: " +filhos[1]);
        System.out.println("nome terceiro filho: " +filhos[2]);

        int idade = 30;
        int[] numerosImpares = {1,3,5,7,9,idade};

        System.out.println(numerosImpares[5]);

        //é obrigatoriamente colocar quantos elementos esse array vazio vai ter
        String telefones[] = new String[2];
        System.out.println("telefone sem atribuição de valor: "+telefones[0]);
        telefones[0] = "44992392893";
        telefones[1] = "44993232111";

        System.out.println("Primeiro Telefone: " + telefones[0]);
        System.out.println("Segundo Telefone: " + telefones[1]);



    }
}
