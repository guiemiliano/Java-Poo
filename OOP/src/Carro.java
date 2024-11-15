public class Carro {
    //propriedades ou atributos
    String modelo;
    int cavalos;
    String transmissao;
    String cor;
    String fabricante;
    int capacidadeTanque;
    int combustivel;

    //no args constructor
    public Carro() {
    }
    //all args constructor
    public Carro(String modelo, int cavalos, String transmissao, String cor, String fabricante, int ano) {
        this.modelo = modelo;
        this.cavalos = cavalos;
        this.transmissao = transmissao;
        this.cor = cor;
        this.fabricante = fabricante;
    }


    //Nome de método com letra minúscula
    public int abastecer(int litros){
        return combustivel += litros;
    }


}
