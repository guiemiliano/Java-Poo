package heranca;

public class Main {
    public static void main(String[] args) {

        Gato gato = new Gato(6, 10);
        gato.mostrarInformacoes();
        gato.acaoAnimal();
        gato.subirEmTelhado();

        System.out.println("----------------------------");

        Cachorro cachorro = new Cachorro(7, 20);
        cachorro.mostrarInformacoes();
        cachorro.acaoAnimal();
        cachorro.correrAtrasDeMoto();

    }
}
