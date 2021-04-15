package poo;

import java.io.Serializable;
import java.util.Scanner;

public class Principal implements Serializable {
    protected static MensagemOut m;

    public static void main(String[] args){
        Principal p = new Principal();
        Graph graph = new Graph();
        Arquivo arq = new Arquivo();
        String nome, label, elemento, conexaoA, conexaoB;
        Scanner teclado = new Scanner(System.in);

        for (;;) {
            boolean loop = true;
            switch (p.menu()) {
                case 1: //Adicionar nome ao graph - OK
                    System.out.print(m.MSG1.out);
                    graph.setLabel(teclado.nextLine());
                    break;

                case 2: //Mostrar graph
                    System.out.print(graph.toString());
                    break;

                case 3: //Salvar graph
                    if(graph.verificaConexao()) {
                        System.out.print(m.MSG5.out);
                        arq.salvarEmDisco(graph, teclado.nextLine());
                        System.out.println(m.BOLD_TEXT.out + m.MSG37.out + m.PLAIN_TEXT.out);
                    }else{
                        System.out.print(m.MSG35.out);
                        switch (teclado.nextLine()) {
                            case "SIM":
                            case "sim":
                            case "Sim":
                                System.out.print(m.MSG5.out);
                                arq.salvarEmDisco(graph, teclado.nextLine());
                                System.out.println(m.BOLD_TEXT.out + m.MSG37.out + m.PLAIN_TEXT.out);
                                break;

                            case "NÃO":
                            case "Não":
                            case "não":
                                System.out.println(m.BOLD_TEXT.out + m.MSG38.out + m.PLAIN_TEXT.out);
                                continue;
                        }
                    }
                    break;

                case 4: //Carregar graph
                    System.out.print(m.MSG5.out);
                    graph = arq.lerDoDisco(teclado.nextLine());
                    break;

                case 5: //Criar elemento - OK
                    while(loop == true){
                        System.out.print("\n" + m.BOLD_TEXT.out + m.MSG2.out + m.PLAIN_TEXT.out);
                        switch (p.subMenu()) {
                            case 1: // Internet
                                System.out.print(m.MSG3.out); nome = teclado.nextLine();
                                System.out.print(m.MSG4.out); label = teclado.nextLine();
                                if(graph.criarElemento("Internet",nome,label)){
                                    System.out.println(m.BOLD_TEXT.out + m.MSG14.out + m.PLAIN_TEXT.out);
                                }else {
                                    System.out.println(m.BOLD_TEXT.out + m.MSG15.out + m.PLAIN_TEXT.out);
                                }
                                break;
                            case 2: // Desktop
                                System.out.print(m.MSG3.out); nome = teclado.nextLine();
                                System.out.print(m.MSG4.out); label = teclado.nextLine();
                                if(graph.criarElemento("Desktop",nome,label)){
                                    System.out.println(m.BOLD_TEXT.out + m.MSG14.out + m.PLAIN_TEXT.out);
                                }else {
                                    System.out.println(m.BOLD_TEXT.out + m.MSG15.out + m.PLAIN_TEXT.out);
                                }
                                break;
                            case 3: // CameraIP
                                System.out.print(m.MSG3.out); nome = teclado.nextLine();
                                System.out.print(m.MSG4.out); label = teclado.nextLine();
                                if(graph.criarElemento("CameraIP",nome,label)){
                                    System.out.println(m.BOLD_TEXT.out + m.MSG14.out + m.PLAIN_TEXT.out);
                                }else {
                                    System.out.println(m.BOLD_TEXT.out + m.MSG15.out + m.PLAIN_TEXT.out);
                                }
                                break;
                            case 4: // Roteador
                                System.out.print(m.MSG3.out); nome = teclado.nextLine();
                                System.out.print(m.MSG4.out); label = teclado.nextLine();
                                if(graph.criarElemento("Roteador",nome,label)){
                                    System.out.println(m.BOLD_TEXT.out + m.MSG14.out + m.PLAIN_TEXT.out);
                                }else {
                                    System.out.println(m.BOLD_TEXT.out + m.MSG15.out + m.PLAIN_TEXT.out);
                                }
                                break;
                            case 5: // Firewall
                                System.out.print(m.MSG3.out); nome = teclado.nextLine();
                                System.out.print(m.MSG4.out); label = teclado.nextLine();
                                if(graph.criarElemento("Firewall",nome,label)){
                                    System.out.println(m.BOLD_TEXT.out + m.MSG14.out + m.PLAIN_TEXT.out);
                                }else {
                                    System.out.println(m.BOLD_TEXT.out + m.MSG15.out + m.PLAIN_TEXT.out);
                                }
                                break;
                            case 6: // Switch
                                System.out.print(m.MSG3.out); nome = teclado.nextLine();
                                System.out.print(m.MSG4.out); label = teclado.nextLine();
                                if(graph.criarElemento("Switch",nome,label)){
                                    System.out.println(m.BOLD_TEXT.out + m.MSG14.out + m.PLAIN_TEXT.out);
                                }else {
                                    System.out.println(m.BOLD_TEXT.out + m.MSG15.out + m.PLAIN_TEXT.out);
                                }
                                break;
                            case 0:
                                loop = false;
                                continue;
                            default:
                                System.out.print("Opção inválida!");
                                System.exit(-1);
                                break;
                        }
                    }
                    break;

                case 6: //Remover elemento - Ok
                    if(graph.listaNo.isEmpty()){
                        System.out.println(m.BOLD_TEXT.out + m.MSG22.out + m.PLAIN_TEXT.out);
                    }else {
                        System.out.print(m.BOLD_TEXT.out + m.MSG21.out + m.PLAIN_TEXT.out);
                        System.out.print("\n ======================================================\n");
                        for (No no : graph.listaNo) {
                            System.out.println(" " + no);
                        }
                        System.out.print(" ======================================================\n");
                        System.out.print(m.MSG16.out);
                        if (graph.removerElemento(teclado.nextLine())) {
                            System.out.println(m.BOLD_TEXT.out + m.MSG17.out + m.PLAIN_TEXT.out);
                        } else {
                            System.out.println(m.BOLD_TEXT.out + m.MSG18.out + m.PLAIN_TEXT.out);
                        }
                    }
                    break;
                case 7: //Criar conexão - Ok TODO(JUSTAR PARA ADICIONAR MAIS DE UM)
                    System.out.print(m.MSG10.out); conexaoA = teclado.nextLine();
                    System.out.print(m.MSG10.out); conexaoB = teclado.nextLine();
                    if(graph.criarConexao(conexaoA,conexaoB)){
                        System.out.println(m.BOLD_TEXT.out + m.MSG19.out + m.PLAIN_TEXT.out);
                    }else {
                        /*
                        for (No no : graph.listaNo) {
                            if (no.nomeNo.equals(conexaoA)) {
                                if (no instanceof Desktop) {
                                    System.out.println(" " + conexaoA + " é um endpoint!");
                                } else if (no instanceof CameraIP) {
                                    System.out.println(" " + conexaoA + " é um endpoint!");
                                } else if (no instanceof Servidor) {
                                    System.out.println(" " + conexaoA + " é um endpoint!");
                                }
                            } else if (no.nomeNo.equals(conexaoB)) {
                                if (no instanceof Desktop) {
                                    System.out.println(" " + conexaoB + " é um endpoint!");
                                }else if (no instanceof CameraIP) {
                                    System.out.println(" " + conexaoB + " é um endpoint!");
                                } else if (no instanceof Servidor) {
                                    System.out.println(" " + conexaoB + " é um endpoint!");
                                }
                            }
                        }*/
                        System.out.println(m.BOLD_TEXT.out + m.MSG20.out + m.PLAIN_TEXT.out);
                    }
                    break;

                case 8: //Remover conexão - OK
                    if(graph.listaConexao.isEmpty()) {
                        System.out.println(m.BOLD_TEXT.out + m.MSG23.out + m.PLAIN_TEXT.out);
                    }else {
                        int i = 0;
                        System.out.print("\n ======================================================\n");
                        for (String conexoes : graph.listaConexao) {
                            System.out.println(" linha " + i + ": " + conexoes);
                            i++;
                        }
                        System.out.print("\n ======================================================\n");
                        System.out.print(m.MSG13.out);
                        if (graph.removerConexao(Integer.parseInt(teclado.nextLine()))){
                            System.out.println(m.BOLD_TEXT.out + m.MSG17.out + m.PLAIN_TEXT.out);
                        } else {
                            System.out.println(m.BOLD_TEXT.out + m.MSG18.out + m.PLAIN_TEXT.out);
                        }
                    }
                    break;

                case 9: //Criar subgraph - OK
                    System.out.print(m.MSG6.out);
                    if (graph.criarSubGraph(teclado.nextLine())){
                        System.out.println(m.BOLD_TEXT.out + m.MSG24.out + m.PLAIN_TEXT.out);
                    }else {
                        System.out.println(m.BOLD_TEXT.out + m.MSG25.out + m.PLAIN_TEXT.out);
                    }
                    break;

                case 10: //Remover subgraph
                    if(graph.listaSubGraph.isEmpty()) {
                        System.out.println(m.BOLD_TEXT.out + m.MSG36.out + m.PLAIN_TEXT.out);
                    }else {
                        System.out.println("\n" + m.MSG32.out);
                        System.out.print(m.MSG34.out);
                        for (SubGraph subGraph : graph.listaSubGraph) {
                            System.out.println(" " + subGraph.nomeSubGraph);
                        }
                        System.out.print(m.MSG34.out);

                        System.out.print(m.MSG7.out);
                        if (graph.removerSubGraph(teclado.nextLine())) {
                            System.out.println(m.BOLD_TEXT.out + m.MSG26.out + m.PLAIN_TEXT.out);
                        } else {
                            System.out.println(m.BOLD_TEXT.out + m.MSG27.out + m.PLAIN_TEXT.out);
                        }
                    }
                    break;

                case 11: //Adicionar elemento ao subgraph - Ok
                    if(graph.listaNo.isEmpty()){
                        System.out.println(m.BOLD_TEXT.out + m.MSG22.out + m.PLAIN_TEXT.out);
                    }else {
                        System.out.println("\n" + m.MSG32.out);
                        System.out.print(m.MSG34.out);
                        for (SubGraph subGraph : graph.listaSubGraph) {
                            System.out.println(" " + subGraph.nomeSubGraph);
                        }
                        System.out.print(m.MSG34.out + "\n");

                        System.out.print(m.MSG8.out);
                        nome = teclado.nextLine();

                        System.out.println("\n" + m.MSG33.out);
                        System.out.print(m.MSG34.out);
                        for (No no : graph.listaNo) {
                            System.out.println(" " + no);
                        }
                        System.out.print(m.MSG34.out);

                        System.out.print(m.MSG9.out);
                        elemento = teclado.nextLine();
                        if (graph.addElementoSubGraph(nome, elemento)) {
                            System.out.println(m.BOLD_TEXT.out + m.MSG28.out + m.PLAIN_TEXT.out);
                        } else {
                            System.out.println(m.BOLD_TEXT.out + m.MSG29.out + m.PLAIN_TEXT.out);
                        }
                    }

                    break;
                case 12: //Remover elemento do subgrap - OK
                    // mostrar lista
                    if(graph.getListaSubGraph().isEmpty()){
                        System.out.println("\n" + m.BOLD_TEXT.out + m.MSG22.out + m.PLAIN_TEXT.out);
                    }else {

                        System.out.println("\n" + m.MSG32.out);
                        System.out.print(m.MSG34.out);
                        for (SubGraph subGraph : graph.listaSubGraph) {
                            System.out.println(" " + subGraph.nomeSubGraph);
                        }
                        System.out.print(m.MSG34.out + "\n");

                        System.out.print(m.MSG8.out);
                        nome = teclado.nextLine();

                        System.out.println("\n" + m.MSG33.out);
                        System.out.print(m.MSG34.out);
                        for (SubGraph subGraph : graph.listaSubGraph) {
                            for (String elementos : subGraph.elementosSubGraph) {
                                System.out.println(" " + elementos);
                            }
                        }
                        System.out.print(m.MSG34.out);

                        System.out.print(m.MSG9.out); elemento = teclado.nextLine();
                        if(graph.removerElementoSubGraph(nome, elemento)){
                            System.out.println(m.BOLD_TEXT.out + m.MSG30.out + m.PLAIN_TEXT.out);
                        }else {
                            System.out.println(m.BOLD_TEXT.out + m.MSG31.out + m.PLAIN_TEXT.out);
                        }
                    }
                    break;

                case 13: //Exportar para arquivo .dot - OK
                    if(graph.verificaConexao()) {
                        System.out.print(m.MSG5.out);
                        arq.exportarArquivo(teclado.nextLine(), graph.toString());
                        System.out.println(m.BOLD_TEXT.out + m.MSG39.out + m.PLAIN_TEXT.out);
                    }else {
                        System.out.println(m.BOLD_TEXT.out + m.MSG40.out + m.PLAIN_TEXT.out);
                    }
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.print("Opção inválida!");
                    System.exit(-1);
                    break;
            }
        }
    }

