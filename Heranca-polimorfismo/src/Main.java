public class Main {
    public static void main(String[] args) {

        Gato salem = new Gato();
        Cachorro mel = new Cachorro();

        salem.setNome("Salem");
        salem.setIdade(150);

        salem.miar();
        salem.subirEmTelhado();

        mel.setNome("Mel");
        mel.setIdade(10);


        mel.latir();
        mel.correrAtrasDeMoto();
;



    }
}
