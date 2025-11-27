import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Pubbliczione> biblioteca;

//costruttore
    public Biblioteca(boolean prestato) {
        this.biblioteca = new ArrayList<Pubbliczione>();
    }

//metodi getter
    public ArrayList<Pubbliczione> getBiblioteca() {
        return biblioteca;
    }
//metodi setter
    public void setBiblioteca(ArrayList<Pubbliczione> biblioteca) {
        this.biblioteca = biblioteca;
    }

//metodi
/**
 * @param (Pubbliczione)
 * aggiunge una nuova pubblicazione
 */
    public void aggiungiPubbliczione(Pubbliczione p) {
        try {
            if (p == null) throw new IllegalArgumentException("Pubbliczione non valida");
            for (Pubbliczione pub : biblioteca) {
                if (pub.getId() == p.getId()) {
                    throw new IllegalArgumentException("Pubbliczione con ID duplicato");
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        biblioteca.add(p);
    }
    /**
     * @param (int)
     * rimuove una pubblicazione tramite id
     */
    public void rimuoviPubbliczione(int id) {
        for (Pubbliczione p : biblioteca) {
            if(p.getId() == id)
                biblioteca.remove(p);
        }
    }
/**
 * @param (int)
 * prende in prestito una pubblicazione
 */
    public void chiediPubblicazioneInPrestito(int id){
        int flag = 0;
        try {
            if(id == 0) throw new IllegalArgumentException("Pubblicazione non trovata");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        for(Pubbliczione p : biblioteca){
            if(p.getId() == id){
                flag = 1;
                if(p.getDataRestituzione() != null) p.setDataRestituzione();
                else{
                    System.out.println("Pubblicazione sarà disponibile a partire dal: " + p.getDataRestituzione());
                }
            }
        }
        try {
            if(flag==0) throw new IllegalArgumentException("Pubblicazione non trovata");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
/**
 * @param (Pubbliczione)
 * restituisce una pubblicazione
 */
    public void restituisciPubblicazione(Pubbliczione p){
        try {
            if(!p.isPrestato()) throw new IllegalArgumentException("Pubblicazione non in prestito");
            if(!biblioteca.contains(p)) throw new IllegalArgumentException("Pubblicazione non appartiene a questa biblioteca");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return;
        }
    }

}
