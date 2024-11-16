package sistemabancario;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        //Apontando para um espaço de memória heap
        //ambas fazem referência para o mesmo Objeto
        Cliente pedro = new Cliente("Pedro","122131230");
        Cliente raul = new Cliente("Raul", "223211230");

        //Cliente outroPonteiro = pedro;
        //outroPonteiro.nome = "x";
        /*
        pedro.nome = "Pedro";
        pedro.cpf = "122131230";

        raul.nome = "Raul";
        raul.cpf = "223211230";
        */

        Conta contaPedro = new Conta();
        contaPedro.titular = pedro;
        contaPedro.numero = 1000;
        contaPedro.saldo = 50;

        Conta contaRaul = new Conta();
        contaRaul.titular = raul;
        contaRaul.numero = 2000;
        contaRaul.saldo = 0;

        Banco sistemBancario = new Banco();

        //Valor de 50 atribuído acima
        System.out.println("Antes do deposito");
        contaPedro.imprimirSaldo();

        //Depositando na contaPedro
        sistemBancario.depositar(contaPedro, 200.00);

        //Valor que á tinha na conta + Deposito
        System.out.println("Depois do depósito");
        contaPedro.imprimirSaldo();

        //Sacando o valor de 70 reais
        System.out.println("Sacando o valor de 70 reais");
        sistemBancario.sacar(contaPedro, 70);
        contaPedro.imprimirSaldo();

        sistemBancario.transferir(contaPedro, contaRaul, 150);
        System.out.println("Transferindo 150 reais da conta de " + pedro.nome +
                " para " + raul.nome);

        contaRaul.imprimirSaldo();
        contaPedro.imprimirSaldo();




    }
}
