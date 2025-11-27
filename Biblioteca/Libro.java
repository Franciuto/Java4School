import java.time.LocalDate;

public class Libro extends Pubbliczione {
    private String autore;
    private String ISBN;

//costruttore
    public Libro(String titolo, LocalDate dataPubblicazione, int numeroDiPagine, boolean prestato, String autore, String ISBN){
        super(titolo, dataPubblicazione, numeroDiPagine, prestato);
        this.autore = autore;
        this.ISBN = ISBN;
    }

//metodi getter
    public String getAutore() {
        return autore;
    }
    public String getISBN() {
        return ISBN;
    }

//metodi setter
    public void setAutore(String autore) {
        this.autore = autore;
    }
    public void setISBN(String iSBN) {
        this.ISBN = iSBN;
    }
    @Override
    public void setDataRestituzione() {
        this.dataRestituzione = LocalDate.now().plusDays(60);
    }
//metodi
    public String toString() {
        return (super.toString() + ", autore=" + autore + ", ISBN=" + ISBN + "]");
    }
}
