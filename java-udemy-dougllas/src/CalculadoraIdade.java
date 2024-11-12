import java.util.Scanner;

public class CalculadoraIdade {
    public static void main(String[] args) {
        //1 -> Pegar o ano atual
        //2 -> Pegar o ano de nascimento
        //3 -> Subtrair o ano atual - ano de nascimento
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o ano atual: ");
        int anoAtual = sc.nextInt();
        System.out.print("Agora digite o ano de nascimento: ");
        int anoNascimento = sc.nextInt();

        int idade = anoAtual - anoNascimento;

        if(idade >= 18 & idade < 60){
            System.out.println("Você é Adulto, Sua idade é de " + idade + " anos");
        }else if(idade >= 60){
            System.out.println("Você é Idoso, Sua idade é de " + idade + " anos");
        }else if(idade >= 13 && idade < 18){
            System.out.println("Você é Adolescente, Sua idade é de " + idade + " anos");
        }else if(idade >= 1 && idade < 13){
            System.out.println("Você é Criança, Sua idade é de " + idade + " anos");
        }else if(idade < 1){
            System.out.println("Você é um Bebê, Sua idade é de " + idade + " anos");
        }else{
            System.out.println("Valor inválido");
        }

    }
}
