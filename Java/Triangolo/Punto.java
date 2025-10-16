import java.util.Objects;

/**
 * Rappresenta un punto del piano cartesiano.
 */
public class Punto {
    private double x;
    private double y;

    /**
     * Costruisce un punto alle coordinate fornite.
     *
     * @param x coordinata x
     * @param y coordinata y
     */
    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Costruisce un punto copiando le coordinate di un altro punto.
     *
     * @param p punto da copiare
     * @throws IllegalArgumentException se {@code p} è null
     */
    public Punto(Punto p) {
        if (p == null) {
            throw new IllegalArgumentException("Il punto da copiare non può essere null");
        }
        this.x = p.x;
        this.y = p.y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    /**
     * Calcola la distanza euclidea tra questo punto e quello fornito.
     *
     * @param p altro punto
     * @return distanza euclidea
     * @throws IllegalArgumentException se {@code p} è null
     */
    public double distanza(Punto p) {
        if (p == null) {
            throw new IllegalArgumentException("Il punto di confronto non può essere null");
        }
        double dx = this.x - p.x;
        double dy = this.y - p.y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    /**
     * Confronta le coordinate di questo punto con un altro punto.
     *
     * @param p altro punto
     * @return {@code true} se le coordinate coincidono esattamente
     */
    public boolean equals(Punto p) {
        if (p == null) {
            return false;
        }
        return Double.compare(this.x, p.x) == 0 && Double.compare(this.y, p.y) == 0;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Punto)) {
            return false;
        }
        Punto other = (Punto) obj;
        return equals(other);
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    @Override
    public String toString() {
        return String.format("(%.3f, %.3f)", x, y);
    }
}
