package DesafioWhile;

/*
    Exercício de fixação para os conceitos de While
    Devo criar uma lógica usando o while para imprimir
    no console apenas números pares.
 */

import java.util.Scanner;

public class DesafioWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor para imprimir somente números pares: ");
        int contador = sc.nextInt();
        int valor = 2;


        while (valor <= contador) {

            if(valor % 2 == 0){
            System.out.println(valor);
            }
            valor++;
        }


        sc.close();
    }
}
