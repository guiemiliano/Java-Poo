package empresa;

public class Gerente extends Funcionario {


    /*
        Sobrescrita de método, se eu colocar parâmetros eu faço uma sobrecarga
        de método, porém não vai ser mais um método herdado da classe pai
     */

    @Override
    public double calcularRenda() {
        return super.calcularRenda() + 500;
    }

    @Override
    public double calcularBonificacaoAnual() {
        return super.getSalario() * 3;
    }

    @Override
    public void bonificacaoAnual(){
        System.out.println(getNome() + " resultado PR: " +calcularBonificacaoAnual());
    }

}