    public int menu(){
        Scanner teclado = new Scanner(System.in);
        System.out.print("\n ======================================================\n" +
                "             1 - Adicionar nome ao graph;\n" +
                "             2 - Mostrar Graph;\n" +
                "             3 - Salvar graph;\n" +
                "             4 - Carregar graph;\n" +
                "             5 - Criar elemento;\n" +
                "             6 - Remover elemento;\n" +
                "             7 - Criar conexão;\n" +
                "             8 - Remover conexão;\n" +
                "             9 - Criar subgraph;\n" +
                "             10 - Remover subgraph;\n" +
                "             11 - Adicionar elemento ao subgraph;\n" +
                "             12 - Remover elemento do subgrap;\n" +
                "             13 - Exportar para arquivo .dot;\n" +
                "             0  - Sair.\n" +
                " ======================================================\n" +
                " Digite sua opção: ");
        return teclado.nextInt();
    }
    public int subMenu(){
        Scanner teclado = new Scanner(System.in);
        System.out.print("\n ======================================================\n" +
                "                     1 - Internet;\n" +
                "                     2 - Desktop;\n" +
                "                     3 - Câmera IP;\n" +
                "                     4 - Roteador;\n" +
                "                     5 - Firewall;\n" +
                "                     6 - Switch;\n" +
                "                     0 - Voltar.\n" +
                " ======================================================\n" +
                " Digite sua opção: ");
        return teclado.nextInt();
    }

}
