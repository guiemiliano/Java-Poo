package sistemabancario;

public class Conta {

    Cliente titular;
    int numero;
    double saldo;

    //this referencia ao objeto atual

    public void imprimirSaldo(){
        System.out.printf("Conta - %s%n", this.titular.nome);
        System.out.printf("Número - %d%n", this.numero);
        System.out.printf("Saldo atual: R$ %.2f%n", this.saldo);
        System.out.println();
    }


}
