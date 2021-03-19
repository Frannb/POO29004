package poo;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    protected static final int maxMreal = 5;
    protected static final int maxVirtual = 5;

    public static void main(String[] args) {

    Rack r1 = new Rack();

        if(r1.criarMreal("mR1", 24,700)){
            System.out.println("Máquina real criada!");
        }

        if(r1.criarMvirtual("mR1", "mV1",4,100)){
            System.out.println("Máquina virtual criada!");
        }

        if(r1.ligarMvirtual("mV1")){
            System.out.println("Máquina virtual ligada!");
        }

        if(r1.desligarMvirtual("mV1")){
            System.out.println("Máquina virtual desligada!");
        }

        if(r1.criarMvirtual("mR1", "mV2",4,100)){
            System.out.println("Máquina virtual criada!");
        }else{
            System.out.println("Máquina virtual NÃO criada!");
        }

        if(r1.criarMvirtual("mR1", "mV3",4,100)){
            System.out.println("Máquina virtual criada!");
        }else{
            System.out.println("Máquina virtual NÃO criada!");
        }

        if(r1.criarMvirtual("mR1", "mV4",4,100)){
            System.out.println("Máquina virtual criada!");
        }else{
            System.out.println("Máquina virtual NÃO criada!");
        }

        if(r1.criarMvirtual("mR1", "mV4",4,100)){
            System.out.println("Máquina virtual criada!");
        }else{
            System.out.println("Máquina virtual NÃO criada!");
        }

        if(r1.criarMvirtual("mR1", "mV5",4,100)){
            System.out.println("Máquina virtual criada!");
        }else{
            System.out.println("Máquina virtual NÃO criada!");
        }

        if(r1.criarMvirtual("mR1", "mV6",4,100)){
            System.out.println("Máquina virtual criada!");
        }else{
            System.out.println("Máquina virtual NÃO criada!");
        }

        //FIXME ERRO AQUI
        if(r1.removerMvirtual("mV3")){
            System.out.println("Máquina virtual removida!");
        }else{
            System.out.println("Máquina virtual NÃO removida!");
        }


    }
}
