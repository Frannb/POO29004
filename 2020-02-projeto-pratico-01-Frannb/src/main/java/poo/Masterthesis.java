package poo;

public class Masterthesis{
    private String title;     //atributos obrigatórios
    private String author;
    private String year;
    private String address;     //atributos opcionais
    private String month;

    public Masterthesis(String title, String author, String year, String address, String month) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.address = address;
        this.month = month;
    }

    @Override
    public String toString() {
        return  "   title={" + title + "}, \n" +
                "   author={" + author + "}, \n" +
                "   year={" + year + "}, \n" +
                "   address={" + address + "}, \n" +
                "   month={" + month + "}";
    }
}
