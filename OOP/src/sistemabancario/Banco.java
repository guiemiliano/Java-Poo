package sistemabancario;

public class Banco {


    void depositar(Conta conta, double valor){
        double saldoAtual = conta.saldo;
        double novoSaldo = saldoAtual + valor;
    }

    void sacar(Conta conta, double valor){
        double saldoAtual = conta.saldo;
        double novoSaldo = saldoAtual - valor;
    }

    void transferir(Conta origem, Conta destino, double valor){

    }
}
