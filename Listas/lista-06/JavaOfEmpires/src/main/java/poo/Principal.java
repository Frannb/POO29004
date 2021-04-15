package poo;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Principal {
    private JPanel principal;
    private JPanel painelLateral;
    private JPanel painelTela;
    private JButton bCriaAldeao;
    private JButton bCriaArqueiro;
    private JButton bCriaCavaleiro;
    private JButton bCriaGuerreiro;
    private JRadioButton todosRadioButton;
    private JRadioButton aldeaoRadioButton;
    private JRadioButton arqueiroRadioButton;
    private JRadioButton cavaleiroRadioButton;
    private JRadioButton guerreiroRadioButton;
    private JButton atacarButton;
    private JButton buttonCima;
    private JButton buttonEsquerda;
    private JButton buttonBaixo;
    private JButton buttonDireita;
    private JLabel logo;
    private Random sorteio;


    public Principal() {
        this.sorteio = new Random();

        atacarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //TODO preciso ser melhorado
                if (aldeaoRadioButton.isSelected()) {
                    ((Tela) painelTela).atacarPersonagem("aldeao");
                }
                if (arqueiroRadioButton.isSelected()) {
                    ((Tela) painelTela).atacarPersonagem("arqueiro");
                }
                if (cavaleiroRadioButton.isSelected()) {
                    ((Tela) painelTela).atacarPersonagem("cavaleiro");
                }
                if (guerreiroRadioButton.isSelected()) {
                    ((Tela) painelTela).atacarPersonagem("guerreiro");
                }
                if (todosRadioButton.isSelected()) {
                    ((Tela) painelTela).atacarPersonagem("aldeao");
                    ((Tela) painelTela).atacarPersonagem("arqueiro");
                    ((Tela) painelTela).atacarPersonagem("cavaleiro");
                    ((Tela) painelTela).atacarPersonagem("guerreiro");
                }
            }
        });
        buttonCima.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //TODO preciso ser melhorado
                if (aldeaoRadioButton.isSelected()) {
                    ((Tela) painelTela).movimentarPersonagem(0,"aldeao");
                }
                if (arqueiroRadioButton.isSelected()) {
                    ((Tela) painelTela).movimentarPersonagem(0,"arqueiro");
                }
                if (cavaleiroRadioButton.isSelected()) {
                    ((Tela) painelTela).movimentarPersonagem(0,"cavaleiro");
                }
                if (guerreiroRadioButton.isSelected()) {
                    ((Tela) painelTela).movimentarPersonagem(0,"guerreiro");
                }
                if (todosRadioButton.isSelected()) {
                    ((Tela) painelTela).movimentarPersonagem(0,"aldeao");
                    ((Tela) painelTela).movimentarPersonagem(0,"arqueiro");
                    ((Tela) painelTela).movimentarPersonagem(0,"cavaleiro");
                    ((Tela) painelTela).movimentarPersonagem(0,"guerreiro");
                }
            }
        });
        buttonBaixo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //TODO preciso ser melhorado
                if (aldeaoRadioButton.isSelected()) {
                    ((Tela) painelTela).movimentarPersonagem(1,"aldeao");
                }
                if (arqueiroRadioButton.isSelected()) {
                    ((Tela) painelTela).movimentarPersonagem(1,"arqueiro");
                }
                if (cavaleiroRadioButton.isSelected()) {
                    ((Tela) painelTela).movimentarPersonagem(1,"cavaleiro");
                }
                if (guerreiroRadioButton.isSelected()) {
                    ((Tela) painelTela).movimentarPersonagem(1,"guerreiro");
                }
                if (todosRadioButton.isSelected()) {
                    ((Tela) painelTela).movimentarPersonagem(1,"aldeao");
                    ((Tela) painelTela).movimentarPersonagem(1,"arqueiro");
                    ((Tela) painelTela).movimentarPersonagem(1,"cavaleiro");
                    ((Tela) painelTela).movimentarPersonagem(1,"guerreiro");
                }

            }
        });
        buttonEsquerda.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //TODO preciso ser melhorado
                if (aldeaoRadioButton.isSelected()) {
                    ((Tela) painelTela).movimentarPersonagem(2,"aldeao");
                }
                if (arqueiroRadioButton.isSelected()) {
                    ((Tela) painelTela).movimentarPersonagem(2,"arqueiro");
                }
                if (cavaleiroRadioButton.isSelected()) {
                    ((Tela) painelTela).movimentarPersonagem(2,"cavaleiro");
                }
                if (guerreiroRadioButton.isSelected()) {
                    ((Tela) painelTela).movimentarPersonagem(2,"guerreiro");
                }
                if (todosRadioButton.isSelected()) {
                    ((Tela) painelTela).movimentarPersonagem(2,"aldeao");
                    ((Tela) painelTela).movimentarPersonagem(2,"arqueiro");
                    ((Tela) painelTela).movimentarPersonagem(2,"cavaleiro");
                    ((Tela) painelTela).movimentarPersonagem(2,"guerreiro");
                }
            }
        });
        buttonDireita.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //TODO preciso ser melhorado
                if (aldeaoRadioButton.isSelected()) {
                    ((Tela) painelTela).movimentarPersonagem(3,"aldeao");
                }
                if (arqueiroRadioButton.isSelected()) {
                    ((Tela) painelTela).movimentarPersonagem(3,"arqueiro");
                }
                if (cavaleiroRadioButton.isSelected()) {
                    ((Tela) painelTela).movimentarPersonagem(3,"cavaleiro");
                }
                if (guerreiroRadioButton.isSelected()) {
                    ((Tela) painelTela).movimentarPersonagem(3,"guerreiro");
                }
                if (todosRadioButton.isSelected()) {
                    ((Tela) painelTela).movimentarPersonagem(3,"aldeao");
                    ((Tela) painelTela).movimentarPersonagem(3,"arqueiro");
                    ((Tela) painelTela).movimentarPersonagem(3,"cavaleiro");
                    ((Tela) painelTela).movimentarPersonagem(3,"guerreiro");
                }
            }
        });

        bCriaAldeao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //obtendo o tamanho do JPanel TELA
                int largura = painelTela.getWidth();
                int altura = painelTela.getHeight();

                // criando o aldeao em um local aleatorio
                int x = sorteio.nextInt(largura - 50);
                int y = sorteio.nextInt(altura - 50);
                if (x < 0) { // garantindo que x não esteja fora do limite do JPanel
                    x = 0;
                }
                if (y < 0) { // garantindo que x não esteja fora do limite do JPanel
                    y = 0;
                }

                // invocando o método criarAldeao da classe Tela.
                // Foi necessário a coerção de tipos pois painelTela é do tipo JPanel.
                // Isso só foi possível pois Tela é uma subclasse de JPanel.
                //((Tela) painelTela).criarAldeao(x, y);
                ((Tela) painelTela).criarPersonagem(x, y, "aldeao");
            }
        });

        bCriaArqueiro.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //obtendo o tamanho do JPanel TELA
                int largura = painelTela.getWidth();
                int altura = painelTela.getHeight();

                // criando o aldeao em um local aleatorio
                int x = sorteio.nextInt(largura - 50);
                int y = sorteio.nextInt(altura - 50);
                if (x < 0) { // garantindo que x não esteja fora do limite do JPanel
                    x = 0;
                }
                if (y < 0) { // garantindo que x não esteja fora do limite do JPanel
                    y = 0;
                }

                // invocando o método criarAldeao da classe Tela.
                // Foi necessário a coerção de tipos pois painelTela é do tipo JPanel.
                // Isso só foi possível pois Tela é uma subclasse de JPanel.
                //((Tela) painelTela).criarArqueiro(x, y);
                ((Tela) painelTela).criarPersonagem(x, y, "arqueiro");
            }
        });
        bCriaCavaleiro.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //obtendo o tamanho do JPanel TELA
                int largura = painelTela.getWidth();
                int altura = painelTela.getHeight();

                // criando o aldeao em um local aleatorio
                int x = sorteio.nextInt(largura - 50);
                int y = sorteio.nextInt(altura - 50);
                if (x < 0) { // garantindo que x não esteja fora do limite do JPanel
                    x = 0;
                }
                if (y < 0) { // garantindo que x não esteja fora do limite do JPanel
                    y = 0;
                }

                // invocando o método criarAldeao da classe Tela.
                // Foi necessário a coerção de tipos pois painelTela é do tipo JPanel.
                // Isso só foi possível pois Tela é uma subclasse de JPanel.
                //((Tela) painelTela).criarCavaleiro(x, y);
                ((Tela) painelTela).criarPersonagem(x, y, "cavaleiro");
            }
        });
        bCriaGuerreiro.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //obtendo o tamanho do JPanel TELA
                int largura = painelTela.getWidth();
                int altura = painelTela.getHeight();

                // criando o aldeao em um local aleatorio
                int x = sorteio.nextInt(largura - 50);
                int y = sorteio.nextInt(altura - 50);
                if (x < 0) { // garantindo que x não esteja fora do limite do JPanel
                    x = 0;
                }
                if (y < 0) { // garantindo que x não esteja fora do limite do JPanel
                    y = 0;
                }

                // invocando o método criarAldeao da classe Tela.
                // Foi necessário a coerção de tipos pois painelTela é do tipo JPanel.
                // Isso só foi possível pois Tela é uma subclasse de JPanel.
                ((Tela) painelTela).criarPersonagem(x, y, "guerreiro");
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Java of Empires");
        Principal p = new Principal();
        frame.setContentPane(p.principal);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // não será possível redimensionar a janela
        frame.setResizable(false);
        frame.pack();

        // janela deverá ficar centralizada
        frame.setLocationRelativeTo(null);

        frame.setVisible(true);
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
        this.painelTela = new Tela();
    }
}