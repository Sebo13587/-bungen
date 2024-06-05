package uebungen;

import java.util.Random;

public class _030_Wuerfeln_Sebastian {
    public static void main(String[] args) {
        /*
         * Würfeln
         *
         * Würfel eine Zahl (von 1 bis 6) und gib aus,
         * was gewürfelt wurde:
         * Super, eine 6!
         * Immerhin noch eine 5!
         * Das reicht nicht! (bei 1-4)
         */
        Random r = new Random();
        // Würfle eine Zahl zwischen 1 und 6
        int wuerfel = (r.nextInt(1,7));
        System.out.println("Wurf: " + wuerfel);

        // Gib das Ergebnis aus
        if (wuerfel == 6) {
            System.out.println("Super, eine 6!");
        } else if (wuerfel == 5) {
            System.out.println("Immerhin noch eine 5!");
        } else {
            System.out.println("Das reicht nicht! (bei 1-4)");
        }
    }

}
