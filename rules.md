  GNU nano 8.6                         ../convenzioni_java_case.md                                    
# Convenzioni di case in Java

In Java non esistono regole obbligatorie di case per nomi, ma ci sono
convenzioni standardizzate (Java Code Conventions, Java Language
Specification e linee guida comuni).

## Convenzioni principali

-   **Classi e interfacce** → **PascalCase**\
    Esempi: `Car`, `StudentRecord`, `ArrayList`

-   **Metodi** → **camelCase**\
    Esempi: `getName()`, `calculateTotal()`, `printDetails()`

-   **Variabili** → **camelCase**\
    Esempi: `counter`, `studentName`, `totalAmount`

-   **Costanti (static final)** → **UPPER_CASE_SNAKE**\
    Esempi: `MAX_VALUE`, `DEFAULT_TIMEOUT`

-   **Package** → **lowercase**\
    Esempi: `java.util`, `com.example.myapp`

-   **Parametri dei metodi** → **camelCase**\
    Esempio: `void setAge(int studentAge)`

-   **Enum** → Nome enum in **PascalCase**, valori in
    **UPPER_CASE_SNAKE**

    ``` java
    enum Direction {
        NORTH, SOUTH, EAST, WEST
    }
    ```