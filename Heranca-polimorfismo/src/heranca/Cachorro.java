package heranca;

public class Cachorro extends Animal{

    public int forcaMordida;


    public Cachorro(int idade, int forcaMordida){
        super("Cachorro", idade);
        this.forcaMordida = forcaMordida;
    }

    public void latir(){
        System.out.println(getNome() + " está latindo");
    }

    public void correrAtrasDeMoto(){
        System.out.println(getNome() + " está correndo atrás de moto");
    }
}
