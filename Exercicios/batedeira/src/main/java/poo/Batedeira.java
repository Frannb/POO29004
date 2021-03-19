package poo;

public class Batedeira {
    //Atributos
    private int velocidade;
    private boolean statusVelocidade;
    private boolean ligada;
    private boolean botaoAbertura;
    private String tipoBatedor;

    //Metodos
    public void aumentarVelocidade() {
        //Verifica se a a batedeira está com o batedor "abaixado"
        if (botaoAbertura == false) {
            //caso esteja baixo o batedor, a velocidade deve ser menor que 8
            if (velocidade < 8) {
                //caso for menor que 8, incrementa, ou seja, aumenta velocidade
                this.velocidade += 1;
                statusVelocidade = true;
            } else {
                //Se não, mantém em máximo
                velocidade = 8;
            }
        }
    }

//Diminuindo a velocidade
    public void diminuirVelocidade() {
        //botão de abertura não é necessário, pois se ela ligou, já fez o teste
        //de botãoAbertura

        //Verifica se a a batedeira está com o batedor "abaixado"
        if (botaoAbertura == false) {
            //Verifica se a velocidade maior que zero
            if (velocidade > 0) {
                //caso seja maior que zero, decrementa
                this.velocidade -= 1;
                statusVelocidade = false;
            } else {
                //Se não, fica em zero
                velocidade = 0;
            }
        }
    }

//colocar em funcionamento
    public boolean ligar() {
        //Verifica se a a batedeira está com o batedor "abaixado"
        if(botaoAbertura == false){
            //Verifica se a velocidade é zero, se sim, aumenta a velocidade e liga batedeira
            if (velocidade == 0) {
                aumentarVelocidade();
            }
                this.ligada = true;
        }else{
            //Caso contrario a batedeira estará desligada
            this.ligada = false;
        }
        return this.ligada;
    }

    //metodo desligar
    public boolean desligar(){
        //verifica se a batedeira está ligada, se estiver, pode desligar
        if(this.ligada == true) {
            this.ligada = false;
        }
        return this.ligada;
    }

    public boolean botaoAbertura(){
        if(this.botaoAbertura == false){
            this.botaoAbertura = true;
        }else {
            if (this.botaoAbertura == true){
                this.botaoAbertura = false;
            }
        }
        return this.botaoAbertura;
    }

    public boolean getStatusVelocidade() {
        //retorna o tipo do batedor
        return statusVelocidade;
    }

    //MÉTODOS ACESSORES
    //Get não precisa ter parametros
    //Getters pega a informação, sem acesso direto
    public String getTipoBatedor() {
        //retorna o tipo do batedor
        return tipoBatedor;
    }
    //MÉTODOS MODIFICADORES
    //Set deve ter parametro
    //Setters passa um parametro
    public void setTipoBatedor(String tipoBatedor) {
        //passa como parametro um batedor
        this.tipoBatedor = tipoBatedor;
    }
}
