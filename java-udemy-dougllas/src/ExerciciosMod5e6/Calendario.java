package ExerciciosMod5e6;

import java.util.Scanner;

/*
    Crie um programa Java que solicite ao usuário digitar o número do mês (1 para
    Janeiro, 2 para Fevereiro, etc.) e utilize a estrutura switch-case para imprimir o
    número de dias do mês correspondente.
 */
public class Calendario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o número do mês para verificar a quantidade de dias: ");

        int mes = sc.nextInt();
        int dias;

        switch (mes){
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                 dias = 31;
                 break;
            case 4: case 6: case 9: case 11:
                dias = 30;
                break;
            case 2:
                dias = 28;
                break;
            default:
                dias = -1;
                break;
        }
        if(dias != -1){
            System.out.println("Você escolheu o mês " + mes + " ele tem " + dias + " dias");
        }else{
            System.out.println("Mêes inválido");
        }

        sc.close();
    }

}
