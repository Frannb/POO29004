package poo;

import java.util.*;

public class Principal {
    private static final HashMap<String, Base> hashBases = new HashMap<>();

    public static void main(String[] args) {
        for (;;) {
            Scanner teclado = new Scanner(System.in);
            System.out.print("\n ======================================================\n" +
                    " 1 - Exportar uma base bibliográfica no formato BibTex;\n" +
                    " 2 - Criar base bibliográfica;\n" +
                    " 3 - Listar base bibliográfica;\n" +
                    " 4 - Remover base bibliográfica;\n" +
                    " 5 - Adicionar entrada de uma base bibliográfica;\n" +
                    " 6 - Listar entrada de uma base bibliográfica;\n" +
                    " 7 - Remover entrada de uma base bibliográfica;\n" +
                    " 0 - Sair.\n" +
                    " ======================================================\n" +
                    " Digite sua opção: ");
            int opcao = teclado.nextInt();

            switch (opcao) {
                case 1:
                    //Exportar uma base bibliográfica no formato BibTex
                    listarNomeBases();

                    if(hashBases.isEmpty()){
                        System.out.println("\n Nenhuma base criada!");
                    }else{
                        Scanner teclado1 = new Scanner(System.in);
                        System.out.print("\n Qual base deseja exportar: ");
                        String nomeBase1 = teclado1.nextLine();

                        if (hashBases.containsKey(nomeBase1)) {
                            exportarBasesBibliografica();
                        }else {
                            System.out.println("\n Base não encontrada!");
                        }
                    }
                    break;

                case 2:
                    //Criar base bibliográfica - Feito
                    Scanner teclado2 = new Scanner(System.in);
                    System.out.print("\n Digite o nome da base a ser criada: ");
                    String nomeBase2 = teclado2.nextLine();

                    Base base = new Base();
                    if (hashBases.containsKey(nomeBase2)) {
                        System.out.println("\n Base já existe!");
                    } else {
                        hashBases.put(nomeBase2, base);
                        System.out.println(" Base criada com sucesso!");
                    }

                    break;

                case 3:
                    //Listar nome base bibliográfica - Feito
                    if (hashBases.isEmpty()) {
                        System.out.println("\n Nenhuma base criada!");
                    } else {
                        listarNomeBases();
                    }
                    break;

                case 4:
                    //Remover base bibliográfica - feito
                    listarNomeBases();

                    Scanner teclado4 = new Scanner(System.in);
                    System.out.print("\n Digite o nome da base a ser removida: ");
                    String nomeBase4 = teclado4.nextLine();

                    //Verifica se alguma base já foi criada
                    if (hashBases.isEmpty()) {
                        System.out.println("\n Nenhuma base criada!");
                    } else {
                        //Verifica se possui uma chave dentro da tabela, se existir remove a chave e o objeto
                        if (hashBases.containsKey(nomeBase4)) {
                            for (Base valorBase : hashBases.values()) {
                                hashBases.remove(nomeBase4, valorBase);
                            }
                        }
                        System.out.println(" Base removida!");
                    }
                    break;

                case 5:
                    //Adicionar entrada de uma base bibliográfica - feito
                    Scanner teclado5 = new Scanner(System.in);
                    System.out.print("\n Digite o nome da base onde será adicionada a entrada: ");
                    String nomeBase5 = teclado5.nextLine();

                    if(hashBases.isEmpty()){
                        System.out.println("\n Nenhuma base criada!");
                    }else {
                        if (hashBases.containsKey(nomeBase5)) {
                            System.out.print("\n Digite a categoria de entrada (Book/Article/Masterthesis/Misc/Techreport): ");
                            String categoria = teclado5.nextLine();
                            adicionarEntrada(categoria);
                        } else {
                            System.out.println("\n Nenhuma base encontrada!");
                        }
                    }
                    break;

                case 6:
                    //Listar entrada de uma base bibliográfica - feito
                    Scanner teclado6 = new Scanner(System.in);
                    System.out.print("\n Digite o nome da base para exibir a entrada: ");
                    String nomeBase6 = teclado6.nextLine();

                    if(hashBases.isEmpty()){
                        System.out.println("\n Nenhuma base criada!");
                    }else {
                        if (hashBases.containsKey(nomeBase6)) {
                            listarNomeEntradas();
                        } else {
                            System.out.println("\n Nenhuma base encontrada!");
                        }
                    }
                    break;

                case 7:
                    //Remover entrada de uma base bibliográfica - feito
                    Scanner teclado7 = new Scanner(System.in);
                    System.out.print("\n Digite o nome da base onde a entrada será removida: ");
                    String nomeBase7 = teclado7.nextLine();
                    System.out.print("\n Digite a chave de entrada a ser removida: ");
                    String chave7 = teclado7.nextLine();

                    //Verifica se alguma base já foi criada
                    if (hashBases.isEmpty()) {
                        System.out.println("\n Nenhuma base criada!");
                    } else {
                        //Verifica se possui uma chave dentro da tabela, se existir remove a chave e o objeto
                        if (hashBases.containsKey(nomeBase7)) {
                            for (Base hB : hashBases.values()) {
                                hB.removerEntradaEmUmaBase(chave7);
                            }
                            System.out.println(" Entrada removida!");
                        }else {
                            System.out.println("\n Nenhuma base encontrada!");
                        }

                    }
                    break;

                case 0:
                    System.exit(0);
                default:
                    System.out.println("Opção inválida!");
                    System.exit(-1);
                    break;
            }
        }
    }

