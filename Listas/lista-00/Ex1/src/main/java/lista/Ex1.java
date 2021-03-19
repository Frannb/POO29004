package lista;

import java.util.Scanner;

public class Ex1 {
    public static void main (String[] args) {
        Triangulo t1 = new Triangulo();
        Scanner teclado = new Scanner(System.in);
        //while (true), TEM OUTRA FORMA?
        for (;;) {
            try {
                System.out.print("Entre com o primeiro lado do triângulo: ");
                int l1 = teclado.nextInt();
                System.out.print("Entre com o segundo lado do triângulo: ");
                int l2 = teclado.nextInt();
                System.out.print("Entre com o terceiro lado do triângulo: ");
                int l3 = teclado.nextInt();

                t1.calculoTriangulo(l1, l2, l3);
                t1.tipoTriangulo(l1, l2, l3);

            } catch (Exception e) {
                System.out.println("Digite um inteiro!!");
            }
        }
    }
}
