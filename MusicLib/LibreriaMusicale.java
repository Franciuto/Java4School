import java.util.ArrayList;

public class LibreriaMusicale {
    private String titolo;
    private ArrayList<Brano> libreria;

    public LibreriaMusicale(String titolo, ArrayList<Brano> libreria) {
        if (titolo == null || titolo.isEmpty()) {
            throw new IllegalArgumentException("Parametro titolo non valido");
        }
        if (libreria == null || libreria.isEmpty()) {
            throw new IllegalArgumentException("Parametro libreria non valido o vuoto");
        }
        this.titolo = titolo;
        this.libreria = libreria;
    }

    public boolean aggiungiBrano(Brano b) {
        if (!libreria.contains(b)) {
            libreria.add(b);
        } else {
            throw new IllegalArgumentException("Brano già presente nella libreria");
        }
    }

    public boolean rimuoviBrano(String titolo, String artista) {
        return libreria.removeIf(b -> b.getTitolo().equalsIgnoreCase(titolo)
                && b.getArtista().equalsIgnoreCase(artista));
    }

    public int getMinutiAscoltati(String titolo, String artista) {
        String t = titolo.toLowerCase();
        String a = artista.toLowerCase();

        for (Brano b : libreria) {
            if (b.getTitolo().toLowerCase().equals(t) &&
            .toLowerCase        b.getArtista().equalsIgnoreCase(a)) {

                return (int) (b.getDurataSec() / 60);
            }
        }
        throw new BranoNonTrovatoException(String.format("Il brano %s con autore %s non è nella libreria", titolo, autore))
        
    }

    public ArrayList<Brano> braniPerGenere(String genere) {
        if (genere == null || genere.isEmpty()) {
            throw new IllegalArgumentException("Parametro genere non valido");
        }

        ArrayList<Brano> result = new ArrayList<>();
        for (Brano b : libreria) {
            String g = b.getGenere();
            if (g != null && g.equalsIgnoreCase(genere)) {
                result.add(b);
            }
        }
        return result;
    }

    public int contaBraniPerArtista(String artista) {

        if (artista == null || artista.isEmpty()) {
            throw new IllegalArgumentException("Parametro artista non valido");
        }
        int braniPerArtista = 0;
        for (Brano b : libreria) {
            if (b.getArtista().equalsIgnoreCase(artista)) {
                braniPerArtista++;
            }
        }
    }

    public Brano piuAscoltato() {
        if (libreria == null || libreria.isEmpty()) {
            throw new BranoNonTrovatoException("Nessun brano nella libreria");
        }

        Brano best = null;
        double bestMetric = -1.0;

        for (Brano b : libreria) {
            if (b == null)
                continue;
            double durata = b.getDurataSec();
            int ascolti = b.getAscolti();
            if (durata <= 0) {
                continue;
            }
            double metric = ascolti / durata;
            if (metric > bestMetric) {
                bestMetric = metric;
                best = b;
            }
        }

        if (best == null) {
            throw new BranoNonTrovatoException("Nessun brano valido nella libreria");
        }
        return best;
    }
}
