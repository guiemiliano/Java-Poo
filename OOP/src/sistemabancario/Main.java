package sistemabancario;

public class Main {
    public static void main(String[] args) {
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

        System.out.println("Conta antes do deposito");
        contaFulano.imprimirSaldo();

        System.out.println("Conta depois do depósito");
        sistemBancario.depositar(contaFulano, 200);
        contaFulano.imprimirSaldo();



    }
}
