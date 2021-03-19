package poo;

public class Soldado {
    private double x;
    private double y;
    private double d;
    private int nSoldado;
    private String arma;

    public Soldado(int nSoldado, double x, double y) {
        try{
            this.x = x;
            this.y = y;
            this.nSoldado = nSoldado;
        }catch (Exception e){
            System.exit(-1);
        }
    }

    public void atacar(){
        this.arma = "fuzil";
    }

    public void atacar(String arma){
        if (arma.equals("fuzil")) {
            this.arma = arma;
        } else if (arma.equals("baioneta")) {
            this.arma = arma;
        } else if (arma.equals("punho")) {
            this.arma = arma;
        }
    }

    public void movimentar(){
        this.x = this.x + 5;
    }

    public void movimentar(double d){
        this.x = this.x + d;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public int getnSoldado() {
        return nSoldado;
    }
}
