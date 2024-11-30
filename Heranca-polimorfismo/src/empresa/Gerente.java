package empresa;

public class Gerente extends Funcionario {

    @Override
    public double calcularBonificacao() {
        double bonificacaoPadrao = super.calcularBonificacao();
        return bonificacaoPadrao + 500;
    }
}
