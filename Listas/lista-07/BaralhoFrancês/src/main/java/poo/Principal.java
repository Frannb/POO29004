package poo;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Baralho b = new Baralho();
        b.gerarCartas();

        for (;;) {
            Scanner teclado = new Scanner(System.in);
            System.out.print("\n ===========================\n" +
                    "     1 - Mostrar cartas;   \n" +
                    "     2 - Embaralhar;       \n" +
                    "     0 - Sair.             \n" +
                    " ===========================\n" +
                    " Digite sua opção: ");
            int opcao = teclado.nextInt();

            switch (opcao) {
                case 1:
                    int i = 0;
                    for (Cartas cB : b.getListaCartas()) {
                        System.out.println(" " + cB.toString());
                        i++;
                        }
                    System.out.println("Total de cartas: " + i);
                    break;
                case 2:
                    b.emparalharCartas();
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
