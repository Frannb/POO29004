package poo;

public class Principal {
    public static void main(String[] args){
        String frases[] = {
                "Ao infinito... e Além!",
                "Saudações, eu sou o Buzz Lightyear e venho em missão de paz.",
                "Comando estelar pronto para voar!",
                "Estou cercado por alienígenas com intenções desconhecidas",
                "Isto não é voar. Isto é cair, com estilo!",
                "Parece não haver sinal de vida inteligente em lugar algum."
        };

        Buzz b1 = new Buzz();
        Buzz b2 = new Buzz();
        Buzz b3 = new Buzz();

        if (b1.disparaLaser()){
            System.out.println("Disparando laser");
        }

        System.out.println(frases[b1.frases()]);

        if(b2.abrirAsas()){
            System.out.printf("Preparado para voar, comandante!");
        }





    }
}
