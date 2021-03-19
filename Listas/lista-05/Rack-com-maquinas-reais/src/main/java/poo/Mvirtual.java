package poo;

public class Mvirtual {
    private String nome;
    private boolean IO;
    private double memoriaRam;
    private double discoRigido;

    public Mvirtual(String nome, double memoriaRam, double discoRigido) {
        this.nome = nome;
        this.memoriaRam = memoriaRam;
        this.discoRigido = discoRigido;
    }

    //Desligar maquina virtual
    public void desligarMvirtual(){
        if(this.IO) {
            this.IO = false;
        }
    }

    //Ligar maquina virtual
    public void ligarMvirtual(){
        if(!this.IO) {
            this.IO = true;
        }
    }

    public boolean isIO() {
        return this.IO;
    }

    public String getNomeMvirtual() {
        return nome;
    }

    public double getMemoriaRam() {
        return memoriaRam;
    }

    public double getDiscoRigido() {
        return discoRigido;
    }
}
