package poo;
import edu.princeton.cs.algs4.StdDraw;

import java.util.ArrayList;
import java.util.Scanner;
import java.awt.Color;


public class Principal {
    private static int d0;
    private static double d1 = 0, d2 = 0;
    private static String d3 = null;
    private static ArrayList<String> listaComandos  = new ArrayList<>();

    public void abrirArquivo() {
        Scanner entrada = new Scanner(System.in);
        int i = 0;
        while (entrada.hasNext()) {
            String linha = entrada.nextLine();
            if (i == 0) {
                String[] linhasep = linha.split(",");
                d0 = Integer.parseInt(linhasep[0]);
                d1 = Double.parseDouble(linhasep[1]);
                d2 = Double.parseDouble(linhasep[2]);
                d3 = linhasep[3];
                i++;
            } else {
                listaComandos.add(linha);
                i++;
            }
        }
    }

    public static void main(String[] args) {

        Principal p = new Principal();
        p.abrirArquivo();
        Color corPreta = Color.BLACK;

        StdDraw.setCanvasSize(d0, d0); //definindo a área de exploração
        StdDraw.setScale(0, d0); // definindo a escala da área de desenho

        Robo r = new Robo(d1, d2, d3);
        //Robo r = new Robo();

        for (String elemento : listaComandos) {
            if (elemento.equals("M")) {
                r.M();
                StdDraw.setPenColor(corPreta);
                StdDraw.line(r.getxAnterior(), r.getyAnterior(), r.getxAtual(), r.getyAtual());
                StdDraw.pause(1000);
                if (r.M()) {
                    System.out.println("Robô deslocado");
                }
            } else if (elemento.equals("D")) {
                r.D();
            } else if (elemento.equals("E")) {
                r.E();
            } else {
                System.out.println("Comando inválido!");
            }
        }
    }
}
