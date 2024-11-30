package heranca;

public class Gato extends Animal{


    public Gato(String nome, int idade) {
        super("Gato", idade);
    }

    public void miar(){
        System.out.println(getNome() + " está miando");
    }

    public void subirEmTelhado(){

        System.out.println(getNome() + " está subindo no telhado");
    }

}

