package ExerciciosMod5e6;

import java.util.Scanner;

/*
    Escreva um programa Java que permita ao usuário digitar a idade de uma pessoa e
    utilize o operador ternário para determinar se a pessoa é maior ou menor de idade,
    exibindo uma mensagem correspondente
 */
public class MaiorOuMenor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma idade para verificar sua maioridade");
        int idade = sc.nextInt();

        String maioridade = idade >= 18? "Sua idade é de: " + idade + " anos você é maior de idade"
                            : "Sua idade é de: " + idade + " anos você é menor de idade";

        System.out.println(maioridade);
        sc.close();
    }
}
