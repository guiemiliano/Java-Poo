
public class Main {

    public static void main(String[] args) {
        Carro palio = new Carro();
        palio.modelo  = "Palio Celebration";
        palio.fabricante = "Fiat";
        palio.ligar();

        Carro celta = new Carro("Celta", 70,
                "Cinza", "Automático");
        celta.ligar();




    }
}
