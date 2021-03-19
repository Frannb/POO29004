package poo;

import java.util.ArrayList;

public class Mreal {
    private String nome;
    private double memoriaRam;
    private double discoRigido;
    private int cont;
    private ArrayList<Mvirtual> maquinaVirtual;

    public Mreal(String nome, double memoriaRam, double discoRigido) {
        this.nome = nome;
        this.memoriaRam = memoriaRam;
        this.discoRigido = discoRigido;
        this.maquinaVirtual =  new ArrayList<>();

    }

    public String getNomeMreal() {
        return this.nome;
    }

    public boolean criarMvirtual(String nomeV, double memoriaRamV, double discoRigidoV) {
        boolean verificaMemoriaEdisco = false;
        boolean verificaNome = true;
        boolean v = false;
        try {
            if (cont < Principal.maxVirtual) {
                //percorri a lista e depois verifiquei se o nome existia com contains
                if (maquinaVirtual.isEmpty()){
                    verificaMemoriaEdisco = verificaMemoriaEdiscoMreal(memoriaRamV, discoRigidoV);
                    if (verificaMemoriaEdisco) {
                        maquinaVirtual.add(new Mvirtual(nomeV, memoriaRamV, discoRigidoV));
                        cont++;
                    }
                }else {
                    verificaMemoriaEdisco = verificaMemoriaEdiscoMreal(memoriaRamV, discoRigidoV);
                    for (Mvirtual mV : getListaMaquinaVirtual()) {
                        if (mV.getNomeMvirtual().equals(nomeV)) {
                           verificaNome = false;
                        }
                    }
                    if (verificaMemoriaEdisco) {
                        if (verificaNome) {
                            maquinaVirtual.add(new Mvirtual(nomeV, memoriaRamV, discoRigidoV));
                            cont++;
                        }
                    }
                }
            }
            if (verificaMemoriaEdisco) {
                if (verificaNome) {
                    v = true;
                }
                else {
                    v = false;
                }
            }
        } catch (Exception e) {
            System.exit(-1);
        }

        return v;
    }

    //Para remover o parâmetro deve ser igual ao nome da maquinaVirtual
    public boolean removerMvirtual(String nomeMvirtual){
        boolean b = false;
        //Percorre a lista de maquina virtual, se o nome for igual ao nome da maquina virtual
        //remove está maquina
            for (Mvirtual mV : maquinaVirtual){
            if (mV.getNomeMvirtual().equals(nomeMvirtual)) {
                this.discoRigido = this.discoRigido + mV.getDiscoRigido();
                this.memoriaRam = this.memoriaRam + mV.getMemoriaRam();
                this.maquinaVirtual.remove(mV);
                b = true;
                break;
            }
        }
        return b;
    }

    public ArrayList<Mvirtual> getListaMaquinaVirtual() {
        return maquinaVirtual;
    }


    public boolean verificaMemoriaEdiscoMreal(double memoriaRamV, double discoRigidoV){
        if ((memoriaRamV <= getMemoriaRam()) && (discoRigidoV <= getDiscoRigido())){
            setMemoriaRam(getMemoriaRam() - memoriaRamV);
            setDiscoRigido(getDiscoRigido() - discoRigidoV);

            return true;
        }else{
            return false;
        }
    }

    public double getMemoriaRam() {
        return memoriaRam;
    }

    public double getDiscoRigido() {
        return discoRigido;
    }

    public void setMemoriaRam(double memoriaRam) {
        this.memoriaRam = memoriaRam;
    }

    public void setDiscoRigido(double discoRigido) {
        this.discoRigido = discoRigido;
    }
    /*
    public void ligarMvirtual(String nomeMvirtual){
        for (Mvirtual mV : maquinaVirtual){
            if (mV.getNomeMvirtual().equals(nomeMvirtual)) {
                mV.ligarMvirtual();
            }
        }
    }

    public void desligarMvirtual(String nomeMvirtual){
        for (Mvirtual mV : maquinaVirtual){
            if (mV.getNomeMvirtual().equals(nomeMvirtual)) {
                mV.desligarMvirtual();
            }
        }
    }
*/

}
