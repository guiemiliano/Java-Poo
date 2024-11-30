package heranca;

public class Gato extends Animal{

    int forcaArranhar;

    public Gato(int idade, int forcaArranhar) {
        super("Gato", idade);
        this.forcaArranhar = forcaArranhar;
    }

    @Override
    public void acaoAnimal() {
        System.out.println(getNome() + " está miando");
    }

    public void subirEmTelhado(){
        System.out.println(getNome() + " está subindo no telhado");
    }



}

