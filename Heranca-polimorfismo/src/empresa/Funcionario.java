package empresa;

public class Funcionario {
    private String nome;
    private String cpf;
    private double salario;

    /*
        O bônus é de 10% do salário e 50 reais de adição
     */

    public double calcularBonificacao(){
        return (salario / 10) + 50;
    }

    public void imprimirRemuneracao(){
        double remuneracao = salario + this.calcularBonificacao();
        System.out.println("Remuneração do Funcionário " + nome +
                ": " + remuneracao);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
