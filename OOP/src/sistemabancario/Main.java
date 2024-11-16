package sistemabancario;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        //Apontando para um espaço de memória heap
        //ambas fazem referência para o mesmo Objeto
        Cliente fulano = new Cliente();

        //Cliente outroPonteiro = fulano;
        //outroPonteiro.nome = "x";

        fulano.nome = "Fulano";
        fulano.cpf = "122131230";

        Conta contaFulano = new Conta();
        contaFulano.titular = fulano;
        contaFulano.numero = 1000;
        contaFulano.saldo = 50;

        Banco sistemBancario = new Banco();

        //Valor de 50 atribuído acima
        System.out.println("Conta antes do deposito");
        contaFulano.imprimirSaldo();

        //Depositando na contaFulano
        sistemBancario.depositar(contaFulano, 200.00);

        //Valor que á tinha na conta + Deposito
        System.out.println("Conta depois do depósito");
        contaFulano.imprimirSaldo();



    }
}
