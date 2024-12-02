package empresa;

public class Main {
    public static void main(String[] args) {
        Tecnico tecnico = new Tecnico();
        tecnico.setNome("Silvio");
        tecnico.setSalario(1500);
        tecnico.setCpf("1231221212");

        tecnico.imprimirRemuneracao();
        tecnico.bonificacaoAnual();

        Gerente gerente = new Gerente();
        gerente.setNome("Fabio");
        gerente.setSalario(3000);
        gerente.setCpf("121212135");

        gerente.imprimirRemuneracao();
        gerente.bonificacaoAnual();


    }
}
