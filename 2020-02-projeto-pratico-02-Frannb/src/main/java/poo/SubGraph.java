package poo;

import java.io.Serializable;
import java.util.ArrayList;

public class SubGraph implements Serializable {
    protected String nomeSubGraph;
    protected ArrayList<String> elementosSubGraph;

    public SubGraph(String nomeSubGraph) {
        this.nomeSubGraph = nomeSubGraph;
        elementosSubGraph = new ArrayList<>();
    }

    public boolean addElementoSubGraph(String nomeElemento){
        elementosSubGraph.add(nomeElemento);
        return true;
    }

    public boolean removerElementoSubGraph(String nomeElemento){
        for(String elemento: elementosSubGraph){
            if(elemento.equals(nomeElemento)){
                elementosSubGraph.remove(elemento);
                return true;
            }
        }
        return false;
    }


    @Override
    public String toString() {

        String elementos = "";
        if(elementosSubGraph.isEmpty()){
            elementos = "";
        }else {
            for (String elemento : elementosSubGraph) {
                elementos = elementos + elemento + "\n";
            }
        }

        return "subgraph cluster_" + nomeSubGraph + "{" + "\n" +
                "          label = " + '\u0022' + nomeSubGraph + '\u0022' +
                "\n\n" + "          " + elementos +
                "     }";
    }
}
