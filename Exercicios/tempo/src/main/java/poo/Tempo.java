package poo;

/**
 * Essa classe serve para representar o horario
 */

public class Tempo {
    private int hora;
    private int minutos;
    private int segundos;

    //TODO POR QUE NÃO FICA COM DUAS CASAS??
    // FIXME ERRO!
    //URGENTE REVISAR SOBRECARGA DE METODOS
    //OVERLOAD
    //É POSSÍVEL FAZER SOBRECARGA DE CONSTRUTORES

    //contrutor
    //URGENTE, REVISAR CONSTRUTOR
    //Construtor é a forma que será inicializada a class
    //o java já cria um construtor "interno"
    public Tempo(){
        this.hora = 0;
        this.minutos = 0;
        this.segundos = 0;
    }
    public Tempo(int h){
        this.hora = h;
        this.minutos = 0;
        this.segundos = 0;
    }

    public Tempo(int h, int m){
        this.hora = h;
        this.minutos = m;
        this.segundos = 0;
    }

    public Tempo(int h, int m, int s){
        this.hora = h;
        this.minutos = m;
        this.segundos = s;
    }


    //RETORNA O TEMPO ATUAL
    public String toString() {
        return hora + ":" + minutos + ":" + segundos;
    }

    //ALTERA A HORA, MINUTO E SEGUNDOS
    //hora deve ser maior que zero e menor que 23
    public boolean alteraHora(int aHora, int aMinutos, int aSegundos) {
        if ((aHora >= 0 && aHora <= 23) && (aMinutos >= 0 && aMinutos <= 60) && (aSegundos >= 0 && aSegundos <= 60)){
            this.hora = aHora;
            this.minutos = aMinutos;
            this.segundos = aSegundos;
            return true;
        }else {
            return false;
        }
    }

    //Converte para segundos
    public long converteSegundos(){
        long sHora = this.hora *3600;
        long sMinutos = this.minutos *360;
        long soma = sHora + sMinutos + segundos;
        return soma;
    }

    //public long diferenca(){

    //}

}
