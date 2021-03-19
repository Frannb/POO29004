package poo;

import javax.swing.text.MaskFormatter;
import java.text.ParseException;
import java.util.HashMap;

public class Telefone {
    private HashMap<String, String> dados;

    //contrutor da class
    public Telefone(){
        this.dados = new HashMap<>();
    }

    // chave será o rótulo e valor o numero
    public boolean add(String rotulo, String numero){
        //verifica se já possui um rotulo, se for adiciona irá subscrever
        if(dados.containsKey(rotulo)){
            return false;
        }
        //TODO VERIFICAR SE É UM NÚMERO
        //se não houver a chave, então adiciona
        dados.put(rotulo,numero);
        return true;
    }

    public boolean remove(String rotulo){
        String numero = dados.remove(rotulo);
        if(numero == null){
            return false;
        }
        return true;
    }

    public boolean update(String rotulo, String numero){
        String anterior = dados.replace(rotulo,numero);
        if(anterior == null){
            return false;
        }
        return true;
    }

    public String toString(){

        StringBuilder sb = new StringBuilder();

        this.dados.forEach((rotulo,numero)->{
           sb.append(rotulo + " : " + formata("(##) #####-####", numero) + "\n");
        });
        return sb.toString();
    }

    public String formata(String mascara, String valor){
        MaskFormatter mask = null;
        String resultado = "";
        try {
            mask = new MaskFormatter(mascara);
            mask.setValueContainsLiteralCharacters(false);
            mask.setPlaceholderCharacter(' ');
            resultado = mask.valueToString(valor);
        }catch (ParseException e){
            e.printStackTrace();
        }
        return resultado;
    }
}
