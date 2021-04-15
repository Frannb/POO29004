package poo;

public class Pampa extends Veiculo implements TracaoIntegral{
    private boolean cacamba;
    private final int velocidaMaxima = 140;
    //private boolean ligarVeiculo;
    private boolean tracao;
    //private int velocidade;

    public Pampa(String nome) {
        super(nome);
    }

    public boolean abrirCacamba(){
        if(velocidade == 0) {
            if (!cacamba) {
                this.cacamba = true;
                return true;
            }
        }
        return false;
    }

    public boolean LigarVeiculo(){
        if(velocidade == 0){
            this.ligarVeiculo = true;
            return true;
        }
        return false;
    }

    @Override
    public boolean ativarDesativarTracao() {
        //traçao ativada = true/ tração desativada = false
        if (velocidade == 0){
            if(!tracao){
                this.tracao = true;
                return true;
            }else {
                this.tracao = false;
            }
        }
        return false;
    }

    @Override
    public void freiar(int i) {
        if(ligarVeiculo){
            if(this.velocidade > 0){
                this.velocidade = velocidade - i;
            }else {
                //Se não, fica em zero
                velocidade = 0;
            }
        }
    }

    @Override
    public void acelerar(int i) {
        if(ligarVeiculo){
            if(this.velocidade < velocidaMaxima){
                this.velocidade = velocidade + i;
            }else {
                this.velocidade = velocidaMaxima;
            }
        }
    }
}
