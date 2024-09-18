// Klasa Komuna
public class Komuna {
    private Kryetari kryetari;
    private Nenkryetari[] nenkryetaret;
    private Puntori[] punetoret;

    public Komuna(Kryetari kryetari, Nenkryetari[] nenkryetaret, Puntori[] puntoret) {
        this.kryetari = kryetari;
        this.nenkryetaret = nenkryetaret;
        this.punetoret = puntoret;
    }

    public Kryetari getKryetari() {
        return kryetari;
    }

    public Nenkryetari[] getNenkryetaret() {
        return nenkryetaret;
    }

    public Puntori[] getPunetoret() {
        return punetoret;
    }
}