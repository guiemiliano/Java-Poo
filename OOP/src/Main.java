
public class Main {

    public static void main(String[] args) {
        Carro palio = new Carro();
        palio.modelo  = "Palio Celebration";
        palio.fabricante = "Fiat";
        palio.transmissao = "Manual";
        palio.ligar();


        System.out.println("Transmissão do " + palio.modelo + " : " + palio.transmissao );


        Carro celta = new Carro("Celta", 70,
                "Cinza", "Manual");
        celta.ligar();






    }
}
