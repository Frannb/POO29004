package poo;

// Baralho é um conjunto de 52 cartas, sendo 13 para cada naipe
// Baralho contém cartas, então, não se usa herança

import java.util.ArrayList;
import java.util.Collections;

public class Baralho {
    private ArrayList<Cartas> listaCartas;

    Baralho(){
        listaCartas = new ArrayList<>();
    }

    public void gerarCartas(){
        for (Naipes n : Naipes.values()) {
            for (ValoresCartas v : ValoresCartas.values()) {
                listaCartas.add(new Cartas(n, v));
            }
        }
    }

    public ArrayList<Cartas> getListaCartas() {
        return listaCartas;
    }

    public void emparalharCartas(){
        Collections.shuffle(listaCartas);
    }

}
