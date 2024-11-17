package sistemabancario;
//CLASSE

public class Conta {

    private Cliente titular;
    private int numero;
    private double saldo;

    public Conta(Cliente titular, int numero, double saldo) {

        this.titular = titular;
        this.numero = numero;
        //Garantindo que a conta não fique com saldo negativo
        if(saldo >= 0){
            this.saldo = saldo;
        }
    }

    public Conta() {
    }

    public void setSaldo(double saldo){
        if(saldo >= 0){
            this.saldo = saldo;
        }else{
            System.out.println("Saldo não foi alterado. Valor negativo");
        }
    }

    public double getSaldo(){
        return this.saldo;
    }
    //this referencia ao objeto atual

    public void imprimirSaldo(){
        System.out.printf("Conta - %s%n", this.titular.getNome());
        System.out.printf("Número - %d%n", this.numero);
        System.out.printf("Saldo atual: R$ %.2f%n", this.saldo);
        System.out.println();
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }


}
