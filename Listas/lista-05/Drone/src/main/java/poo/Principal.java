package poo;

import java.util.Scanner;

public class Principal {
    protected static final int PotenciaMaxima = 100;
    protected static final int NivelBateria = 100;
    protected static final int AltitudeDecolagem = 1;
    protected static final int Rotores = 4;
    protected static final int Cameras = 2;

    public static void main(String[] args) {
        Drone d = new Drone(new Coordenadas(1,1));

        for (;;){
            Scanner teclado1 = new Scanner(System.in);
            System.out.printf("\n======================================\n" +
                    " 1 - Fazer decolagem;\n" +
                    " 2 - Alterar altitude;\n" +
                    " 3 - Movimentar;\n" +
                    " 4 - Posição atual;\n" +
                    " 5 - Câmera;\n" +
                    " 6 - Carregar plano de voo;\n" +
                    " 7 - Verificar nível de bateria;\n" +
                    " 8 - Retornar para a base;\n" +
                    " 0 - Sair.\n" +
                    " ======================================\n" +
                    " Digite sua opção: ");
            int opcao1 = teclado1.nextInt();

            switch (opcao1) {
                case 1:
                    //Fazer a decolagem
                    if(d.decolar()){
                        System.out.println("\nDrone decolou!");
                    }
                    break;

                case 2:
                    //Alterar altitude
                    Scanner teclado2 = new Scanner(System.in);
                    System.out.printf(" Digite a altitude: ");
                    int opcao2 = teclado2.nextInt();

                    if(d.alterarAltitude(opcao2)){
                        System.out.println("\n Altitude atualizada!");
                    }
                    break;

                case 3:
                    //Movimentar
                    Scanner teclado3 = new Scanner(System.in);
                    System.out.printf(" Digite o sentido (Direita, Esquerda, Trás, Frente): ");
                    String sentido = teclado3.nextLine();
                    System.out.printf(" Quantos metros deseja deslocar: ");
                    int deslocamento = teclado3.nextInt();

                    if(d.mover(sentido, deslocamento)){
                        System.out.println("\n Movimento realizado!");
                    }

                    break;

                case 4:
                    //Posição atual
                    d.posicaoAtual();
                    break;

                case 5:
                    //Câmera
                    for (;;) {
                        Scanner teclado4 = new Scanner(System.in);
                        System.out.printf("\n======================================\n" +
                                " 1 - Gravar;\n" +
                                " 2 - Parar Gravação;\n" +
                                " 3 - Capturar imagem;\n" +
                                " 4 - Remover arquivo;\n" +
                                " 0 - Voltar.\n" +
                                " ======================================\n" +
                                " Digite sua opção: ");
                        int opcao4 = teclado4.nextInt();

                        switch (opcao4) {
                            case 1:
                                //Gravar
                                Scanner teclado5 = new Scanner(System.in);
                                System.out.printf("\n======================================\n" +
                                        " 1 - Gravação em infravermelho;\n" +
                                        " 2 - Gravação normal\n" +
                                        " 0 - voltar.\n" +
                                        " ======================================\n" +
                                        " Digite sua opção: ");
                                int opcao5 = teclado5.nextInt();

                                switch (opcao5) {
                                    case 1:
                                        Scanner teclado6 = new Scanner(System.in);
                                        System.out.printf("\n======================================\n" +
                                                " 1 - Utilizar câmera 1;\n" +
                                                " 2 - Utilizar câmera 2;\n" +
                                                " 0 - Voltar.\n" +
                                                " ======================================\n" +
                                                " Digite sua opção: ");
                                        int opcao6 = teclado6.nextInt();
                                        //while(opcao6 != 0) {
                                            switch (opcao6) {
                                                case 1:
                                                    if( d.gravar(1, "Infravermelho")) {
                                                        System.out.println("\n Iniciando gravação em infravermelho!");
                                                    }
                                                    break;
                                                case 2:
                                                    if( d.gravar(2, "Infravermelho")) {
                                                        System.out.println("\n Iniciando gravação em infravermelho!");
                                                    }
                                                    break;
                                                case 0:
                                                    //TODO COMO FAÇO PARA VOLTAR AO ANTERIOR ??
                                                    //ERRO COM O WHILE
                                                default:
                                                    System.out.println(" Opção inválida!");
                                                    System.exit(-1);
                                                    break;
                                            }
                                        //}
                                        break;
                                    case 2:
                                        Scanner teclado7 = new Scanner(System.in);
                                        System.out.printf("\n======================================\n" +
                                                " 1 - Utilizar câmera 1;\n" +
                                                " 2 - Utilizar câmera 2;\n" +
                                                " 0 - Voltar.\n" +
                                                " ======================================\n" +
                                                " Digite sua opção: ");
                                        int opcao7 = teclado7.nextInt();

                                        switch (opcao7) {
                                            case 1:
                                                if( d.gravar(1, "normal")) {
                                                    System.out.println("\n Iniciando gravação!");
                                                }
                                                break;
                                            case 2:
                                                if( d.gravar(2, "normal")) {
                                                    System.out.println("\n Iniciando gravação normal!");
                                                }
                                                break;
                                            case 0:
                                                //TODO COMO FAÇO PARA VOLTAR AO ANTERIOR ??
                                                //ERRO COM O WHILE
                                            default:
                                                System.out.println(" Opção inválida!");
                                                System.exit(-1);
                                                break;
                                        }
                                        break;

                                    case 0:
                                        //TODO COMO FAÇO PARA VOLTAR AO ANTERIOR ??
                                        //ERRO COM O WHILE
                                    default:
                                        System.out.println(" Opção inválida!");
                                        System.exit(-1);
                                        break;
                                }
                                break;
                            case 2:
                                // FIXME DUVIDAAAAAAAAA
                                //Parar Gravação
                                d.pararGravacao();
                                System.out.println(" Gravação finalizada!");
                                break;
                            case 3:
                                //Captirar imagem
                                Scanner teclado8 = new Scanner(System.in);
                                System.out.printf("\n======================================\n" +
                                        " 1 - Utilizar câmera 1;\n" +
                                        " 2 - Utilizar câmera 2;\n" +
                                        " 0 - Sair.\n" +
                                        " ======================================\n" +
                                        " Digite sua opção: ");
                                int opcao8 = teclado8.nextInt();

                                switch (opcao8) {
                                    case 1:
                                        if(d.capturarImagem(1)) {
                                            System.out.println("Captura realizada!");
                                        }
                                        break;
                                    case 2:
                                        if(d.capturarImagem(2)) {
                                            System.out.println("Captura realizada!");
                                        }
                                        break;
                                    case 0:
                                        //TODO COMO FAÇO PARA VOLTAR AO ANTERIOR ??
                                        //ERRO COM O WHILE
                                    default:
                                        System.out.println("Opção inválida!");
                                        System.exit(-1);
                                        break;
                                }
                                break;

                            case 4:
                                //Remover arquivo
                                Scanner teclado9 = new Scanner(System.in);
                                System.out.printf(" Digite o índice do arquivo a ser removido: ");
                                int opcao9 = teclado9.nextInt();

                                if(d.removerArquivo(opcao9)) {
                                    System.out.println("Arquivo removido!");
                                }
                                break;
                            case 0:
                                //TODO COMO FAÇO PARA VOLTAR AO ANTERIOR ??
                                //ERRO COM O WHILE
                            default:
                                System.out.println("Opção inválida!");
                                System.exit(-1);
                                break;
                        }
                    }

                case 6:
                    //Carregar plano de voo
                    Scanner teclado10 = new Scanner(System.in);
                    System.out.printf(" Digite coordenada x: ");
                    double x = teclado10.nextInt();
                    System.out.printf(" Digite coordenada y: ");
                    double y = teclado10.nextInt();
                    System.out.printf(" Digite coordenada z: ");
                    double z = teclado10.nextInt();

                    if(d.carregarPlanoDeVoo(x,y,z)){
                        System.out.println("\n Coordenadas armazenadas!");
                    }
                    break;

                case 7:
                    //Verificar nível de bateria
                    System.out.println(d.toStringNivelBateria());
                    break;

                case 8:
                    //Retornar para a base
                    if(d.retornarBase()){
                        System.out.println("\n Drone retornou a base!");
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
}
