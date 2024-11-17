package sistemabancario;
//CLASSE DE NEGÓCIO
/*
   Construtores são métodos especiais usados para inicializar
   objetos de uma classe, por padrão recebo um construtor sem parâmetros
   ele tem o mesmo nome da classe
 */
public class Cliente {
    private String nome;
    private String cpf;

    //allArgs
    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
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

    //noArgs
    public Cliente() {

    }

}
