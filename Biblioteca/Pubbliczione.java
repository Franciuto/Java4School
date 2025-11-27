import java.time.LocalDate;

public class Pubbliczione {
    protected String titolo;
    protected int id;
    protected LocalDate dataPubblicazione;
    protected LocalDate dataRestituzione;
    protected boolean prestato;
    protected int numeroDiPagine;
    public static int num = 0;

    //costruttore
        public Pubbliczione(String titolo, LocalDate dataPubblicazione, int numeroDiPagine, boolean prestato) {
            this.titolo = titolo;
            num++;
            this.id = num;
            this.dataPubblicazione = dataPubblicazione;
            this.numeroDiPagine = numeroDiPagine;
            this.prestato = prestato;
        }

//metodi getter
    public String getTitolo() {
        return titolo;
    }
    public int getId() {
        return id;
    }

    public LocalDate getDataPubblicazione() {
        return dataPubblicazione;
    }

    public int getNumeroDiPagine() {
        return numeroDiPagine;
    }
    public LocalDate getDataRestituzione() {
        return dataRestituzione;
    }
    public boolean isPrestato() {
        return prestato;
    }
//metodi setter
    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setDataPubblicazione(LocalDate dataPubblicazione) {
        this.dataPubblicazione = dataPubblicazione;
    }
    public void setNumeroDiPagine(int numeroDiPagine) {
        this.numeroDiPagine = numeroDiPagine;
    }
    public void setDataRestituzione() {
        this.dataRestituzione = null;
    }

//metodi
    public String toString() {
        return "Pubbliczione [titolo=" + titolo + ", id=" + id + ", dataPubblicazione=" + dataPubblicazione
                + ", numeroDiPagine=" + numeroDiPagine + ", prestato=" + prestato + ", dataRestituzione=" + dataRestituzione + "]";
    }
}