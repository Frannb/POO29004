package poo;
import edu.princeton.cs.algs4.StdOut;
import javax.sound.midi.Soundbank;

public class Retangulo {
    //Atributor do v1 e v2
    private double x1;
    private double y1;
    private double x2;
    private double y2;

    //construtores do v1 e v2
    public Retangulo(double xc1, double yc1, double xc2, double yc2) {
        if (((xc1 <= 600) && (xc1 >= 0)) && ((yc1 <= 600) && (yc1 >= 0)) && ((xc2 <= 600) && (xc2 >= 1)) && ((yc2 <= 600) && (yc2 >= 1))) {
            this.x1 = xc1;
            this.y1 = yc1;
            this.x2 = xc2;
            this.y2 = yc2;
        }else {
            this.x1 = 0;
            this.y1 = 0;
            this.x2 = 10;
            this.y2 = 10;
        }
    }

    public boolean update(double xu1, double yu1, double xu2, double yu2){
        if (((xu1 <= 600) && (xu1 >= 0)) && ((yu1 <= 600) && (yu1 >= 0)) && ((xu2 <= 600) && (xu2 >= 1)) && ((yu2 <= 600) && (yu2 >= 1))) {
            this.x1 = xu1;
            this.y1 = yu1;
            this.x2 = xu2;
            this.y2 = yu2;
            return true;
        } else {
            return false;
        }
    }

    public String toString() {
        return "v1: (" + this.x1 + "," + this.y1 + ") e v2: (" + this.x2 + "," + this.y2 + ")";
    }

    public double getX1() {return x1;}
    public double getY1() {return y1;}
    public double getX2() {return x2;}
    public double getY2() {return y2;}

}