    public static void exportarBasesBibliografica() {
        //for (Base valorBase : hashBases.values()) {
            if (!Base.getHashBook().isEmpty()) {
                System.out.println("\n @book{" + Base.listarBook() + "\n }");
            }
            if (!Base.getHashArticle().isEmpty()) {
                System.out.println("\n @article{" + Base.listarArticle() + "\n }");
            }
            if (!Base.getHashMasterthesis().isEmpty()) {
                System.out.println("\n @masterthesis{" + Base.listarMasterthesis() + "\n }");
            }
            if (!Base.getHashMisc().isEmpty()) {
                System.out.println("\n @misc{" + Base.listarMisc() + "\n }");
            }
            if (!Base.getHashTechreport().isEmpty()) {
                System.out.println("\n @techreport{" + Base.listarTechreport() + "\n }");
            }
        //}
    }

    public static void listarNomeBases() {
        //Verifica se alguma base já foi criada
        System.out.print("\n ============ Nome das bases ============ \n");
        for (String cB : hashBases.keySet()) {
            System.out.println(" " + cB);
        }
        System.out.print(" ========================================\n");
        //Pode ser pego um conjunto de chaves
        //System.out.println(hashBases.keySet());
    }

    public static void adicionarEntrada(String categoria) {
        //Base base = new Base();
        switch (categoria) {
            case "Book":
                //Se for um livro ele vai verificar cada item
                //adicionar já no formato Bibtex
                Scanner teclado51 = new Scanner(System.in);
                System.out.print("\n Digite (Título/Autor/Publicação/Ano/Endereço/Edição/Editora/Mês/Número/Série/Volume): ");
                String dadosLivro = teclado51.nextLine();
                if(Base.adicionarLivro(dadosLivro)){
                    System.out.println(" Entrada adicionada!");
                }else{
                    System.out.println(" Entrada NÃO adicionada!");
                }

                break;
            case "Article":
                Scanner teclado52 = new Scanner(System.in);
                System.out.print("\n Digite (Título/Autor/Journal/Ano/Mês/Número/Páginas/Volume): ");
                String dadosArtigo = teclado52.nextLine();

                if(Base.adicionarArtigo(dadosArtigo)){
                System.out.println(" Entrada adicionada!");
                }else{
                System.out.println(" Entrada NÃO adicionada!");
                }

                break;
            case "Masterthesis":
                Scanner teclado53 = new Scanner(System.in);
                System.out.print("\n Digite (Título/Autor/Ano/Endereço/Mês): ");
                String dadosDmestrado = teclado53.nextLine();

                if(Base.adicionarDmestrado(dadosDmestrado)){
                System.out.println(" Entrada adicionada!");
                }else{
                System.out.println(" Entrada NÃO adicionada!");
                }

                break;
            case "Misc":
                Scanner teclado54 = new Scanner(System.in);
                System.out.print("\n Digite (Título/Autor/Ano/Mês): ");
                String dadosMisc = teclado54.nextLine();

                if(Base.adicionarMiscelanea(dadosMisc)){
                System.out.println(" Entrada adicionada!");
                }else{
                System.out.println(" Entrada NÃO adicionada!");
                }

                break;
            case "Techreport":
                Scanner teclado55 = new Scanner(System.in);
                System.out.print("\n Digite (Título/Autor/Instituição/Ano/Endereço/Mês): ");
                String dadosTechreport = teclado55.nextLine();

                if(Base.adicionarTechreport(dadosTechreport)){
                System.out.println(" Entrada adicionada!");
                }else{
                System.out.println(" Entrada NÃO adicionada!");
                }

                break;
            default:
                System.out.println(" Opção inválida!");
                System.exit(-1);
                break;
        }
    }

    public static void listarNomeEntradas() {
        System.out.print("\n =========== Nome das Entradas =========== \n");
        if(!Base.getHashBook().isEmpty()){
            System.out.print(" " + Base.listarNomeEntradaBook() + "\n");
        }
        if(!Base.getHashArticle().isEmpty()){
            System.out.print(" " + Base.listarNomeEntradaArticle() + "\n");
        }
        if(!Base.getHashMasterthesis().isEmpty()){
            System.out.print(" " + Base.listarNomeEntradaMasterthesis() + "\n");
        }
        if(!Base.getHashMisc().isEmpty()) {
            System.out.print(" " + Base.listarNomeEntradaMisc() + "\n");
        }
        if(!Base.getHashTechreport().isEmpty()) {
            System.out.print(" " + Base.listarNomeEntradaTechreport() + "\n");
        }
        System.out.print(" =========================================\n");


    }

}

