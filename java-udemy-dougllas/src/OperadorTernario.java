import java.util.Scanner;

public class OperadorTernario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
            Operadores ternários são recomendados para expressões mais simples
         */


        System.out.println("Digite o ano Atual:");
        int anoAtual = sc.nextInt();

        System.out.println("Digite o seu ano de Nascimento:");
        int anoNascimento = sc.nextInt();


        int idade = anoAtual - anoNascimento;
        int idadeMinima = 18;
                                                    // ? se for verdade
        String maiorDeIdade = idade > idadeMinima ? "Maior de idade " + idade + " anos"
                // : se nao for verdade
                : "Menor de idade " + idade + " anos";

        System.out.println(maiorDeIdade);

        sc.close();

    }
}
