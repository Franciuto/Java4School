import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Pubbliczione p1 = new Pubbliczione("bho", LocalDate.of(2025, 11, 20), 200,false);
        Pubbliczione p2 = new Pubbliczione("bho", LocalDate.of(2025, 11, 20), 200,false);

        Libro l1 = new Libro("Il Signore degli Anelli", LocalDate.of(1954, 7, 29), 1216,false, "J.R.R. Tolkien", "978-0261102385");
        Rivista r1 = new Rivista("National Geographic", LocalDate.of(2023, 5, 1), 100, false, true);

        Biblioteca biblioteca = new Biblioteca(false);
        biblioteca.aggiungiPubbliczione(l1);
        biblioteca.aggiungiPubbliczione(r1);
        biblioteca.aggiungiPubbliczione(p1);
        biblioteca.aggiungiPubbliczione(p2);

        System.out.println("Contenuto della biblioteca:");
        for (Pubbliczione p : biblioteca.getBiblioteca()) {
            System.out.println(p);
        }

        biblioteca.chiediPubblicazioneInPrestito(l1.getId());
        System.out.println("\nDopo aver preso in prestito un libro:");
        for (Pubbliczione p : biblioteca.getBiblioteca()) {
            System.out.println(p);
        }

        biblioteca.restituisciPubblicazione(l1);
        System.out.println("\nDopo aver restituito il libro:");
        for (Pubbliczione p : biblioteca.getBiblioteca()) {
            System.out.println(p);
        }

    }
}
