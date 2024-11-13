package no.hvl.dat100.oppgave1;

public abstract class Innlegg {

    // Objektvariabler
    private int id;
    private String bruker;
    private String dato;
    private int likes;

    // Konstruktør med 3 parametre
    public Innlegg(int id, String bruker, String dato) {
        this.id = id;
        this.bruker = bruker;
        this.dato = dato;
        this.likes = 0; // Standardverdi for likes
    }

    // Konstruktør med 4 parametre
    public Innlegg(int id, String bruker, String dato, int likes) {
        this.id = id;
        this.bruker = bruker;
        this.dato = dato;
        this.likes = likes;
    }

    // Get-metoder
    public int getId() {
        return id;
    }

    public String getBruker() {
        return bruker;
    }

    public String getDato() {
        return dato;
    }

    // Set-metoder
    public void setBruker(String bruker) {
        this.bruker = bruker;
    }

    public void setDato(String dato) {
        this.dato = dato;
    }

    // Øk antall likes
    public void doLike() {
        this.likes++;
    }

    // Sjekk om innlegg har samme ID
    public boolean erLik(Innlegg innlegg) {
        return this.id == innlegg.getId();
    }

    // Tekstrepresentasjon av innlegget
    @Override
    public String toString() {
        return id + "\n" + bruker + "\n" + dato + "\n" + likes + "\n";
    }

    // Metoden nedenfor er kun for valgfri oppgave 6
    public String toHTML() {
        throw new UnsupportedOperationException("HTML-metoden er ikke implementert.");
    }
}
