package poo;

public class Techreport{
    private String title;     //atributos obrigatórios
    private String author;
    private String institution;     //atributos opcionais
    private String year;
    private String address;
    private String month;

    public Techreport(String title, String author, String institution, String year, String address, String month) {
        this.title = title;
        this.author = author;
        this.institution = institution;
        this.year = year;
        this.address = address;
        this.month = month;
    }

    @Override
    public String toString() {
        return  "   title={" + title + "}, \n" +
                "   author={" + author + "}, \n" +
                "   institution={" + institution + "}, \n" +
                "   year={" + year + "}, \n" +
                "   address={" + address + "}, \n" +
                "   month={" + month + "}";
    }
}
