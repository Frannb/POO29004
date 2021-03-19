package poo;

import edu.princeton.cs.algs4.StdOut;

import javax.sound.midi.Soundbank;

public class Torre{
    private double x;
    private double y;
    private double r;

    public Torre(double xc, double yc, double rc){
        try {
            if ((x >= 0 && x <= 600) && (y >= 0 && y <= 600) && (r >= 0 && r <= 600)) {
                //if (((x >= 600) || (x <= 0)) && ((y >= 600) || (y <= 0)) && ((r >= 600) || (r <= 0))){
                this.x = xc;
                this.y = yc;
                this.r = rc;
            }
        } catch (Exception e) {
            System.exit(-1);
        }
    }
    /*
    public Torre(double xc, double yc){
        if ((x >= 0 && x <= 600) && (y >= 0 && y <= 600)) {
            this.x = xc;
            this.y = yc;
            this.r = 0;
        }
    }

    public Torre(double xc){
        if ((x >= 0 && x <= 600)) {
            this.x = xc;
            this.y = 0;
            this.r = 0;
        }
    }

    public Torre(){
        this.x = 0;
        this.y = 0;
        this.r = 0;
    }*/

    public boolean verificarCobertura(double px, double py) {
        double eq = Math.sqrt((Math.pow((px-this.x),2)) + (Math.pow((py-this.y),2)));
        if (eq <= this.r){
            return true;
        }
        return false;
    }



}
