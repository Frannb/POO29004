package poo;

import java.io.Serializable;

public abstract class No implements Serializable {
    protected String nomeNo;
    private String label;
    protected String imagem;
    protected int quantidadeNo = 0;

    public No(String nomeNo, String label) {
        this.nomeNo = nomeNo;
        this.label = label;
    }

    public String toString() {
        return nomeNo + " [label=" + '\u0022' + label + '\u0022' +
                " shape=none image=" + '\u0022' + imagem + '\u0022' + "]";
    }
}
