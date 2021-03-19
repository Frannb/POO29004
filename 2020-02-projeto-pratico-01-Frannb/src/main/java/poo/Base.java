package poo;

import java.util.HashMap;

public class Base {
    private static HashMap<String,Book> hashBook = new HashMap<>();
    private static HashMap<String,Article> hashArticle = new HashMap<>();
    private static HashMap<String,Masterthesis> hashMasterthesis = new HashMap<>();
    private static HashMap<String,Misc> hashMisc = new HashMap<>();
    private static HashMap<String,Techreport> hashTechreport = new HashMap<>();

    //CHAVE AUTOR/ANO/LATEX
    public static boolean adicionarLivro(String dadosLivro){
        boolean bool = false;
        String[] separaDados = dadosLivro.split("/");
        Book b = new Book(separaDados[0],separaDados[1],separaDados[2],separaDados[3],separaDados[4],separaDados[5],
                separaDados[6],separaDados[7],separaDados[8],separaDados[9],separaDados[10]);

        //Verifica o nome pega o ultimo
        String[] separaNome = separaDados[1].split(" ");
        int i = (separaNome.length) - 1;

        String chave = separaNome[i].toLowerCase() + separaDados[3] + "latex";

        if (verificaChave(chave)){
            hashBook.put(chave, b);
            bool = true;
        }
        return bool;
    }

    public static boolean adicionarArtigo(String dadosArtigo){
        boolean bool = false;
        String[] separaDados = dadosArtigo.split("/");
        Article a = new Article(separaDados[0],separaDados[1],separaDados[2],separaDados[3],separaDados[4],separaDados[5],
                separaDados[6],separaDados[7]);

        String[] separaNome = separaDados[1].split(" ");
        int i = (separaNome.length) - 1;

        String chave = separaNome[i].toLowerCase() + separaDados[3] + "latex";

        if (verificaChave(chave)) {
            hashArticle.put(chave, a);
            bool = true;
        }
        return bool;
    }

    public static boolean adicionarDmestrado(String dadosDmestrado){
        boolean bool = false;
        String[] separaDados = dadosDmestrado.split("/");
        Masterthesis dM = new Masterthesis(separaDados[0],separaDados[1],separaDados[2],separaDados[3],separaDados[4]);

        String[] separaNome = separaDados[1].split(" ");
        int i = (separaNome.length) - 1;

        String chave = separaNome[i].toLowerCase() + separaDados[2] + "latex";

        if (verificaChave(chave)) {
            hashMasterthesis.put(chave, dM);
            bool = true;
        }
        return bool;
    }

    public static boolean adicionarMiscelanea(String dadosMisc){
        boolean bool = false;
        String[] separaDados = dadosMisc.split("/");
        Misc m = new Misc(separaDados[0],separaDados[1],separaDados[2],separaDados[3]);

        String[] separaNome = separaDados[1].split(" ");
        int i = (separaNome.length) - 1;

        String chave = separaNome[i].toLowerCase() + separaDados[2] + "latex";

        if (verificaChave(chave)) {
            hashMisc.put(chave, m);
            bool = true;
        }
        return bool;

    }

    public static boolean adicionarTechreport(String dadosTechreport){
        boolean bool = false;
        String[] separaDados = dadosTechreport.split("/");
        Techreport t = new Techreport(separaDados[0],separaDados[1],separaDados[2],separaDados[3],separaDados[4],separaDados[5]);

        String[] separaNome = separaDados[1].split(" ");
        int i = (separaNome.length) - 1;

        String chave = separaNome[i].toLowerCase() + separaDados[3] + "latex";

        if (verificaChave(chave)) {
            hashTechreport.put(chave, t);
            bool = true;
        }
        return bool;
    }

