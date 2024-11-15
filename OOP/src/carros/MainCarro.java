package carros;

public class MainCarro {

    public static void main(String[] args) {
        Carro palio = new Carro();
        palio.modelo  = "Palio Celebration";
        palio.cavalos = 72;
        palio.transmissao = "Manual";
        palio.cor = "Prata";
        palio.fabricante = "Fiat";
        palio.capacidadeTanque = 50;
        palio.combustivel = 0;
        palio.kmPorLitros = 12;

        Carro celta = new Carro();
        celta.modelo  = "Celta";
        celta.cavalos = 68;
        celta.transmissao = "Manual";
        celta.cor = "Preto";
        celta.fabricante = "Chevrolet";
        celta.capacidadeTanque = 48;
        celta.combustivel = 15;
        celta.kmPorLitros = 11;

        System.out.println("Palio: " + palio.combustivel);
        System.out.println("Celta: " + celta.combustivel);

        palio.abastecer(100);
        celta.abastecer(50);


        System.out.println("Palio(depois de abastecer): " + palio.combustivel);
        System.out.println("Celta(depois de abastecer): " + celta.combustivel);

        System.out.println("Autonomia Palio: " + palio.autonomiaCombustivel());
        System.out.println("Autonomia Celta: " + celta.autonomiaCombustivel());



    }
}
