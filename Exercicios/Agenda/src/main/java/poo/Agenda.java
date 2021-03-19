package poo;

import java.util.ArrayList;

public class Agenda {
    private ArrayList<Pessoa>contatos;

    public Agenda(){
        this.contatos = new ArrayList<>();
    }

    public void addPessoa(Pessoa p){
        this.contatos.add(p);
    }
    //
    public boolean removePessoa(String n, String s){
        return true;
    }

    //pIndex é a posição na arraylist
    public boolean addTelefone(String r, String n, int pIndex){
        //validar a posição 
        return this.contatos.get(pIndex).addTelefone(r,n);
    }
    public boolean addEmail(String r, String e, int pIndex){
        return true;
    }
    public boolean updateTelefone(String r, String n, int pIndex){
        return true;
    }
    public boolean updateEmail(String r, String e, int pIndex){
        return true;
    }
    public boolean removeTelefone(String r, int pIndex){
        return true;
    }
    public boolean removeEmail(String r, int pIndex){
        return true;
    }
    //public String toString(){
    //return ;
    //}
}
