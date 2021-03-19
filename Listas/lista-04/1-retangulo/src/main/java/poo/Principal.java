package poo;

import edu.princeton.cs.algs4.StdDraw;
import java.awt.Color;

public class Principal {
    public static void main(String[] args) {
        StdDraw.setCanvasSize(600, 600); //definindo a área de desenho
        StdDraw.setScale(0, 600); // definindo a escola da área de desenho

        Color rosa = Color.PINK;
        StdDraw.setPenColor(rosa);

        Retangulo r1 = new Retangulo(100,100,5,5);
        Retangulo r2 = new Retangulo(200,200,5,5);
        Retangulo r3 = new Retangulo(300,300,5,5);
        Retangulo r4 = new Retangulo(400,400,0,5);

        if(r1.update(350,350,5,0)){
            System.out.println("Vértices atualizados!!");
        }else{
            System.out.println("Vértices NÃO atualizados!!");
        }

        if(r2.update(250,250,0,0)){
            System.out.println("Vértices atualizados!!");
        }else{
            System.out.println("Vértices NÃO atualizados!!");
        }

        if(r3.update(150,150,5,0)){
            System.out.println("Vértices atualizados!!");
        }else{
            System.out.println("Vértices NÃO atualizados!!");
        }

        if(r4.update(450,450,5,5)){
            System.out.println("Vértices atualizados!!");
        }else{
            System.out.println("Vértices NÃO atualizados!!");
        }
        StdDraw.rectangle(r1.getX1(), r1.getY1(), r1.getX2(), r1.getY2());
        StdDraw.rectangle(r2.getX1(), r2.getY1(), r2.getX2(), r2.getY2());
        StdDraw.rectangle(r3.getX1(), r3.getY1(), r3.getX2(), r3.getY2());
        StdDraw.rectangle(r4.getX1(), r4.getY1(), r4.getX2(), r4.getY2());
    }
}
