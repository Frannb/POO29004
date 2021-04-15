package poo;

public class Ferrari extends Veiculo implements Conversivel{
    private final int velocidaMaxima = 320;
    private boolean farolNeblina;
    //private boolean ligarVeiculo;
    private boolean capota;
    //private int velocidade;

    public Ferrari(String nome) {
        super(nome);
    }
    public boolean LigarVeiculo(){
        if(velocidade == 0){
            this.ligarVeiculo = true;
            return true;
        }
        return false;
    }

    public boolean ligarFarolNeblina(){
        if(ligarVeiculo){
            this.farolNeblina = true;
            return true;
        }
        return false;
    }

    @Override
    public boolean abrirCapota() {
        if ((velocidade < 20) && (velocidade >= 0)){
            if(!capota) {
                this.capota = true;
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean fecharCapota() {
        if ((velocidade < 20) && (velocidade >= 0)) {
            if (capota) {
                this.capota = false;
                return true;
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
