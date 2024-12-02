package empresa;

public class Gerente extends Funcionario {


    //Sobrescrita de método
    @Override
    public double calcularBonificacao() {
        double bonificacaoPadrao = super.calcularBonificacao();
        return bonificacaoPadrao + 500;
    }
}
