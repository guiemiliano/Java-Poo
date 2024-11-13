import java.util.Scanner;

public class MenuDoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opcao;
        do {
            System.out.println("Escolha uma série do menu:");
            System.out.println("1 - Better Call Saul");
            System.out.println("2 - Arcane");
            System.out.println("3 - Wandinha");
            System.out.println("0 - Sair");

            opcao = sc.nextInt();

            if (opcao == 0) {
                System.out.println("Você está saindo do app");
            } else if (opcao == 1) {
                System.out.println("Você escolheu - Better Call Saul");
            } else if (opcao == 2) {
                System.out.println("Você escolheu - Arcane");
            } else if (opcao == 3) {
                System.out.println("Você escolheu - Wandinha");
            } else {
                System.out.println("Escolha um valor entre 0 e 3");
            }

        }while (opcao != 0);


        sc.close();
    }

}
