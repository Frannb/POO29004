package poo;

public class Coordenadas {
    private double x;
    private double y;
    private double z;
    private int cont;
    private double xPartida;
    private double yPartida;
    private double zPartida;

    public Coordenadas(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
        cont++;
        if (getCont() == 0){
            this.xPartida = x;
            this.yPartida = y;
            this.zPartida = z;
        }
    }

    public Coordenadas(double x, double y) {
        this.x = x;
        this.y = y;
        this.z = 0;
        if (getCont() == 0){
            this.xPartida = x;
            this.yPartida = y;
            this.zPartida = z;
        }
    }

    public String getPosicaoAtual() {
        return "Posição atual: (" + x + ", " + y + ", " + z + ")";
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }

    public int getCont() {
        return cont;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getxPartida() {
        return xPartida;
    }

    public double getyPartida() {
        return yPartida;
    }

    public double getzPartida() {
        return zPartida;
    }
}
