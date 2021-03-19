package poo;
import edu.princeton.cs.algs4.StdDraw;
import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        while (entrada.hasNext()) {
            String linha = entrada.nextLine();
            //System.out.println(linha);

            //Separa a linha dos espaço em vetores
            String [] linhasep = linha.split(" ");

            double d0 = Double.parseDouble(linhasep[0]);
            double d1 = Double.parseDouble(linhasep[1]);
            double d2 = Double.parseDouble(linhasep[2]);

            StdDraw.setPenColor(StdDraw.PINK);
            StdDraw.circle(d0, d1, d2);

            if ((d0 > 1.0) || (d1 > 1.0) || (d2 > 1.0)){
                System.out.println("Erro! Número maior que 1.0");
                System.exit(1);
            }
            if ((d0 < 0.0) || (d1 < 0.0) || (d2 < 0.0)){
                System.out.println("Erro! Número menor que 0.0");
                System.exit(1);
            }
        }
    }
}
