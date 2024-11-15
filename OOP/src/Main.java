
public class Main {

    public static void main(String[] args) {
        Carro palio = new Carro();
        palio.modelo  = "Palio Celebration";
        palio.cavalos = 72;
        palio.transmissao = "Manual";
        palio.cor = "Cinza";
        palio.fabricante = "Fiat";
        palio.capacidadeTanque = 50;
        palio.combustivel = 0;

        Carro celta = new Carro();
        celta.modelo  = "Celta";
        celta.cavalos = 68;
        celta.transmissao = "Manual";
        celta.cor = "Preto";
        celta.fabricante = "Chevrolet";
        celta.capacidadeTanque = 48;
        celta.combustivel = 15;

        System.out.println("Palio: " + palio.combustivel);
        System.out.println("Celta: " + celta.combustivel);

        palio.abastecer(20);
        celta.abastecer(30);

        System.out.println("Palio(depois de abastecer): " + palio.combustivel);
        System.out.println("Celta(depois de abastecer): " + celta.combustivel);





    }
}
