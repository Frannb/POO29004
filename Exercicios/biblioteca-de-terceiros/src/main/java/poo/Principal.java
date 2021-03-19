package poo;


import edu.princeton.cs.algs4.StdDraw;

public class Principal {

    public static void main(String[] args) {
        double d0 = Double.parseDouble(linhasep[0]);
        double d1 = Double.parseDouble(linhasep[1]);
        double d2 = Double.parseDouble(linhasep[2]);

        StdDraw.setPenColor(StdDraw.PINK);
        StdDraw.circle(d0, d1, d2);
        StdDraw.setPenColor(StdDraw.RED);
        StdDraw.square(0.1, 0.1, 0.1);
        StdDraw.setPenColor(StdDraw.BLUE);
        //StdDraw.line(0.5, 0.5, 0.9, 0.5);
        //StdDraw.line(0.9, 0.5, 0.5, 0.8);
        //StdDraw.line(0.5, 0.8, 0.5, 0.5);
        //StdDraw.circle(0.7, 0.65, 0.25);
    }
}
