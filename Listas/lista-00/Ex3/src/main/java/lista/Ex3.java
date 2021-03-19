package lista;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
    //Entrou com o arquivo por argumento de linha de comando

        Scanner teclado = new Scanner(System.in);
        //Criando uma lista
        //ArrayList<String> lista = new ArrayList<>();
        int conv[] = new int[11];
        int CF;

        while (teclado.hasNext()) {
            int i = 1;
            String linha = teclado.nextLine();
            //System.out.println(linha);
            //lista.add(linha);

            //Separa a linha dos espaço em vetores
            String [] linhasep = linha.split(" ");
            //System.out.println(linhasep[0]);

            while(i < linhasep.length) {
                conv [i] = Integer.parseInt(linhasep[i]);
                i++;
            }

            int s1 = (conv[1]*conv[2]*conv[3])/3;
            System.out.println(s1);


            //CF = ;

        }
    }
}

