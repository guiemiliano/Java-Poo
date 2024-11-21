package sistemabancario;
//CLASSE DE NEGÓCIO
/*
   Construtores são métodos especiais usados para inicializar
   objetos de uma classe, por padrão recebo um construtor sem parâmetros
   ele tem o mesmo nome da classe
 */
public class Cliente {

    //variável de classe
    public static int quantidadeClientes;

    //variável de instância
    private String nome;
    private String cpf;

    //allArgs
    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
        incrementarClientes();
    }

    //noArgs
    public Cliente() {
        incrementarClientes();
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


    public static void incrementarClientes(){
        Cliente.quantidadeClientes++;
    }

}
