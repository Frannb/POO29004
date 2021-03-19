package poo;
import edu.princeton.cs.algs4.StdDraw;

import javax.swing.JOptionPane;
import java.awt.*;
import java.util.ArrayList;

public class Principal {
    public static final int AREA = 600;
    public static void main(String[] args) {

        StdDraw.setCanvasSize(AREA, AREA); //definindo a área de exploração
        StdDraw.setScale(0, AREA); // definindo a escala da área de desenho
        Color corPreta = Color.BLACK;
        Color corVermelha = Color.RED;

        ArrayList<Soldado> listaSoldados = new ArrayList<>();
        int i = 1;
        for (;;){
            String s = JOptionPane.showInputDialog("======================================\n" +
                    " 1 - Criar soldado;\n" +
                    " 2 - Verificar total de soldados;\n" +
                    " 3 - Movimentar um soldado;\n" +
                    " 4 - Movimentar todos os soldados;\n" +
                    " 5 - Atacar;\n" +
                    " 0 - Sair.\n");
            //convertendo String para int
            int opcao = Integer.parseInt(s);

            switch (opcao) {
                case 1:
                    //FIXME Cria os soldados
                    if (i <= 10) {
                        String sx = JOptionPane.showInputDialog("Digite a coordenada X: ");
                        //convertendo String para int
                        int x = Integer.parseInt(sx);

                        String sy = JOptionPane.showInputDialog("Digite a coordenada Y: ");
                        //convertendo String para int
                        int y = Integer.parseInt(sy);

                        listaSoldados.add(new Soldado(i,x, y));
                        StdDraw.setPenColor(corPreta);
                        StdDraw.text(x,y,".");
                        StdDraw.pause(1000);
                        i++;
                    } else {
                        JOptionPane.showMessageDialog(null, "AJUDA!\n" + "Número máximo de soldados criados");
                    }
                    break;

                case 2:
                    //FIXME Total de soldados
                    JOptionPane.showMessageDialog(null, listaSoldados.size());
                    break;

                case 3:
                    //FIXME movimenta um soldado
                    String sm = JOptionPane.showInputDialog("Qual soldado deseja movimentar? ");
                    //convertendo String para int
                    int m = Integer.parseInt(sm);

                    String sd = JOptionPane.showInputDialog("Qual a distância deseja movimentar o soldado? ");
                    int d = Integer.parseInt(sd);

                    for (Soldado soldado : listaSoldados) {
                        if(soldado.getnSoldado() == m){
                            if (d > 0){
                                soldado.movimentar(d);
                                StdDraw.setPenColor(corVermelha);
                                StdDraw.text(soldado.getX(),soldado.getY(),".");
                                StdDraw.pause(1000);
                                JOptionPane.showMessageDialog(null, "Soldado movimentado!");
                            }else{
                                soldado.movimentar();
                                StdDraw.setPenColor(corVermelha);
                                StdDraw.text(soldado.getX(),soldado.getY(),".");
                                StdDraw.pause(1000);
                                JOptionPane.showMessageDialog(null, "Soldado movimentado!");
                            }
                        }
                        break;
                    }
                    break;

                case 4:
                    //FIXME movimenta todos os soldados
                    String sdt = JOptionPane.showInputDialog("Deseja inserir a distância (S/N)? ");

                    if (sdt.equals("S")) {
                        String sdm = JOptionPane.showInputDialog("Qual a distância deseja movimentar os soldados? ");
                        int dm = Integer.parseInt(sdm);
                        for (Soldado soldado : listaSoldados) {
                            if (dm > 0) {
                                soldado.movimentar(dm);
                                StdDraw.setPenColor(corVermelha);
                                StdDraw.text(soldado.getX(), soldado.getY(), ".");
                                StdDraw.pause(1000);
                            }
                        }
                    } else {
                        for (Soldado soldado : listaSoldados) {
                            soldado.movimentar();
                            StdDraw.setPenColor(corVermelha);
                            StdDraw.text(soldado.getX(), soldado.getY(), ".");
                            StdDraw.pause(1000);
                        }
                    }
                    JOptionPane.showMessageDialog(null, "Soldados movimentados!");
                    break;

                case 5:
                    //FIXME ataca
                    if (i > 3) {
                        // TODO NÃO PODE USAR O COMPRIMENTO PARA VERIFICAR A QUANTIDADE DE SOLDADOS
                        if (listaSoldados.size() >= 3) {
                            String sia = JOptionPane.showInputDialog("Deseja inserir uma arma (S/N)? ");
                            if (sia.equals("S")) {
                                String arma = JOptionPane.showInputDialog("Com qual arma deseja atacar(fuzil/baioneta/punho) ? ");

                                for (Soldado soldado : listaSoldados) {
                                    soldado.atacar(arma);
                                }
                                JOptionPane.showMessageDialog(null, "Ataque com " + arma + " realizado!");
                            }else {
                                for (Soldado soldado : listaSoldados) {
                                    soldado.atacar();
                                }
                                JOptionPane.showMessageDialog(null, "Ataque realizado!");
                            }
                        }
                        break;
                    } else {
                        JOptionPane.showMessageDialog(null, "Ainda não, espere o exército ficar maior!");
                    }
                    break;

                case 0:
                    System.exit(0);
                default:
                    System.out.println("Opção inválida!");
                    System.exit(-1);
                    break;
            }
        }
    }
}
