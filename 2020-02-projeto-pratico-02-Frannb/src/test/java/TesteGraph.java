import org.junit.jupiter.api.Test;
import poo.Graph;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TesteGraph {

    @Test
    public void testeToString() {
        Graph graph = new Graph();
        graph.setLabel("Redes");
        graph.criarElemento("Internet", "i", "Internet");


        assertEquals(" Graph{" + "\n" + "     label = " + '\u0022' + "Redes" + '\u0022' + "\n\n" +
                "     " + "i" + " [label=" + '\u0022' + "Internet" + '\u0022' +
                " shape=none image=" + '\u0022' + "img/cloud.png" + '\u0022' + "]" + "\n" +
                "     " + "" + "\n" +
                "     " + "" + "\n" +
                "     " + "" + "\n" +
                "}", graph.toString());

    }

    @Test
    public void removerElemento() {
        Graph graph = new Graph();
        graph.criarElemento("Internet", "i", "Internet");
        assertEquals(true, graph.removerElemento("i"));
    }

    @Test
    public void addElemento() {
        Graph graph = new Graph();
        assertEquals(true, graph.criarElemento("Roteador", "r", "Router"));
    }

    @Test
    public void verificaNomeLista() {
        Graph graph = new Graph();
        graph.criarElemento("Internet", "i", "Internet");
        assertEquals(true, graph.verificaNomeLista("i"));
        assertEquals(false, graph.verificaNomeLista("d"));
    }

    @Test
    public void verificaDualidade() {
        Graph graph = new Graph();
        graph.criarElemento("Internet", "i", "Internet");
        assertEquals(false, graph.verificaDualidade("i"));
        assertEquals(true, graph.verificaDualidade("d"));
    }

}
