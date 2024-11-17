package sistemabancario;

public class Banco {

    void depositar(Conta conta, double valor){
        double saldoAtual = conta.getSaldo();
        double novoSaldo = saldoAtual + valor;
        conta.modificarSaldo(novoSaldo);
    }

    void sacar(Conta conta, double valor){
        double saldoAtual = conta.getSaldo();
        double novoSaldo = saldoAtual - valor;

        if(novoSaldo < 0 || novoSaldo > saldoAtual){
            System.out.println("Não foi possível sacar, saldo insuficiente");
        }else{
            conta.modificarSaldo(novoSaldo);
        }
    }

    void transferir(Conta origem, Conta destino, double valor){
        double saldoAtualOrigem = origem.getSaldo();
        double novoSaldoOrigem = saldoAtualOrigem - valor;
        if(novoSaldoOrigem < 0){
            System.out.println("Não foi possível transferir, saldo insuficiente");
        }else{
            origem.modificarSaldo(novoSaldoOrigem);
            double novoSaldoDestino = destino.getSaldo() + valor;
            destino.modificarSaldo(novoSaldoDestino);
        }
    }


}
