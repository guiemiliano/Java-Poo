package sistemabancario;

/*
   Construtores são métodos especiais usados para inicializar
   objetos de uma classe, por padrão recebo um construtor sem parâmetros
   ele tem o mesmo nome da classe
 */
public class Cliente {
    String nome;
    String cpf;

    //allArgs
    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    //noArgs
    public Cliente() {

    }

}
