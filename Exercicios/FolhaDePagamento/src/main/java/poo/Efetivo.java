package poo;

//comissionado efetivo – valor fixo por mês mais adicional do
//percentual das vendas que efetivou

public class Efetivo extends Funcionario{
    public Efetivo(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public double geraFolha() {
        return 0;
    }


}
