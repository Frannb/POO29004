package poo;

import java.util.ArrayList;

public class Agenda{
    private ArrayList<Pessoa>contatos;

    public Agenda(){
        this.contatos = new ArrayList<>();
    }

    public boolean addPessoa(Pessoa pessoa){
        this.contatos.add(pessoa);
        return true;
    }


    public boolean removePessoa(String nome, String sobrenome){
        try{
            for (Pessoa p: contatos) {
                if ((p.getNome().equals(nome)) && (p.getSobrenome().equals(sobrenome))) {
                    contatos.remove(p);
                    return true;
                }
            }
        } catch (Exception e) {
            return false;
        }
        return false;
    }

    public boolean addTelefone(String rotulo, String numero, int pIndex){
        try{
            return this.contatos.get(pIndex).addTelefone(rotulo, numero);
        } catch (Exception e) {
            return false;
        }
    }

    public boolean addEmail(String rotulo, String email, int pIndex){
        try{
            return this.contatos.get(pIndex).addEmail(rotulo, email);
        } catch (Exception e) {
            return false;
        }
    }

    public boolean updateTelefone(String rotulo, String numero, int pIndex){
        try{
            return this.contatos.get(pIndex).updateTelefone(rotulo, numero);
        } catch (Exception e) {
            return false;
        }
    }

    public boolean updateEmail(String rotulo, String email, int pIndex){
        try{
            return this.contatos.get(pIndex).updateEmail(rotulo, email);
        } catch (Exception e) {
            return false;
        }
    }

    public boolean removeTelefone(String rotulo, int pIndex){
        try{
            return this.contatos.get(pIndex).removeTelefone(rotulo);
        } catch (Exception e) {
            return false;
        }
    }

    public boolean removeEmail(String rotulo, int pIndex){
        try{
            return this.contatos.get(pIndex).removeEmail(rotulo);
        } catch (Exception e) {
            return false;
        }
    }

    public ArrayList<Pessoa> getContatos() {
        return contatos;
    }

    public String buscaContato(String nome, String sobrenome){
        String dados = null;
        for (Pessoa p: contatos){
            if((p.getNome().equals(nome)) && (p.getSobrenome().equals(sobrenome))) {
                dados = p.toString();
            }
        }
        return dados;
    }

}
