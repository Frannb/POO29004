package poo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;

public class Graph implements Serializable {
    protected ArrayList<No> listaNo;
    protected ArrayList<String> listaConexao;
    protected ArrayList<SubGraph> listaSubGraph;
    private String label = "";

    public Graph() {
        listaNo = new ArrayList<>();
        listaConexao = new ArrayList<>();
        listaSubGraph = new ArrayList<>();
    }

   public boolean criarElemento(String elemento, String nomeNo, String label){
        if(verificaDualidade(nomeNo)) {
            switch (elemento) {
                case "Desktop":
                    Desktop desktop = new Desktop(nomeNo, label);
                    listaNo.add(desktop);
                    return true;
                case "CameraIP":
                    CameraIP camera = new CameraIP(nomeNo, label);
                    listaNo.add(camera);
                    return true;
                case "Servidor":
                    Servidor servidor = new Servidor(nomeNo, label);
                    listaNo.add(servidor);
                    return true;
                case "Roteador":
                    Roteador roteador = new Roteador(nomeNo, label);
                    listaNo.add(roteador);
                    return true;
                case "Firewall":
                    Firewall firewall = new Firewall(nomeNo, label);
                    listaNo.add(firewall);
                    return true;
                case "Switch":
                    Switch swittch = new Switch(nomeNo, label);
                    listaNo.add(swittch);
                    return true;
                case "Internet":
                    Internet internet = new Internet(nomeNo, label);
                    listaNo.add(internet);
                    return true;
            }
        }
       return false;
   }

   public boolean removerElemento(String nomeNo) {
        for (No no : listaNo) {
            if (no.nomeNo.equals(nomeNo)) {
                listaNo.remove(no);
                return true;
            }
       }
        return false;

   }

   public boolean criarConexao(String nomeConexaoA, String nomeConexaoB){
        if(verificaInstancia(nomeConexaoA) == verificaInstancia(nomeConexaoB)){
            return false;
        }else {
            if (verificaNomeLista(nomeConexaoA) && verificaNomeLista(nomeConexaoB)) {
                if (verificaQuantidadeNo(nomeConexaoA) && verificaQuantidadeNo(nomeConexaoB)) {
                    listaConexao.add(nomeConexaoA + " -- " + nomeConexaoB);
                    return true; //Conexão realizada
                }
            }
        }
        return false;
   }

   public boolean removerConexao(int linha){
       Collections.reverse(listaConexao);
        for (String lConexao: listaConexao){
            for (int i = 0; i <= linha; i++) {
                listaConexao.remove(lConexao);
                return true;
            }
        }
        return false;
   }

   public boolean criarSubGraph(String nomeSubGraph){
        SubGraph subGraph = new SubGraph(nomeSubGraph);
        listaSubGraph.add(subGraph);
        return true;
   }
    public boolean addElementoSubGraph(String nomeSubGraph, String nomeElemento){
        for (SubGraph subGraph: listaSubGraph){
            if (subGraph.nomeSubGraph.equals(nomeSubGraph)){
                subGraph.addElementoSubGraph(nomeElemento);
                return true;
            }
        }
        return false;
    }

    public boolean removerElementoSubGraph(String nomeSubGraph, String nomeElemento){
        for (SubGraph subGraph: listaSubGraph){
            if (subGraph.nomeSubGraph.equals(nomeSubGraph)){
                subGraph.removerElementoSubGraph(nomeElemento);
                return true;
            }
        }
        return false;
    }

   public boolean removerSubGraph(String nomeSubGraph){
       for (SubGraph subGraph: listaSubGraph){
           if (subGraph.nomeSubGraph.equals(nomeSubGraph)){
               listaSubGraph.remove(subGraph);
               return true;
           }
       }
       return false;
   }

    public void setLabel(String label) {
        this.label = label;
    }

    public boolean verificaQuantidadeNo(String nomeConexao) {
        boolean retorna = false;
        for (No no : listaNo) {
            if (no.nomeNo.equals(nomeConexao)) {
                if ((no instanceof Desktop) || (no instanceof CameraIP) || (no instanceof Servidor)) {
                    if (no.quantidadeNo == 0) {  //Se a quantidade for 0, é porque não à conexão
                        no.quantidadeNo++;
                        retorna = true;
                    }
                }else if ((no instanceof Roteador) || (no instanceof Firewall) ||
                        (no instanceof Switch) || (no instanceof Internet)) {
                    no.quantidadeNo++;
                    retorna = true;
                }
            }
        }
        return retorna;
    }

    public boolean verificaDualidade(String nome) {
        if (listaNo.isEmpty()){
            return true;
        } else {
            for (No no : listaNo) {
                if(no.nomeNo.contains(nome)){
                    return false;
                }
            }
        }
        return true;
    }
    public boolean verificaConexao() {
        boolean b1 = true, b2 = true, b3 = true;
        for (No no : listaNo) {
            if ((no instanceof Desktop) || (no instanceof CameraIP) || (no instanceof Servidor)) {
                if (no.quantidadeNo == 0) {
                    b1 = false;
                }
            } else if ((no instanceof Roteador) || (no instanceof Firewall)) {
                if (no.quantidadeNo < 2) {
                    b2 = false;
                }
            } else if ((no instanceof Switch) || (no instanceof Internet)) {
                if (no.quantidadeNo < 1) {
                    b3 = false;
                }
            }
        }
        return (b1 && b2 && b3);
    }


    public boolean verificaNomeLista(String nome) {
        if (listaNo.isEmpty()){
            return true;
        } else {
            for (No no : listaNo) {
                if(no.nomeNo.contains(nome)) {
                    return true;
                }
            }
        }
        return false;
    }

    public ArrayList<SubGraph> getListaSubGraph() {
        return listaSubGraph;
    }

    public String verificaInstancia(String conexao){
        String instancia = null;
        int i = 0;
        for (No no : listaNo) {
            if (no.nomeNo.equals(conexao)) {
                if (no instanceof Desktop){
                    instancia = "Desktop";
                }else if (no instanceof CameraIP){
                    instancia = "CameraIP";
                }else if (no instanceof Servidor) {
                    instancia = "Servidor";
                }else if (no instanceof Roteador) {
                    instancia = "Roteador";
                }else if (no instanceof Firewall){
                    instancia = "Firewall";
                }else if (no instanceof Internet) {
                    instancia = "Internet";
                }else if (no instanceof Switch) {
                    instancia = "Switch" + Integer.parseInt(String.valueOf(i));
                    i++;
                }
            }
        }
        return instancia;
    }


    @Override
    public String toString() {
        String dadosNo = "";
        if(listaNo.isEmpty()){
            dadosNo = "";
        }else {
            for (No no : listaNo) {
                dadosNo = dadosNo + no + "\n     ";
            }
        }

        String dadosConexao = "";
        if(listaConexao.isEmpty()){
            dadosConexao = "";
        }else {
            for (String conexao : listaConexao) {
                dadosConexao = dadosConexao + conexao + "\n     ";
            }
        }

        String dadosSubGraph = "";
        if(listaSubGraph.isEmpty()){
            dadosSubGraph = "";
        }else {
            for (SubGraph SubGraph : listaSubGraph) {
                dadosSubGraph = dadosSubGraph + SubGraph + "\n     ";
            }
        }


        return " Graph{" + "\n" + "     label = " + '\u0022' + label + '\u0022' + "\n\n" +
                "     " + dadosNo + "\n" +
                "     " + dadosConexao + "\n" +
                "     " + dadosSubGraph + "\n" +
                "}";
    }
}
