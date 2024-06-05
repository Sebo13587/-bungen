package uebungen;

public class _070_Fibonacci_Sebastian {

    public static void main(String[] args) {
        /*
         * Fibonacci
         *
         * Schreibe ein Programm, das die ersten 10 Zahlen der
         * Fibonacci-Folge ausgibt: 0 1 1 2 3 5 8 13 21 34
         *
         * Die ersten beiden Zahlen dürfen hardcodiert ausgegeben werden.
         *
         * Die Fibonacci-Folge beginnt mit 0 und 1.
         * Ab dann entsteht die folgende Zahl
         * indem man jeweils die beiden vorherigen Zahlen addiert.
         *
         * Zusatz: Gib alle Zahlen unter 500 aus
         */
        int a = 0, b = 1;

        System.out.print(a + " " + b + " ");

        for (int i = 2; i < 10; i++) {
            int next = a + b;
            System.out.print(next + " ");
            a = b;
            b = next;
        }

        System.out.println();

        // Zusatz: Alle Zahlen unter 500 ausgeben
        a = 0;
        b = 1;
        while (a < 500) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;

        }
    }
}
