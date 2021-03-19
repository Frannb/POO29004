package poo;

import java.util.ArrayList;
import java.util.HashMap;

public class Camera {
    //private boolean onGravacao, onImagem;
    private String modo;
    private int index;
    private ArrayList <String> dados = new ArrayList<>();

    public boolean gravar(String modoGravacao){
        switch (modoGravacao) {
            case "Infravermelho":
            case "Normal":
                dados.add(index,modoGravacao);
                index++;
                break;
        }
        //return onGravacao;
        return true;
    }
    //FIXME DUVIDA?
    public boolean pararGravacao(){
        return true;
    }

    public boolean capturarImagem(){
        dados.add(index,"Imagem");
        index++;
        //return onImagem;
        return true;
    }

    public boolean removerArquivo(int index){
        dados.remove(index);
        --index;
        return true;
    }

    public ArrayList<String> getDados() {
        return dados;
    }
}