    public void removerEntradaEmUmaBase(String chave) {

        if (hashBook.containsKey(chave)) {
            for (Book valorBook : hashBook.values()) {
                hashBook.remove(chave, valorBook);
            }
        }
        if (hashArticle.containsKey(chave)) {
            for (Article valorArticle : hashArticle.values()) {
                hashArticle.remove(chave, valorArticle);
            }
        }
        if (hashMasterthesis.containsKey(chave)) {
            for (Masterthesis valorMasterthesis : hashMasterthesis.values()) {
                hashMasterthesis.remove(chave, valorMasterthesis);
            }
        }
        if (hashMisc.containsKey(chave)) {
            for (Misc valorMisc : hashMisc.values()) {
                hashMisc.remove(chave, valorMisc);
            }
        }
        if (hashTechreport.containsKey(chave)) {
            for (Techreport valorTechreport : hashTechreport.values()) {
                hashTechreport.remove(chave, valorTechreport);
            }
        }
    }

    public static String listarBook() {
        String r = null, c = null;
        for (String chaveBook : hashBook.keySet()) {
            c = chaveBook;
            for (Book valorBook : hashBook.values()) {
                r = valorBook.toString();
            }
        }
        return c + "," + "\n" + r;
    }

    public static String listarArticle(){
        String r = null, c = null;
        for (String chaveArticle : hashArticle.keySet()) {
            c = chaveArticle;
            for (Article valorArticle : hashArticle.values()) {
                r = valorArticle.toString();
            }
        }
        return c + "," + "\n" + r;
    }

    public static String listarMasterthesis(){
        String r = null, c = null;
        for (String chaveMasterthesis : hashMasterthesis.keySet()) {
            c = chaveMasterthesis;
            for (Masterthesis valorMasterthesis : hashMasterthesis.values()) {
                r = valorMasterthesis.toString();
            }
        }
        return c + "," + "\n" + r;
    }

    public static String listarMisc(){
        String r = null, c = null;
        for (String chaveMisc : hashMisc.keySet()) {
            c = chaveMisc;
            for (Misc valorMisc : hashMisc.values()) {
                r = valorMisc.toString();
            }
        }
        return c + "," + "\n" + r;
    }

    public static String listarTechreport(){
        String r = null, c = null;
        for (String chaveTechreport : hashTechreport.keySet()) {
            c = chaveTechreport;
            for (Techreport valorTechreport : hashTechreport.values()) {
                r = valorTechreport.toString();
            }
        }
        return c + "," + "\n" + r;
    }

    public static String listarNomeEntradaBook(){
        String c = null;
        for (String valorBook : hashBook.keySet()) {
            c = valorBook;
        }
        return c;
    }

    public static String listarNomeEntradaArticle(){
        String c = null;
        for (String valorArticle : hashArticle.keySet()) {
            c = valorArticle;
        }
        return c;
    }

    public static String listarNomeEntradaMasterthesis(){
        String c = null;
        for (String valorMasterthesis : hashMasterthesis.keySet()) {
            c = valorMasterthesis;
        }
        return c;
    }

    public static String listarNomeEntradaMisc(){
        String c = null;
        for (String valorMisc : hashMisc.keySet()) {
            c = valorMisc;
        }
        return c;
    }

    public static String listarNomeEntradaTechreport(){
        String c = null;
        for (String valorTechreport : hashTechreport.keySet()) {
            c = valorTechreport;
        }
        return c;
    }

    public static boolean verificaChave(String chave){
        boolean b = false;
        if(!hashBook.containsKey(chave)) {
            if(!hashArticle.containsKey(chave)) {
                if(!hashMasterthesis.containsKey(chave)){
                    if(!hashMisc.containsKey(chave)) {
                        if(!hashTechreport.containsKey(chave)) {
                            b = true;
                        }
                    }
                }
            }
        }
        return b;
    }

    public static HashMap<String, Book> getHashBook() { return hashBook; }

    public static HashMap<String, Article> getHashArticle() { return hashArticle; }

    public static HashMap<String, Masterthesis> getHashMasterthesis() { return hashMasterthesis; }

    public static HashMap<String, Misc> getHashMisc() { return hashMisc; }

    public static HashMap<String, Techreport> getHashTechreport() { return hashTechreport; }
}
