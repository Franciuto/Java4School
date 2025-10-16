import java.util.Objects;

/**
 * Rappresenta un triangolo definito da tre vertici nel piano.
 */
public class Triangolo {
    private static final double EPSILON = 1e-9;

    private Punto a;
    private Punto b;
    private Punto c;

    /**
     * Costruisce un triangolo a partire dai tre vertici.
     *
     * @param a vertice A
     * @param b vertice B
     * @param c vertice C
     * @throws IllegalArgumentException se uno dei vertici è {@code null}
     */
    public Triangolo(Punto a, Punto b, Punto c) {
        setA(a);
        setB(b);
        setC(c);
    }

    /**
     * Costruisce un triangolo copiando i vertici da un altro triangolo.
     *
     * @param t triangolo da copiare
     * @throws IllegalArgumentException se {@code t} è {@code null}
     */
    public Triangolo(Triangolo t) {
        if (t == null) {
            throw new IllegalArgumentException("Il triangolo da copiare non può essere null");
        }
        this.a = new Punto(t.a);
        this.b = new Punto(t.b);
        this.c = new Punto(t.c);
    }

    public Punto getA() {
        return new Punto(a);
    }

    public void setA(Punto a) {
        if (a == null) {
            throw new IllegalArgumentException("Il vertice A non può essere null");
        }
        this.a = new Punto(a);
    }

    public Punto getB() {
        return new Punto(b);
    }

    public void setB(Punto b) {
        if (b == null) {
            throw new IllegalArgumentException("Il vertice B non può essere null");
        }
        this.b = new Punto(b);
    }

    public Punto getC() {
        return new Punto(c);
    }

    public void setC(Punto c) {
        if (c == null) {
            throw new IllegalArgumentException("Il vertice C non può essere null");
        }
        this.c = new Punto(c);
    }

    /**
     * Calcola l'area del triangolo usando la formula di Erone.
     *
     * @return area del triangolo, oppure {@code 0} se i punti sono allineati
     */
    public double area() {
        double ab = latoAB();
        double bc = latoBC();
        double ca = latoCA();
        double semiPerimetro = (ab + bc + ca) / 2.0;
        double det = semiPerimetro * (semiPerimetro - ab) * (semiPerimetro - bc) * (semiPerimetro - ca);
        if (det <= 0) {
            return 0;
        }
        return Math.sqrt(det);
    }

    /**
     * Calcola il perimetro del triangolo.
     *
     * @return somma delle lunghezze dei lati
     */
    public double perimetro() {
        return latoAB() + latoBC() + latoCA();
    }

    @Override
    public String toString() {
        return String.format("Triangolo[A=%s, B=%s, C=%s]", a, b, c);
    }

    /**
     * Verifica se il triangolo è equilatero.
     *
     * @return {@code true} se tutti i lati hanno la stessa lunghezza
     */
    public boolean isEquilatero() {
        double ab = latoAB();
        double bc = latoBC();
        double ca = latoCA();
        return equalsWithTolerance(ab, bc) && equalsWithTolerance(bc, ca);
    }

    /**
     * Verifica se il triangolo è isoscele.
     *
     * @return {@code true} se almeno due lati sono congruenti
     */
    public boolean isIsoscele() {
        double ab = latoAB();
        double bc = latoBC();
        double ca = latoCA();
        return equalsWithTolerance(ab, bc) || equalsWithTolerance(bc, ca) || equalsWithTolerance(ca, ab);
    }

    /**
     * Verifica se il triangolo è rettangolo applicando il teorema di Pitagora.
     *
     * @return {@code true} se il triangolo è rettangolo
     */
    public boolean isRettangolo() {
        double ab = latoAB();
        double bc = latoBC();
        double ca = latoCA();
        double ab2 = ab * ab;
        double bc2 = bc * bc;
        double ca2 = ca * ca;
        return equalsWithTolerance(ab2 + bc2, ca2)
                || equalsWithTolerance(ab2 + ca2, bc2)
                || equalsWithTolerance(bc2 + ca2, ab2);
    }

    /**
     * Confronta questo triangolo con un altro triangolo.
     *
     * @param t triangolo da confrontare
     * @return {@code true} se i vertici coincidono nell'ordine
     */
    public boolean equals(Triangolo t) {
        if (t == null) {
            return false;
        }
        return this.a.equals(t.a) && this.b.equals(t.b) && this.c.equals(t.c);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Triangolo)) {
            return false;
        }
        Triangolo other = (Triangolo) obj;
        return equals(other);
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, b, c);
    }

    private double latoAB() {
        return a.distanza(b);
    }

    private double latoBC() {
        return b.distanza(c);
    }

    private double latoCA() {
        return c.distanza(a);
    }

    private boolean equalsWithTolerance(double value1, double value2) {
        return Math.abs(value1 - value2) <= EPSILON;
    }
}
