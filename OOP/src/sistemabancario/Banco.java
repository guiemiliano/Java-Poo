package sistemabancario;

public class Banco {


    void depositar(Conta conta, double valor){
        double saldoAtual = conta.saldo;
        conta.saldo = saldoAtual + valor;
    }

    void sacar(Conta conta, double valor){
        double saldoAtual = conta.saldo;
        double novoSaldo = saldoAtual - valor;

        if(novoSaldo < 0){
            System.out.println("Não foi possível sacar, saldo insuficiente");
        }else{
            conta.saldo = novoSaldo;
        }
    }

    void transferir(Conta origem, Conta destino, double valor){
        double saldoAtualOrigem = origem.saldo;
        double novoSaldoOrigem = saldoAtualOrigem - valor;
        if(novoSaldoOrigem < 0){
            System.out.println("Não foi possível transferir, saldo insuficiente");
        }else{
            origem.saldo = novoSaldoOrigem;
            destino.saldo = destino.saldo + valor;
        }
    }
}
