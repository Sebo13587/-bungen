package uebungen;

import java.util.Random;
import java.util.Scanner;

public class _420_ZahlRaten_Sebastian {

    public static void main(String[] args) {

        /*
         * Zahl raten
         *
         * Schreibe ein Programm,
         * das sich eine Zahl zwischen 1 und 10 ausdenkt
         * und den Benutzer diese Zahl raten läßt.
         * Nach jedem Versuch gibt das Programm aus,
         * ob zu hoch, zu niedrig oder richtig geraten wurde.
         * Am Ende soll ausgegeben werden, wie viele Versuche gebraucht wurden.
         */
        Random rand = new Random();
        int zufallszahl = rand.nextInt(10) + 1;
        Scanner scanner = new Scanner(System.in);
        int versuche = 0;
        int gerateneZahl = 0;

        System.out.println("Ich habe mir eine Zahl zwischen 1 und 10 ausgedacht. Kannst du sie erraten?");

        while (gerateneZahl != zufallszahl) {
            System.out.println("Gib deine Vermutung ein:");
            gerateneZahl = scanner.nextInt();
            versuche++;

            if (gerateneZahl < zufallszahl) {
                System.out.println("Zu niedrig geraten!");
            } else if (gerateneZahl > zufallszahl) {
                System.out.println("Zu hoch geraten!");
            }
        }

        System.out.println("Richtig geraten! Die Zahl war " + zufallszahl + ".");
        System.out.println("Du hast " + versuche + " Versuche gebraucht.");
    }

}
