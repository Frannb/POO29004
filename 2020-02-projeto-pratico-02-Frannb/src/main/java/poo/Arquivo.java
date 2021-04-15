package poo;

import java.io.*;

public class Arquivo{
    public void exportarArquivo(String nomeArquivo, String linha){
        File arquivo = new File(nomeArquivo + ".dot");
        try {
            FileWriter fwArquivo;
            BufferedWriter bwArquivo;
            //Se o arquivo já existir, então abrir para concatenação, caso contrário criar novo arquivo
            //fwArquivo = new FileWriter(arquivo, arquivo.exists());
            fwArquivo = new FileWriter(arquivo);
            bwArquivo = new BufferedWriter(fwArquivo);

            // escrevendo String no arquivo e adicionando caracter para criar nova linha
            bwArquivo.write(linha + '\n');

            // fechando o arquivo
            bwArquivo.close();
            fwArquivo.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void salvarEmDisco(Graph graph, String nomeArquivo) {
        File arquivo = new File(nomeArquivo + ".txt");
        try {
            FileOutputStream fout = new FileOutputStream(arquivo);
            ObjectOutputStream oos = new ObjectOutputStream(fout);

            oos.writeObject(graph);

            oos.flush(); // limpando dados em buffer
            oos.close(); // fechando fluxo de saida
            fout.close(); // fechando arquivo

        } catch (Exception ex) {
            System.err.println("erro: " + ex.toString());
        }

    }

    public Graph lerDoDisco(String nomeArquivo) {
        Graph graph = null;
        File arquivo = new File(nomeArquivo + ".txt");
        try {
            FileInputStream fin = new FileInputStream(arquivo);
            ObjectInputStream oin = new ObjectInputStream(fin);

            // Lendo os objetos de um arquivo
            graph = (Graph) oin.readObject();

            oin.close(); //fechando fluxo de entrada
            fin.close(); //fechando arquivo

        } catch (Exception e) {
            System.err.println("erro: " + e.toString());
        }
        return graph;

    }



}
