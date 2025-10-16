/**
 * Esempio d'uso delle classi Triangolo e Punto.
 */
public class Main {
    public static void main(String[] args) {
        Punto a = new Punto(0, 0);
        Punto b = new Punto(3, 0);
        Punto c = new Punto(0, 4);

        Triangolo triangolo = new Triangolo(a, b, c);

        System.out.println(triangolo);
        System.out.printf("Perimetro: %.3f%n", triangolo.perimetro());
        System.out.printf("Area: %.3f%n", triangolo.area());
        System.out.println("Isoscele: " + triangolo.isIsoscele());
        System.out.println("Equilatero: " + triangolo.isEquilatero());
        System.out.println("Rettangolo: " + triangolo.isRettangolo());
    }
}
