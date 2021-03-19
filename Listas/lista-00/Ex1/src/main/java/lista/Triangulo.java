package lista;

public class Triangulo {
/////////////AQUI//////////
    //NUMEROS NEGATIVOS COMO FAZ??

    void calculoTriangulo(int l1, int l2, int l3){
        //Para ser um triangulo todas as condições abaixo devem ser verdadeiras
        if (((l1 + l2) > l3) && ((l1 + l3) > l2) && ((l2 + l3) > l1)){
            System.out.println("\n Forma um triângulo!!");
        }else {
            System.out.println("\n Não forma um triângulo!!");
            System.exit(1);
        }
    }

    void tipoTriangulo (int l1, int l2, int l3){
        boolean eq = false;
        boolean esc = false;

        if ((l1 == l2) && (l2 == l3)) {
            eq = true;
            System.out.println( "\n O triângulo é equilátero!!");

        }
        if ((l1 != l2) && (l2 != l3)){
            esc = true;
            System.out.println("\n O triângulo é escaleno!!");
        }
        //if ((eq || esc) == false){
        if (!(eq || esc)){
            System.out.println("\n O triângulo é isósceles!!");
        }
    }

}