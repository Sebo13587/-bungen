package uebungen;

import java.util.Random;

public class _010_ZweiZahlenGenauVergleichen_Sebastian {
    public static void main(String[] args) {
        /*
         * Zwei Zahlen genau vergleichen
         *
         * Schreibe ein Programm, das zwei zufällige Zahlen erzeugt.
         * Dann soll das Programm testen und ausgeben,
         * welche von den beiden Zahlen größer ist oder ob beide Zahlen gleich groß sind.
         */
        Random r = new Random();
        int zahl1 = r.nextInt(1, 100);
        int zahl2 = r.nextInt(1, 100);

        if (zahl1 > zahl2) {
            System.out.println("Die erste Zahl (" + zahl1 + ") ist größer als die zweite Zahl (" + zahl2 + ").");
        } else if (zahl1 < zahl2) {
            System.out.println("Die zweite Zahl (" + zahl2 + ") ist größer als die erste Zahl (" + zahl1 + ").");
        } else {
            System.out.println("Beide Zahlen sind gleich groß (" + zahl1 + ").");
        }
    }
}
