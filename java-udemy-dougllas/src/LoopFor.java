import java.util.Scanner;

public class LoopFor {
    /*
        Laço de repetição mais utilizado e mais seguro
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número");

        int valorDigitado = sc.nextInt();
        for (int i = 0; i <= valorDigitado; i++) {
            System.out.println("O valor é: " + i);
        }



        sc.close();
    }
}
