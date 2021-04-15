package poo;

public class Panther extends Veiculo implements Conversivel, TracaoIntegral, VeiculoAnfibio{
    private final int velocidaMaxima = 100;
    //private boolean ligarVeiculo;
    //private int velocidade;
    private boolean tracao;
    private boolean rodas;
    private boolean capota;
    private boolean lastro;
    private int tempRefri;

    public Panther(String nome) {
        super(nome);
    }

    public boolean LigarVeiculo(){
        if(velocidade == 0){
            this.ligarVeiculo = true;
            return true;
        }
        return false;
    }

    @Override
    public boolean abrirCapota() {
        if (velocidade  == 0){
            if(!capota) {
                this.capota = true;
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean fecharCapota() {
        if (velocidade  == 0) {
            if (capota) {
                this.capota = false;
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean ativarDesativarTracao() {
        //traçao ativada = true/ tração desativada = false
        if (velocidade == 0) {
            if (rodas) {
                if (!tracao) {
                    this.tracao = true;
                    return true;
                } else {
                    this.tracao = false;
                }
            }
        }
        return false;
    }

    @Override
    public void esvaziarLastro() {
        this.lastro = true;
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

    @Override
    public boolean recolherRodas() {
        if(!rodas){
            this.rodas = true;
            esvaziarLastro();
            return true;
        }
        return false;
    }

    @Override
    public boolean abrirRodas() {
        if(rodas){
            this.rodas = false;
            return true;
        }
        return false;
    }

    public void setTempRefri(int i) {
        if(tempRefri < 100){
            tempRefri = i;
        }
    }
}
