package poo;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class TestePessoa {

    @Test
    public void testeAgenda(){
        DateTimeFormatter formatoData = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dn1 = LocalDate.parse("29/05/1994", formatoData);
        LocalDate dn2 = LocalDate.parse("01/01/1989", formatoData);
        LocalDate dn3 = LocalDate.parse("01/01/1991", formatoData);
        LocalDate dn4 = LocalDate.parse("01/01/1980", formatoData);

        Pessoa pessoa = new Pessoa("Abigail", "Medeiros",dn1 );
        assertEquals("Nome completo: Abigail Medeiros" + "\n" + "Data de nascimento: 1994-05-29" + "\n" +
                "Telefones: " + "\n\n" + "Emails: "+ "\n\n",pessoa.toString());

        Pessoa p1 = new Pessoa ("Ama", "Silva" , dn1);
        Pessoa p2 = new Pessoa ("Ana", "Silva" , dn2);
        Pessoa p3 = new Pessoa ("Ana", "Silva", dn2);
        Pessoa p4 = new Pessoa ("Ana", "Silva", dn1);

        assertEquals(-1, p1.compareTo(p2));
        assertEquals(0, p2.compareTo(p3));
        assertEquals(-5, p3.compareTo(p4));
        assertEquals(1, p2.compareTo(p1));
        assertEquals(5, p4.compareTo(p3));

    }



}
