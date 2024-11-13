package ExerciciosMod5e6;

import java.util.Locale;
import java.util.Scanner;

/*
    Crie um programa Java que simule uma calculadora de impostos. Solicite ao usuário
    que informe o salário bruto e utilize uma expressão booleana para determinar se o
    salário está sujeito ao imposto de renda (acima de R$ 2400,00). Se estiver, calcule e
    imprima o valor do imposto (15% sobre o excedente).
 */
public class CalcImpostos {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe seu salário");
        double salarioBruto = sc.nextDouble();
        double valorDeCobranca = 2824.00;

        if(salarioBruto > valorDeCobranca){
            double imposto = (salarioBruto - valorDeCobranca) * 0.15;
            System.out.println("Imposto de renda a ser pago: R$" + imposto);
        }else{
            System.out.println("Isento de imposto de renda");
        }


        sc.close();
    }
}
