package empresa;

public class Tecnico extends Funcionario{

    /*
        Super = chama o atributo/método da classe pai
        this = chamao atributo/método da classe atual
     */



    @Override
    public double calcularRenda() {
        return super.calcularRenda() + 50;
    }

    private String especialidade;

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }


    @Override
    public double calcularBonificacaoAnual() {
        return getSalario() * 2;
    }

    @Override
    public void bonificacaoAnual() {
        System.out.println(getNome() + " resultado PR: " +calcularBonificacaoAnual());
    }


}

