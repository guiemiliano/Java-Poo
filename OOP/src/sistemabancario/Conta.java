package sistemabancario;

public class Conta {

    Cliente titular;
    int numero;
    double saldo;

    //this referencia ao objeto atual

    public void imprimirSaldo(){
        System.out.printf("R$ %.2f%n", this.saldo);
    }


}
