package poo;

import personagens.*;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Tela extends JPanel {
    private ArrayList<Personagem> listaPersonagem;

    public Tela() {
        this.setBackground(Color.white);
        this.listaPersonagem = new ArrayList<>();
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        listaPersonagem.forEach(personagem -> personagem.desenhar(g));
        g.dispose();
    }

    public void criarPersonagem(int x, int y, String tipo) {
        switch (tipo) {
            case "aldeao":
                Aldeao al = new Aldeao(this, "aldeao", x, y);
                al.desenhar(super.getGraphics());
                listaPersonagem.add(al);
                break;
            case "arqueiro":
                Arqueiro ar = new Arqueiro(this, "arqueiro", x, y);
                ar.desenhar(super.getGraphics());
                listaPersonagem.add(ar);
                    break;
            case"cavaleiro":
                Cavaleiro cav = new Cavaleiro(this, "cavaleiro", x, y);
                cav.desenhar(super.getGraphics());
                listaPersonagem.add(cav);
                break;
            case"guerreiro":
                Guerreiro gue = new Guerreiro(this, "guerreiro", x, y);
                gue.desenhar(super.getGraphics());
                listaPersonagem.add(gue);
                break;
        }
    }

    public void movimentarPersonagem(int direcao, String tipo) {
        switch (tipo) {
            case "aldeao":
                for (Personagem aldeao : listaPersonagem) {
                    if (aldeao instanceof Aldeao) {
                        aldeao.mover(direcao);
                    }
                }
                this.repaint();
                break;
            case "arqueiro":
                for (Personagem arqueiro : listaPersonagem) {
                    if (arqueiro instanceof Arqueiro) {
                        arqueiro.mover(direcao);
                    }
                }
                this.repaint();
                break;
            case "cavaleiro":
                for (Personagem cavaleiro : listaPersonagem) {
                    if (cavaleiro instanceof Cavaleiro) {
                        cavaleiro.mover(direcao);
                    }
                }
                this.repaint();
                break;
            case "guerreiro":
                for (Personagem guerreiro : listaPersonagem) {
                    if (guerreiro instanceof Guerreiro) {
                        guerreiro.mover(direcao);
                    }
                }
                this.repaint();
                break;
        }
    }


    public void atacarPersonagem(String tipo) {
        switch (tipo) {
            case "aldeao":
                for(Personagem aldeao : listaPersonagem) {
                    if (aldeao instanceof Aldeao) {
                        aldeao.atacar();
                    }
                }
                this.repaint();
                break;
            case "arqueiro":
                for(Personagem arqueiro : listaPersonagem) {
                    if (arqueiro instanceof Arqueiro) {
                        arqueiro.atacar();
                    }
                }
                this.repaint();
                break;
            case "cavaleiro":
                for(Personagem cavaleiro : listaPersonagem) {
                    if (cavaleiro instanceof Cavaleiro) {
                        cavaleiro.atacar();
                    }
                }
                this.repaint();
                break;
            case "guerreiro":
                for(Personagem guerreiro : listaPersonagem) {
                    if (guerreiro instanceof Guerreiro) {
                        guerreiro.atacar();
                    }
                }
                this.repaint();
                break;
        }
    }
}