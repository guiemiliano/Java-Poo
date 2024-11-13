import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opcao;
        double valorTotal = 0;

        do {
            System.out.println("Escolha uma opção do menu:");
            System.out.println("1 - Lasanha (R$ 20,00)");
            System.out.println("2 - Pizza (R$ 40,00)");
            System.out.println("3 - Porção (R$ 30,00)");
            System.out.println("4 - Refrigerante 2l (R$ 10,00)");
            System.out.println("0 - Finalizar");

            opcao = sc.nextInt();

            switch (opcao){
                case 1 :
                    System.out.println("Lasanha");
                    valorTotal += 20;
                    break;
                case 2:
                    System.out.println("Pizza");
                    valorTotal += 40;
                    break;
                case 3:
                    System.out.println("Porção de batata");
                    valorTotal += 30;
                    break;
                case 4:
                    System.out.println("Refrigente 2l");
                    valorTotal += 10;
                    break;
                case 0:
                    System.out.println("Finalizando o pedido!");
                    break;
                default:
                    System.out.println("Digite um valor válido (entre 0 e 3)");
            }

        }while (opcao != 0);

        System.out.println("O valor total do seu pedido é de: R$" +valorTotal);

        sc.close();
    }
}
