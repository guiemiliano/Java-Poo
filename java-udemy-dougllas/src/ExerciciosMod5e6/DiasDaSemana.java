package ExerciciosMod5e6;
/*
    1. Escreva um programa Java que utilize a estrutura de controle switch-case para
    determinar o dia da semana com base em um número fornecido pelo usuário (1 para
    Domingo, 2 para Segunda-feira, etc.), exibindo uma mensagem correspondente.
*/

import java.util.Scanner;

public class DiasDaSemana {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número de 1 a 7 para os dias da semana");
        int diaDaSemana = sc.nextInt();
        String mensagem;

        switch (diaDaSemana){
            case 1 :
                mensagem = "1 - Domingo";
                break;
            case 2 :
                mensagem = "2 - Segunda-feira";
                break;
            case 3 :
                mensagem = "3 - Terça-feira";
                break;
            case 4 :
                mensagem = "4 - Quarta-feira";
                break;
            case 5 :
                mensagem = "5 - Quinta-feira";
                break;
            case 6 :
                mensagem = "6 - Sexta-feira";
                break;
            case 7 :
                mensagem = "7 - Sábado";
                break;
            default:
                mensagem = "Digite um número válido (1 a 7)";
                break;
        }

        System.out.println("Você escolheu o dia " + mensagem);

        sc.close();
    }
}
