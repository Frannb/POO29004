package poo;

import edu.princeton.cs.algs4.StdDraw;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        StdDraw.setCanvasSize(600, 600); //definindo a área de desenho
        StdDraw.setScale(0, 600); // definindo a escola da área de desenho

        String guardaTorre[] = new String[10];
        int i = 0;

        Scanner entrada = new Scanner(System.in);
        while (entrada.hasNext()) {
            guardaTorre[i]= entrada.nextLine();
            i++;
        }

        for (int j = 0; j < 10; j++){
            String [] linhasep = guardaTorre[j].split(" ");

            double d0 = Double.parseDouble(linhasep[0]);
            double d1 = Double.parseDouble(linhasep[1]);
            double d2 = Double.parseDouble(linhasep[2]);

            StdDraw.setPenColor(StdDraw.RED);
            StdDraw.circle(d0, d1, d2);

            Torre t = new Torre(d0, d1, d2);

            double a0 = Double.parseDouble(args[0]);
            double a1 = Double.parseDouble(args[1]);

            if(args.length > 0){
                if(t.verificarCobertura(a0,a1)){
                    System.out.println("Está na cobertura da " + (1+j) + " torre! ");
                    StdDraw.setPenColor(StdDraw.BLACK);
                    StdDraw.text(a0,a1,".");
                }
            }
        }
    }
}
