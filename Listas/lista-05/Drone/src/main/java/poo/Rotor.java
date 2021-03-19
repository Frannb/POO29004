package poo;

public class Rotor{
    private int potencia = 0;

    public void aumentarPotencia(){
        if (potencia < Principal.PotenciaMaxima) {
            //caso for menor que 10, incrementa, ou seja, aumenta velocidade
            this.potencia += 10;
        } else {
            //Se não, mantém em máximo
            potencia = Principal.PotenciaMaxima;
        }
    }

    public void diminuirPotencia(){
        if (potencia > 0) {
            //caso seja maior que zero, decrementa
            this.potencia -= 10;
        } else {
            //Se não, fica em zero
            potencia = 0;
        }
    }
}
