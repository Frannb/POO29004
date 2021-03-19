package poo;

import javax.swing.text.MaskFormatter;
import java.text.ParseException;
import java.util.HashMap;

public class Email{
    private HashMap<String, String> dados;
    private final String EMAIL_ER = "^[\\w-\\+]+(\\.[\\w]+)*@[\\w-]+(\\.[\\w]+)*(\\.[a-z]{2,})$";
    public Email(){
        this.dados = new HashMap<>();
    }

    public boolean add(String rotulo, String email){
        if((!dados.containsKey(rotulo)) && (email.matches(EMAIL_ER))){
            dados.put(rotulo,email);
            return true;
        }
        return false;
    }

    public boolean remove(String rotulo){
        String email = dados.remove(rotulo);
        if(email == null){
            return false;
        }
        return true;
    }

    public boolean update(String rotulo, String email){
        if(email.matches(EMAIL_ER)) {
            String anterior = dados.replace(rotulo, email);
            if (anterior == null) {
                return false;
            }
        }
        return true;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        this.dados.forEach((rotulo,email)->{
            sb.append(rotulo + " : " + "\n");
        });
        return sb.toString();
    }
}
