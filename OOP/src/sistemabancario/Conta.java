package sistemabancario;

public class Conta {
    Cliente titual;
    int numero;
    double saldo;

    //this referencia ao objeto atual

    public void imprimirSaldo(){
        System.out.println(this.saldo);
    }


}
