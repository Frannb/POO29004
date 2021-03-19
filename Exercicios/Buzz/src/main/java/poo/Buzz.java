package poo;

import java.util.Random;

public class Buzz {
    //Atributos
    private boolean laser;
    private boolean capacete;
    private boolean asas;
    private boolean braçosGolpes;
    private int nfrase;

    //Metodos
    public boolean disparaLaser(){
        if(this.laser == false) {
            this.laser = true;
        }else  {
            this.laser = false;
        }
        return this.laser;
    }
    //vericar se capacete já esta aberto
    public boolean abrirCapacete(){
        if (capacete == false) {
            this.capacete = true;
        }
        return this.capacete;
    }

    public boolean fecharCapacete(){
        if (capacete == true) {
            this.capacete = false;
        }
        return this.capacete;
    }

    public boolean abrirAsas(){
        if(this.asas == false) {
            this.asas = true;
        }
        return this.asas;
    }
    public boolean fecharAsas(){
        if(this.asas == true) {
            this.asas = false;
        }
        return this.asas;
    }
    public boolean golpear(){
        if(this.braçosGolpes == false) {
            this.braçosGolpes = true;
        }
        return this.braçosGolpes;
    }

    //vetor de frases
    //falar frase com randon
    public int frases(){
        Random r = new Random();
        int i = r.nextInt(6);
        return i;
    }
}
