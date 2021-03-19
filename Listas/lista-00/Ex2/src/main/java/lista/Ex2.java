/*
Em matemática, uma série harmônica com 5 elementos é definida como: 1 + 1/2 + 1/3 + 1/4 + 1/5.
Faça umprograma que faça a soma de todos os elementos de uma série harmônica com N
elementos, sendoNinformado pelo usuário
*/
package lista;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {

        while(true) {
            Scanner teclado = new Scanner(System.in);
            System.out.print(" Entre com o elemento: ");
            int dado = teclado.nextInt();
            float r = 0;

            for (int i = 1; i <= dado; i++) {
                //r não é um inteiro, utiliza-se o typecast em i, ou seja o numero INT será considera como float
                r += 1 / (float) i; // Soma e atribui, mesma coisa que r = r + (1/i)
            }
            System.out.println("A soma é: " + r + "\n");
        }
    }
}
