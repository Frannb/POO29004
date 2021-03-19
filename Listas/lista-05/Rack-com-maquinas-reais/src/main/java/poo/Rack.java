package poo;

import java.util.ArrayList;

public class Rack {
    private int cont;
    private ArrayList<Mreal> maquinaReal;

    public ArrayList<Mreal> getListaMaquinaReal() {
        return maquinaReal;
    }

    public Rack() {
        this.maquinaReal = new ArrayList<>();
    }

    public boolean criarMreal(String nomeR, double memoriaRamR, double discoRigidoR) {
        boolean verificaNome = true;
        try {
            if (cont < Principal.maxMreal) {
                //percorri a lista e depois verifiquei se o nome existia com contains
                if (maquinaReal.isEmpty()) {
                    maquinaReal.add(new Mreal(nomeR, memoriaRamR, discoRigidoR));
                    cont++;
                } else {
                    for (Mreal mR : getListaMaquinaReal()) {
                        if (mR.getNomeMreal().equals(nomeR)) {
                            verificaNome = false;
                        }
                    }
                    if (verificaNome) {
                        maquinaReal.add(new Mreal(nomeR, memoriaRamR, discoRigidoR));
                        cont++;
                    }
                }
            }
        }catch (Exception e) {
            System.exit(-1);
        }
        return verificaNome;
    }

    public boolean removeMreal(String nomeReal) {
        for (Mreal mR : maquinaReal) {
            if(mR.getNomeMreal().equals(nomeReal)) {
                this.maquinaReal.remove(mR);
                break;
            }
        }
        return true;
    }

    public boolean criarMvirtual(String nomeReal, String nomeMvirtual, double memoriaRam, double discoRigido) {
        boolean verifica = false;
        for (Mreal mR : maquinaReal) {
            if(mR.getNomeMreal().equals(nomeReal)) {
                verifica = mR.criarMvirtual(nomeMvirtual, memoriaRam, discoRigido);
            }
        }
        return verifica;
    }

    public boolean removerMvirtual(String nomeMvirtual) {
        for (Mreal mR : maquinaReal) {
            mR.removerMvirtual(nomeMvirtual);
        }
        return true;
    }

    public boolean ligarMvirtual(String nomeMvirtual) {
        for (Mreal mR : maquinaReal) {
            for (Mvirtual mV: mR.getListaMaquinaVirtual()){
                if(mV.getNomeMvirtual().equals(nomeMvirtual)) {
                    mV.ligarMvirtual();
                }
            }
        }
        return true;
    }

    public boolean desligarMvirtual(String nomeMvirtual) {
        for (Mreal mR : maquinaReal) {
            for (Mvirtual mV: mR.getListaMaquinaVirtual()){
                if(mV.getNomeMvirtual().equals(nomeMvirtual)) {
                    mV.desligarMvirtual();
                }
            }
        }
        return true;
    }





/*
    public void ligarMvirtual(String nomeReal, String nomeMvirtual) {
        for (Mreal mR : maquinaReal){
            if (mR.getNomeMreal().equals(nomeReal)) {
                mR.ligarMvirtual(nomeMvirtual);
            }
        }
    }

    public void desligarMvirtual(String nomeMvirtual) {
        for (Mreal mR : maquinaReal) {
            if(mR.getNomeMreal().equals(nomeReal)) {
                mR.desligarMvirtual(nomeMvirtual);
            }
        }
    }
    */

}

