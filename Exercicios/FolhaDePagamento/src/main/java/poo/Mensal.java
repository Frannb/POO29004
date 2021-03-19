package poo;

//mensal fixo – valor fixo por mês independente do número de horas
//que trabalhou em um mês

public class Mensal extends Funcionario{

    public Mensal(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public double geraFolha() {
        return salario;
    }


}
