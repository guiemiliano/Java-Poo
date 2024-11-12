import java.util.Scanner;

public class LoopComWhile {
    public static void main(String[] args) {
        /*
           imprimindo números de 0 a  usando o While!
           While sempre recebe uma expressão booleana
           por exemplo no loop abaixo eu usei da seguinte lógica
           o valor de x é igual a zero e enquanto ele for menor ou
           igual a 20 eu vou imprimir ele no console

        */
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número para fazer a sua contagem");
        int x = 0;
        int contador = sc.nextInt();

        while (x <= contador){ //condição
            System.out.println("seu número é: " + x); //impressão
            x++; //incremento
        }

        sc.close();
    }
}
