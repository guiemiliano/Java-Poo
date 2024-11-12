import javax.swing.*;

public class Main{
    public static void main(String[] args) {
        JFrame janela = new JFrame();
        janela.setTitle("Meu primeiro Programa!");
        janela.setSize(500, 500);
        janela.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        //Componentes
        //Insere o texto Nome:
        JLabel labelNome = new JLabel("Nome:");
        labelNome.setBounds(20,20,50,20);

        //insere um campo pra digitar o nome
        JTextField campoTextoNome = new JTextField();
        campoTextoNome.setBounds(20,40,200,20);

        JTextField campoSobrenome = new JTextField();
        campoSobrenome.setBounds(20,60,200,20);

        //Insere o botão enviar
        JButton botaoEnviar = new JButton("Enviar");
        botaoEnviar.setBounds(20,80,100,20);

        //Evento de clique             //lambda
        botaoEnviar.addActionListener(event -> {
            String nomeDigitado = campoTextoNome.getText();
            String sobrenomeDigitado = campoSobrenome.getText();

            JOptionPane.showMessageDialog(janela, "Olá " + nomeDigitado
                    + " " + sobrenomeDigitado + "! \n" +
                    "Seja bem vindo!!!");
        });

        //configurações de layout
        janela.setLayout(null);
        janela.getContentPane().add(labelNome);
        janela.getContentPane().add(campoTextoNome);
        janela.getContentPane().add(campoSobrenome);
        janela.getContentPane().add(botaoEnviar);


        janela.setVisible(true);
    }
}