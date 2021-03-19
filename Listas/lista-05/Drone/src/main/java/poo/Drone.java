package poo;

import java.util.ArrayList;

public class Drone {
    private Camera[] camera;
    private double bateria = Principal.NivelBateria;
    private Rotor[] rotores;
    private Coordenadas coordenadas;
    private ArrayList<Coordenadas> lCoordenadas = new ArrayList<>();

    public Drone(Coordenadas coordenadas) {
        Coordenadas coord = coordenadas;

        this.coordenadas = new Coordenadas(coord.getX(),coord.getY(),coord.getZ());
        this.camera = new Camera[Principal.Cameras];
        this.rotores = new Rotor[Principal.Rotores];
    }

    public boolean decolar(){
    //aumentar a altitude e potencia rotores
        for (int i = 0; i < Principal.Rotores; i++) {
            rotores[i] = new Rotor();
            aumentarPotenciaDrone();
        }

        coordenadas.setZ(Principal.AltitudeDecolagem);
        bateriaDecre();
        return true;
    }

    public boolean alterarAltitude(double altitude){
        if (getNivelBateria() < 10) {
            coordenadas.getPosicaoAtual();
            coordenadas.setX(coordenadas.getxPartida());
            coordenadas.setY(coordenadas.getyPartida());
            coordenadas.setZ(coordenadas.getzPartida());
        }else {
            coordenadas.setZ(altitude);
            bateriaDecre();
        }
        return true;
    }

    public boolean mover(String sentido, double deslocamento) {
        switch (sentido) {
            case "Direita":
            case "Esquerda":
                //Mexer em X
                if (getNivelBateria() < 10) {
                    coordenadas.getPosicaoAtual();
                    coordenadas.setX(coordenadas.getxPartida());
                    coordenadas.setY(coordenadas.getyPartida());
                    coordenadas.setZ(coordenadas.getzPartida());
                }else if(coordenadas.getZ() > 0){
                    coordenadas.setX(deslocamento);
                }
                bateriaDecre();
                break;

            case "Frente":
            case "Trás":
            //Mexer em Y
                if (getNivelBateria() < 10) {
                    coordenadas.getPosicaoAtual();
                    coordenadas.setX(coordenadas.getxPartida());
                    coordenadas.setY(coordenadas.getyPartida());
                    coordenadas.setZ(coordenadas.getzPartida());
                }else if(coordenadas.getZ() > 0){
                    coordenadas.setY(deslocamento);
                }
                bateriaDecre();
                break;
        }
        return true;
    }

    public boolean carregarPlanoDeVoo(double x, double y, double z){
        Coordenadas coord = new Coordenadas(x,y,z);
        lCoordenadas.add(coord);
        return true;
    }

    public void posicaoAtual(){
        this.coordenadas.getPosicaoAtual();
    }

    public boolean gravar(int cam, String modoGravacao){
        //camera[0] = new Camera();
        //camera[1] = new Camera();
        if(cam == 1) {
            camera[0] = new Camera();
            this.camera[0].gravar(modoGravacao);
        }
        if (cam == 2){
            camera[1] = new Camera();
            this.camera[1].gravar(modoGravacao);
        }
        return true;
    }

    public boolean pararGravacao(){
        //FIXME DUVIDA AQUI
        return true;

        /*
        if(this.camera[0].isOnGravacao()){
        }
        if(this.camera[1].isOnGravacao()){
        }
        */

    }

    public boolean capturarImagem(int cam) {
        camera[cam] = new Camera();
        this.camera[cam].capturarImagem();
        return true;
    }

    public boolean removerArquivo(int index){
        for (int i = 0; i < Principal.Cameras; i++) {
            camera[i] = new Camera();
                camera[i].removerArquivo(index);
        }
        return true;
    }

    public void aumentarPotenciaDrone(){
        for (int i = 0; i < 4; i++) {
            rotores[i].aumentarPotencia();
        }
        bateriaDecre();
    }
    public void diminuiPotenciaDrone(){
        for (int i = 0; i < 4; i++) {
            rotores[i].diminuirPotencia();
        }
    }

    public boolean retornarBase (){
        coordenadas.getPosicaoAtual();
        return true;
    }

    public void bateriaDecre(){
        setNivelBateria(getNivelBateria()-1);
    }

    public double getNivelBateria() {
        return bateria;
    }

    public String toStringNivelBateria() {
        return "\n Nível de bateria: " + bateria + "%";
    }

    public void setNivelBateria(double nivelBateria) {
        this.bateria = nivelBateria;
    }

}
