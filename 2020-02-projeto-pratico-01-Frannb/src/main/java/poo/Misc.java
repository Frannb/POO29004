package poo;

public class Misc{
    private String title;     //atributos obrigatórios
    private String author;     //atributos opcionais
    private String year;
    private String month;

    public Misc(String title, String author, String year, String month) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.month = month;
    }

    @Override
    public String toString() {
        return  "   title={" + title + "}, \n" +
                "   author={" + author + "}, \n" +
                "   year={" + year + "}, \n" +
                "   month={" + month +"}";
    }
}
