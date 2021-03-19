package poo;

import java.time.LocalDate;

public class Pessoa {
    private String nome;
    private String sobrenome;
    private LocalDate dataNasc;
    private Telefone telefones;
    private Email emails;

    public Pessoa(String n,String sn, LocalDate dN){
        this.nome = n;
        this.sobrenome = sn;
        this.dataNasc = dN;
        this.telefones = new Telefone();
        this.emails = new Email();
    }

    public boolean addTelefone(String r, String n){
        return this.telefones.add(r,n);
    }
    public boolean addEmail(String r, String e){
        return this.emails.add(r,e);
    }
    public boolean removeTelefone(String r){
        return this.telefones.remove(r);
    }
    public boolean removeEmail(String r){
        return this.emails.remove(r);
    }
    public boolean updateTelefone(String r, String n){
        return this.telefones.update(r,n);
    }
    public boolean updateEmail(String r, String e){
        return this.telefones.update(r,e);
    }
    public String toString(){
        StringBuilder sb = new StringBuilder();

        sb.append("Nome completo: " + this.nome + " " + this.sobrenome + "\n");
        sb.append("Data de nascimento: " + this.dataNasc + "\n");
        sb.append("Telefones: \n" + this.telefones + "\n");
        sb.append("Emails: \n" + this.emails + "\n");

        return sb.toString();
    }
}
