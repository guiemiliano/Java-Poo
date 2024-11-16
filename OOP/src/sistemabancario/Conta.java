package sistemabancario;

public class Conta {

    Cliente titular;
    int numero;
    double saldo;

    //this referencia ao objeto atual

    public void imprimirSaldo(){
        System.out.printf("Conta - %s ", this.titular.nome);
        System.out.println();
        System.out.printf("Saldo atual: R$ %.2f%n", this.saldo);
    }


}
