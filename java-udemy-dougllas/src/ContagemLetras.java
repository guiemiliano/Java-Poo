import java.util.Scanner;

public class ContagemLetras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Contador de Letras
        System.out.println("Digite uma frase:");
        String frase = sc.nextLine();

        int quantidadeDeLetras = 0;

        for (int i = 0; i < frase.length(); i++) {
            char letra = frase.charAt(i); //usando o frase.charAt eu pego o chat que está na posição iterada
            boolean isLetra = Character.isLetter(letra);//Verificando se essa variável letra realmente é uma letra(char)
            // se é letra
            if(isLetra){ //vou incrementar a quantidade de letras
                quantidadeDeLetras++;
            }
        }

        System.out.println("A quantidade de letras é: " + quantidadeDeLetras);

        //Fazendo a contagem apenas de números pares
        System.out.println("Digite um número: ");
        int contador = sc.nextInt();

        for (int i = 0; i <= contador; i++) {
            if(i %2 == 0){
                System.out.println("O valor é: " + i);
            }
            i++;
        }

        sc.close();
    }
}
