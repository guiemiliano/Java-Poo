public class Carro {
    //propriedades ou atributos
    String modelo;
    int cavalos;
    String transmissao;
    String cor;
    String fabricante;
    int capacidadeTanque;
    int combustivel;
    int kmPorLitros;

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
        int sobra = litros - capacidadeTanque;
        if(litros <= capacidadeTanque) {
            return combustivel += litros;
        }else{
            System.out.println(modelo +" foi abastecido somente até " + capacidadeTanque +
                    " litros pois é sua capacidade máxima de tanque, sobraram " + sobra + " litros." );
            return combustivel = capacidadeTanque;
        }
    }

    public int autonomiaCombustivel(){
        int autonomia = kmPorLitros * combustivel;
        return autonomia;
    }


}
