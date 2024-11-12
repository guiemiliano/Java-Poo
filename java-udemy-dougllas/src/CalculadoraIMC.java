import java.util.Locale;
import java.util.Scanner;

public class CalculadoraIMC {
    public static void main(String[] args) {
        // peso div (altura * altura)

        //Leitor e formator de , pra .
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        //Entrada de dados
        System.out.print("Digite seu peso(kg): ");
        double peso = sc.nextDouble();
        System.out.print("Digite sua altura: ");
        double altura = sc.nextDouble();

        //Processamento de dados (lógica)
        double imc = peso / (altura * altura);

        //Saída de dados
        System.out.printf("O IMC para o peso %.2fkg e a altura %.2f é de " +
                "%.2fcm",peso, altura, imc);


        sc.close();
    }

}
