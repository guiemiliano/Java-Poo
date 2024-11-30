package heranca;

public abstract class Animal {
    //isso é uma superclasse, pois ela tem classes filhas

    /*
        public -> visível em qualquer lugar
        private -> visível apenas na própria classe
        package ou default -> somente dentro do pacote
        protected -> dentro das classes filhas OU pacote
     */
    private String nome;
    private int idade;

    public Animal(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {

        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void andar(){
        System.out.println("Andando...");
    }

    public void comer(){
        System.out.println("Comendo...");
    }

    public void dormir(){
        System.out.println("Dormindo...");
    }

    public void mostrarInformacoes(){
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }

    public abstract void acaoAnimal();


}

