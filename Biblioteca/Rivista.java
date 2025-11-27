import java.time.LocalDate;

public class Rivista extends Pubbliczione {
    private boolean isPatinata;

//costruttore
    public Rivista(String titolo, LocalDate dataPubblicazione, int numeroDiPagine, boolean isPatinata, boolean prestato) {
        super(titolo, dataPubblicazione, numeroDiPagine, prestato);
        this.isPatinata = isPatinata;
    }

//metodi getter
    public boolean isPatinata() {
        return isPatinata;
    }

//metodi setter
    public void setPatinata(boolean isPatinata) {
        this.isPatinata = isPatinata;
    }
    @Override
    public void setDataRestituzione() {
        this.dataRestituzione = LocalDate.now().plusDays(30);
    }
//metodi
    public String toString() {
        return (super.toString() + ", isPatinata=" + isPatinata + "]");
    }
}
