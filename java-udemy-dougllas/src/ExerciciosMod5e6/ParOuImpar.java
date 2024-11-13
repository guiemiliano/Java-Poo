package ExerciciosMod5e6;

import java.util.Scanner;

/*
    Escreva um programa Java que utilize o operador ternário para determinar se um
    número fornecido pelo usuário é par ou ímpar, exibindo uma mensagem
    correspondente.
  */
public class ParOuImpar {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

         System.out.println("Digite um número, vamos determinar se é par ou impar");
         int numero = sc.nextInt();

         String imparPar = numero %2 == 0? "Par" : "Impar";

         System.out.println("O número é: " + numero + " e ele é " + imparPar);

         sc.close();
     }

}
