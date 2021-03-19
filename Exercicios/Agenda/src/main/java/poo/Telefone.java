package poo;

import javax.swing.text.MaskFormatter;
import java.text.ParseException;
import java.util.HashMap;

public class Telefone {
    //tabela hash com os dados/email
    private HashMap<String, String> dados;

    //contrutor da class
    public Telefone(){
        this.dados = new HashMap<>();
    }

    // FIXME r é o rotulo e n o numero
    // chave será o rótulo e valor o numero
    public boolean add(String r, String n){
        //verifica se já possui um rotulo
        if(dados.containsKey(r)){
            return false;
        }
        //verificar se é um numero
        dados.put(r,n);
        return true;
    }

    public boolean remove(String r){
        String n = dados.remove(r);

        if(n == null){
            return false;
        }
        return true;
    }

    public boolean update(String r, String n){
        String a = dados.replace(r,n);
        if(a == null){
            return false;
        }
        return true;
        /*
        //só atualiza
        if(dados.containsKey(r)){
            dados.put(r,n);
            return true;
        }
        return false;
        */
    }

    public String toString(){

        StringBuilder sb = new StringBuilder();

        this.dados.forEach((r,n)->{
           sb.append(r + " : " + formata("(##) #####-####", n));
        });
        return sb.toString();
    }

    public String formata(String m, String v){
        MaskFormatter mask = null;
        String resultado = "";
        try {
            mask = new MaskFormatter(m);
            mask.setValueContainsLiteralCharacters(false);
            mask.setPlaceholderCharacter(' ');
            resultado = mask.valueToString(v);
        }catch (ParseException e){
            e.printStackTrace();
        }
        return resultado;
    }
}
