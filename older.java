// Methods and constructors

public class older {
    public String name;
    public String surname;
    public String classe;
    public int age;

    // 1st constructor
    public older() {
        this.name = "null";
        this.surname = "null";
        this.classe = "null";
        this.age = 0;
    }

    // Constructor method with parameters
    public older(String name, String surname, int age, String classe) {
        this.name = name;
        this.surname = surname;
        this.classe = classe;
        this.age = age;
    }

    public older(String name) {
        this.name = name;
    }

    // Common method
    public boolean isMaggiorenne() {
        boolean maggiorenne;
        if (age >= 18) {
            maggiorenne = true;
        } else {
            maggiorenne = false;
        }
        return maggiorenne;
    }

    public static void main(String[] args) {
        older older1 = new older(); // Instanza una classe con metodo costruttore 1
        older older2 = new older("Francesco", "Fontanesi", 17, "4c inf");

        older1.age = 17;
        System.out.println(older1.name + older1.surname + older1.age + older1.classe);
        System.out.println(older2.name + older2.surname + older2.age + older2.classe);
        System.out.println(older1.isMaggiorenne());
        older1.age = 20;
        System.out.println(older1.isMaggiorenne());

        System.out.println(older2.age);
    }
}