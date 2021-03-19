package poo;

//horista – valor adicional pago por hora extra trabalhada além das 40
//horas semanais. O valor da hora extra é acordado com cada
//funcionário

public class Horista extends Funcionario{
    protected int horasMensais;
    protected double horaExtra;
    // 40 hrs mensal

    public Horista(String nome, double salario, int horasMensais, double horaExtra) {
        super(nome, salario);
        this.horasMensais = horasMensais;
        this.horaExtra = horaExtra;
    }

    @Override
    public double geraFolha() {
        double f = (getHorasMensais()-160)*getHoraExtra();
        return f;
    }

    public double getHoraExtra() {
        return horaExtra;
    }

    public int getHorasMensais() {
        return horasMensais;
    }
}
