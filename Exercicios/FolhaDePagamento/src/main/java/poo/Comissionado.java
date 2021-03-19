package poo;

//comissionado – salário calculado somente sobre o percentual das
//vendas que efetivou. O percentual das vendas é um valor acordado
//com cada funcionário

public class Comissionado extends Funcionario{
    public Comissionado(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public double geraFolha() {
        return 0;
    }


}
