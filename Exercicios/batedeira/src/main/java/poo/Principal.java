package poo;

public class Principal {
    public static void main(String[] args){

        Batedeira b1 = new Batedeira();

        if (b1.ligar()){
            System.out.println("Batedeira ligada");
        }

        b1.desligar();

        if (b1.desligar()){
            System.out.println("Batedeira desligada");
        }


        /*
        if (b1.getLigada()){
            System.out.println("Batedeira ligada");
        }else {
            System.out.println("Batedeira desligada");
        }

        if (b1.getStatusVelocidade()){
            System.out.println("Aumentou velocidade");
        }else{
            System.out.println("Diminuiu velocidade");
        }*/

        b1.setTipoBatedor("Globo");

    }
}
