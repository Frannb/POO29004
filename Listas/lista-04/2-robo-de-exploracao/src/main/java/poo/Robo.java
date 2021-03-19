package poo;

public class Robo {
    private double xAtual;
    private double yAtual;
    private double xAnterior;
    private double yAnterior;
    private String pontosCardeais;

    //FIXME Construtor da class
    public Robo() {
        this.xAtual = 0;
        this.yAtual = 0;
        this.pontosCardeais = "N";
    }

    public Robo(double x, double y, String pontosCardeais) {
       try {
           if (x >= 0 && x <= 600) {
               this.xAtual = x;
               this.yAtual = y;
               if (pontosCardeais.equals("N")) {
                   this.pontosCardeais = pontosCardeais;
               } else if (pontosCardeais.equals("L")) {
                   this.pontosCardeais = pontosCardeais;
               } else if (pontosCardeais.equals("S")) {
                   this.pontosCardeais = pontosCardeais;
               } else if (pontosCardeais.equals("O")) {
                   this.pontosCardeais = pontosCardeais;
               }
           }
       }catch (Exception e){
           System.exit(-1);
       }
    }

    //FIXME Girar para esquerda
    public void E(){
        if (this.pontosCardeais.equals("N")){
            this.pontosCardeais = "L";
        }
        else if (this.pontosCardeais.equals("L")){
            this.pontosCardeais = "S";
        }
        else if (this.pontosCardeais.equals("S")){
            this.pontosCardeais = "O";
        }
        else if (this.pontosCardeais.equals("O")){
            this.pontosCardeais = "N";
        }
    }
    //FIXME Girar para direita
    public void D(){
        if (this.pontosCardeais.equals("N")){
            this.pontosCardeais = "O";
        }
        else if (this.pontosCardeais.equals("O")){
            this.pontosCardeais = "S";
        }
        else if (this.pontosCardeais.equals("S")){
            this.pontosCardeais = "L";
        }
        else if (this.pontosCardeais.equals("L")){
            this.pontosCardeais = "N";
        }
    }
    //FIXME Movimentar para frente
    public boolean M(){
        boolean r = false;

        if (this.pontosCardeais.equals("N")){
            this.yAtual = this.yAtual + 10;
            r = true;
        }
        else if (this.pontosCardeais.equals("O")){
            this.xAtual = this.xAtual + 10;
            r = true;
        }
        else if (this.pontosCardeais.equals("S")){
            this.yAtual = this.yAtual + 10;
            r = true;
        }
        else if (this.pontosCardeais.equals("L")){
            this.xAtual = this.xAtual + 10;
            r = true;
        }
        this.xAnterior = xAtual;
        this.yAnterior = yAtual;
        return r;
    }

    public double getxAtual() {
        return xAtual;
    }

    public double getyAtual() {
        return yAtual;
    }

    public double getxAnterior() {
        return xAnterior;
    }

    public double getyAnterior() {
        return yAnterior;
    }

    //FIXME onde a frente do robô está apontando
    public String getPontosCardeais() {
        return pontosCardeais;
    }
      /*
    //FIXME valor das coordenadas atual
    public String coordenadaAtual() {
        return "Coordenada atual: (" + xAtual + ", "+ yAtual + ")";
    }
    //FIXME valor das coordenadas anterior
    public String coordenadaAnterior() {
        return "Coordenada anterior: (" + xAnterior + ", "+ yAnterior + ")";
    }
    */
}
