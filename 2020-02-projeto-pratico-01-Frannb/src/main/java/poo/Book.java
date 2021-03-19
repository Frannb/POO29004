package poo;

public class Book{
    private String title;     //atributos obrigatórios
    private String author;
    private String publisher;
    private String year;
    private String address;     //atributos opcionais
    private String edition;
    private String editor;
    private String month;
    private String number;
    private String series;
    private String volume;

    public Book(String title, String author, String publisher, String year, String address, String edition, String editor, String month, String number, String series, String volume) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.year = year;
        this.address = address;
        this.edition = edition;
        this.editor = editor;
        this.month = month;
        this.number = number;
        this.series = series;
        this.volume = volume;
    }

    @Override
    public String toString() {
        return  "   title={" + title + "}, \n" +
                "   author={" + author + "}, \n" +
                "   publisher={" + publisher + "}, \n" +
                "   year={" + year + "}, \n" +
                "   address={" + address + "}, \n" +
                "   edition={" + edition + "}, \n" +
                "   editor={" + editor + "}, \n" +
                "   month={" + month + "}, \n" +
                "   number={" + number + "}, \n" +
                "   series={" + series + "}, \n" +
                "   volume={" + volume + "}";
    }
}
