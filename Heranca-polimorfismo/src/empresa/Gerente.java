package empresa;

public class Gerente extends Funcionario {


    /*
        Sobrescrita de método, se eu colocar parâmetros eu faço uma sobrecarga
        de método, porém não vai ser mais um método herdado da classe pai
     */

    @Override
    public double calcularBonificacaoAnual() {
        return (getSalario() / 10) + 500;

    }
}
