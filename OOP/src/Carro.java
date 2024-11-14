public class Carro {
    String modelo;
    int cavalos;
    String transmissao;
    String cor;
    String fabricante;


    public Carro() {
    }

    public Carro(String modelo, int cavalos, String transmissao, String cor, String fabricante, int ano) {
        this.modelo = modelo;
        this.cavalos = cavalos;
        this.transmissao = transmissao;
        this.cor = cor;
        this.fabricante = fabricante;
    }

    public Carro(String modelo, int cavalos, String cor, String transmissao) {
        this.modelo = modelo;
        this.cavalos = cavalos;
        this.cor = cor;
        this.transmissao = transmissao;
    }

    public void ligar(){
        System.out.println("Você ligou o carro " + modelo);
    }

    public void darRe(){
        System.out.println("Você deu ré no carro " + modelo);
    }

    public void acionarFreioDeMao(){
        System.out.println("Você acionou o freio de mão do seu carro " + modelo);
    }
    public void ligarFarol(){
        System.out.println("Você ligou o farol do carro" + modelo);
    }

}
