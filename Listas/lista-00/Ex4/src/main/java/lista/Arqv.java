package lista;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;

public class Arqv {
    public String [] processaArquivo(String[] line, String dir){
        try {
            //Aponta para o arquivo
            FileWriter arquivo = new FileWriter(dir);
            //Escreve no arquivo
            PrintWriter grava_arqv = new PrintWriter(arquivo);
            grava_arqv.println(line);



            grava_arqv.close();
        }catch (Exception e){
            System.out.println("Erro!!");
        }
        return line;
    }
}
