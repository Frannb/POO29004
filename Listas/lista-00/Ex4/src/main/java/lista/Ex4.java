/*
Faça um programa Java para gerar um arquivo texto adequado para servir como entrada para a
questão anterior (faça uso do redirecionamento de saída>no terminal). O programa deverá
receber um arquivotexto contendo um nome de aluno por linha e deverá gerar as notas de
forma aleatória.
 */

package lista;
import java.io.IOException;
import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) throws IOException {
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite o caminho do arquivo:  ");
        String caminho  = teclado.nextLine();

        String linha = null;
        
        System.out.print("Entre com o nome do aluno e as notas (Ex: nome p1 p2 p3 l1 l2 l3 l4 l5 l6 l7): ");
        //hasNext = retorna true enquanto existe proximo elemento
        while(teclado.hasNext()) {
            linha = teclado.nextLine();
            System.out.println(linha.toUpperCase());
        }
        //Arqv grava = new Arqv();
        //grava.grava_linha(linha,caminho);
    }
}
