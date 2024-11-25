public class Main {
    public static void main(String[] args) {

        Gato salem = new Gato();
        Cachorro mel = new Cachorro();

        salem.nome = "Salem";
        salem.cor = "Preto";
        salem.idade = 150;
        salem.peso = 10;

        salem.miar();
        salem.subirEmTelhado();

        mel.nome = "Mel";
        mel.cor = "Caramelo";
        mel.idade = 10;
        mel.peso = 8;

        mel.latir();
        mel.correrAtrasDeMoto();


    }
}
