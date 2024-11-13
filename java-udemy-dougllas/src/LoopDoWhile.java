import java.util.Scanner;

public class LoopDoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Se o número digitado não for entre 1 e 10 o código fica em loop
        int numero;

        do{
            System.out.println("Digite um número entre 1 e 10");
            numero = sc.nextInt();
        }while (numero < 1 || numero > 10);

        System.out.println("O número digitado e válido é de: " + numero);

        sc.close();
    }
}
