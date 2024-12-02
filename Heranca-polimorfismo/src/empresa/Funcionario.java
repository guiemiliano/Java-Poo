package empresa;

/*
    Não faz sentido criar um objeto funcionário, cada funcionário
    tem um cargo, é correto criar uma classe abstrata e extender ela nas
    classes de cargos
 */
public abstract class Funcionario {
    private String nome;
    private String cpf;
    private double salario;

    /*
        O bônus é de 10% do salário e 50 reais de adição
     */

    public abstract double calcularBonificacaoAnual();
    public abstract void bonificacaoAnual();


    public double calcularRenda(){
        return (salario / 10); //10%
    }

    public void imprimirRemuneracao(){
        double remuneracao = salario + this.calcularRenda();
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
