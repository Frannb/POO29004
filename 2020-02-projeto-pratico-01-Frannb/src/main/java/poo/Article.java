package poo;

public class Article{
    private String title;     //atributos obrigatórios
    private String author;
    private String journal;
    private String year;
    private String month;     //atributos opcionais
    private String number;
    private String pages;
    private String volume;

    public Article(String title, String author, String journal, String year, String month, String number, String pages, String volume) {
        this.title = title;
        this.author = author;
        this.journal = journal;
        this.year = year;
        this.month = month;
        this.number = number;
        this.pages = pages;
        this.volume = volume;
    }

    @Override
    public String toString() {
        return  "   title={" + title + "}, \n" +
                "   author={" + author + "}, \n" +
                "   journal={" + journal + "}, \n" +
                "   year={" + year + "}, \n" +
                "   month={" + month + "}, \n" +
                "   number={" + number + "}, \n" +
                "   pages={" + pages + "}, \n" +
                "   volume={" + volume + "}";
    }
}
