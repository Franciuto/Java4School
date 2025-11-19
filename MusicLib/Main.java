import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Brano b1 = new Brano("La bellavita", "Artie 5ive", "Trap", 194.12, LocalDate.of(2025, 3, 28), 20000000);
        Brano b2 = new Brano("Le cose cambiano", "Massimo Pericolo", "Hip-Hop", 223.00, LocalDate.of(2021, 10, 15), 1500000);
        System.out.println(b2.toString());
        System.out.println(b1.toString());
    }

}