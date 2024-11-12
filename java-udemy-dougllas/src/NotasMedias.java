import java.util.Scanner;

public class NotasMedias {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite as 3 notas do aluno");

        System.out.print("Digite a nota do primeiro trimestre:");
        double nota1 = sc.nextDouble();

        System.out.print("Digite a nota do segundo trimestre:");
        double nota2 = sc.nextDouble();

        System.out.print("Digite a nota do terceiro trimestre:");
        double nota3 = sc.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3;

        if(media >= 6){
            System.out.printf("Aluno aprovado nota: %.2f%n", media);
        }else if(media >= 4 && media < 6){
            System.out.printf("Aluno de recuperação nota: %.2f%n", media);
        }else{
            System.out.printf("Aluno reprovado nota :%.2f%n", media);
        }


    }

}
