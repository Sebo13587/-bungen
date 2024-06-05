package uebungen;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class _680_KartenMischen_Sebastian {

    /*
 * Karten mischen
 *
 * Schreibe ein Programm, das das Mischen der 32 Karten eines Skatspiels simuliert.
 * Jede Karte wird durch eine ArrayList der Form [Farbe, Wert] dargestellt.
 * Die Farben sind: Kreuz, Pik, Herz und Karo.
 * Die Werte sind: Ass, König, Dame, Bube, Zehn, Neun, Acht, Sieben.
 *
 * Zunächst wird eine ArrayList mit den 32 Karten-ArrayListen erstellt.
 *
 * Durch wiederholtes Vertauschen zweier zufällig ausgewählter
 * Karten sollen die ArrayLists dann noch gemischt werden.
 *
 * Die Ausgabe könnte folgendermaßen aussehen:
 *
Ungemischt:
[Kreuz, Sieben] [Kreuz, Acht]   [Kreuz, Neun]   [Kreuz, Zehn]   [Kreuz, Bube]   [Kreuz, Dame]   [Kreuz, König]  [Kreuz, Ass]
[Pik, Sieben]   [Pik, Acht]     [Pik, Neun]     [Pik, Zehn]     [Pik, Bube]     [Pik, Dame]     [Pik, König]    [Pik, Ass]
[Herz, Sieben]  [Herz, Acht]    [Herz, Neun]    [Herz, Zehn]    [Herz, Bube]    [Herz, Dame]    [Herz, König]   [Herz, Ass]
[Karo, Sieben]  [Karo, Acht]    [Karo, Neun]    [Karo, Zehn]    [Karo, Bube]    [Karo, Dame]    [Karo, König]   [Karo, Ass]
Gemischt:
[Karo, Dame]    [Herz, König]   [Pik, Neun]     [Pik, Ass]      [Herz, Ass]     [Kreuz, Zehn]   [Karo, Sieben]  [Kreuz, Bube]
[Pik, Zehn]     [Kreuz, Neun]   [Pik, Acht]     [Karo, König]   [Pik, Sieben]   [Herz, Bube]    [Kreuz, Dame]   [Karo, Neun]
[Pik, Bube]     [Karo, Acht]    [Herz, Zehn]    [Kreuz, Acht]   [Kreuz, König]  [Kreuz, Sieben] [Pik, Dame]     [Kreuz, Ass]
[Pik, König]    [Herz, Sieben]  [Herz, Neun]    [Herz, Acht]    [Herz, Dame]    [Karo, Zehn]    [Karo, Bube]    [Karo, Ass]
 */
    public static void main(String[] args) {
        List<String> suits = Arrays.asList("Kreuz", "Pik", "Herz", "Karo");
        List<String> ranks = Arrays.asList("Ass", "König", "Dame", "Bube", "Zehn", "Neun", "Acht", "Sieben");

        ArrayList<ArrayList<String>> deck = new ArrayList<>();

        for (String suit : suits) {
            for (String rank : ranks) {
                deck.add(new ArrayList<>(Arrays.asList(suit, rank)));
            }
        }

        System.out.println("Ungemischt:");
        printDeck(deck);

        Collections.shuffle(deck);

        System.out.println("\nGemischt:");
        printDeck(deck);
    }

    private static void printDeck(ArrayList<ArrayList<String>> deck) {
        for (int i = 0; i < deck.size(); i++) {
            System.out.printf("%-20s", deck.get(i));
            if ((i + 1) % 8 == 0) {
                System.out.println();
            }
        }
    }
}
