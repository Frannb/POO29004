package poo;

import java.time.LocalDate;

public class Pessoa implements Comparable {
    private String nome;
    private String sobrenome;
    private LocalDate dataNasc;
    private Telefone telefones;
    private Email emails;

    public Pessoa(String nome, String sobrenome, LocalDate dN) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.dataNasc = dN;
        this.telefones = new Telefone();
        this.emails = new Email();
    }

    public boolean addTelefone(String rotulo, String numero) {
        return this.telefones.add(rotulo, numero);
    }

    public boolean addEmail(String rotulo, String email) {
        return this.emails.add(rotulo, email);
    }

    public boolean removeTelefone(String rotulo) {
        return this.telefones.remove(rotulo);
    }

    public boolean removeEmail(String rotulo) {
        return this.emails.remove(rotulo);
    }

    public boolean updateTelefone(String rotulo, String numero) {
        return this.telefones.update(rotulo, numero);
    }

    public boolean updateEmail(String rotulo, String email) {
        return this.telefones.update(rotulo, email);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("Nome completo: " + this.nome + " " + this.sobrenome + "\n");
        sb.append("Data de nascimento: " + this.dataNasc + "\n");
        sb.append("Telefones: \n" + this.telefones + "\n");
        sb.append("Emails: \n" + this.emails + "\n");

        return sb.toString();
    }

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public LocalDate getDataNasc() {
        return dataNasc;
    }

    @Override
    public int compareTo(Object t) {
        Pessoa p = (Pessoa) t;
        if(this.nome.compareTo(p.nome) == 0) {
            if (this.sobrenome.compareTo(p.sobrenome) == 0) {
                if (this.dataNasc.compareTo(p.dataNasc) == 0) {
                    return 0;
                }else {
                    return this.dataNasc.compareTo(p.dataNasc);
                }
            }else {
                return this.sobrenome.compareTo(p.sobrenome);
            }
        }else {
            return this.nome.compareTo(p.nome);
        }
    }
}
