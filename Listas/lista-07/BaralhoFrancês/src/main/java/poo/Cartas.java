package poo;

import java.lang.reflect.Type;

// Cada carta contém um naipe, e um valor
public class Cartas {
    private Naipes naipe;
    private ValoresCartas valor;

    public Cartas(Naipes naipe, ValoresCartas valor) {
        this.naipe = naipe;
        this.valor = valor;
    }

    @Override
    public String toString() {
        if (valor.valor == 11){
            return "J" + " " + naipe;
        }else if (valor.valor == 12){
            return "Q" + " " + naipe;
        }else if (valor.valor == 13){
            return "K" + " " + naipe;
        }else {
            return valor.valor + " " + naipe;
        }
    }
}
