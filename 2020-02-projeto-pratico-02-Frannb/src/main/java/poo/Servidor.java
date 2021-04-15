package poo;

public class Servidor extends No{
    public Servidor(String nomeNo, String label) {
        super(nomeNo, label);
        super.imagem = Url.SERVIDOR.url;
    }
}
