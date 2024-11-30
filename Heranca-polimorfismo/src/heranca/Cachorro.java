package heranca;

public class Cachorro extends Animal{

    public int forcaMordida;


    public Cachorro(int idade, int forcaMordida){
        super("Cachorro", idade);
        this.forcaMordida = forcaMordida;
    }

    //Polimorfismo na prática, sobrescrevi o método da superclasse
    @Override
    public void acaoAnimal() {
        System.out.println(getNome() + " está latindo");
    }

    public void correrAtrasDeMoto(){
        System.out.println(getNome() + " está correndo atrás de moto");
    }
}
