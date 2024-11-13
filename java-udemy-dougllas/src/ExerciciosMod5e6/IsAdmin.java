package ExerciciosMod5e6;
/*
    Escreva um programa Java que simule um sistema de autenticação. Solicite ao
    usuário que digite um nome de usuário e uma senha. Utilize uma expressão
    booleana para verificar se o nome de usuário é "admin" e a senha é "1234". Em caso
    afirmativo, exiba uma mensagem de sucesso; caso contrário, exiba uma mensagem
    de erro
 */

import java.util.Objects;
import java.util.Scanner;

public class IsAdmin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira seu nome de usuário: ");
        String nomeDeUsuario = sc.nextLine();

        System.out.println("Insira sua Senha: ");
        String senha = sc.nextLine();

        if(Objects.equals(nomeDeUsuario, "admin") && Objects.equals(senha, "1234")){
            System.out.println("Sucesso, você efetuou seu login!");
        }else{
            System.out.println("Ops, você errou seu nome de usuário e/ou senha");
        }


        sc.close();
    }
}
