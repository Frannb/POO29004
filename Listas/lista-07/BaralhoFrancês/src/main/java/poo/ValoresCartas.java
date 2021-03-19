package poo;

public enum ValoresCartas {
    AS(1),
    DOIS(2),
    TRES(3),
    QUATRO(4),
    CINCO(5),
    SEIS(6),
    SETE(7),
    OITO(8),
    NOVE(9),
    DEZ(10),
    J(11), // VALETE
    Q(12), // DAMA
    K(13); // REI

    public final int valor;

    ValoresCartas(int valor) {
        this.valor = valor;
    }
}

