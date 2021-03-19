package poo;

public enum Naipes {
    PAUS("P"),
    OUROS("O"),
    COPAS("C"),
    ESPADAS("E");

    public final String naipe;

    Naipes(String n) {
        this.naipe = n;
    }
}
