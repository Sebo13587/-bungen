package uebungen;

import java.util.Random;

public class _670_HonkyTonk_Sebastian {

    /*
     * Honky-Tonk
     *
     * Simuliere das Spiel Honky-tonk.
     * Bei diesem Spiel bezahlt der Spieler pro Runde einen Euro als Einsatz.
     * Er darf nun drei Würfel werfen.
     * Zeigt mindestens ein Würfel eine sechs,
     * so erhält er schonmal den Einsatz zurück.
     * Zusätzlich erhält er für jede geworfene Sechs einen Euro als Gewinn ausbezahlt.
     * Das heisst, dass er bei drei Sechsen 4 Euro bekommt.
     * Liegt keine Sechs, so verliert er den Einsatz.
     * Starte mit einem Kapital von 300 Euro und simuliere 1000 Runden.
     */
    public static void main(String[] args) {
        int kapital = 300;
        int einsatz = 1;
        int runden = 1000;
        Random rand = new Random();
        System.out.println("Dein Startkapital beträgt " + kapital + " Euro");
        System.out.println("--------------------------------------");
        for (int i = 0; i < runden; i++) {
            if (kapital <= 0) {
                System.out.println("Runde " + (i+1) + ": Das Kapital ist aufgebraucht. Spiel beendet.");
                System.out.println("--------------------------------------");
                break;
            }

            kapital -= einsatz;
            System.out.println("Einsatz für Runde " + (i+1) + ": " + einsatz + " Euro");
            int gewinn = 0;

            for (int j = 0; j < 3; j++) {
                int wurf = rand.nextInt(6) + 1;
                System.out.println("Wurf: " + wurf);
                if (wurf == 6) {
                    gewinn++;
                }
            }

            if (gewinn > 0) {
                kapital += einsatz;  // Einsatz zurück
                if (gewinn > 1) {
                    kapital += gewinn - 1;  // Zusätzlicher Gewinn nur wenn mehr als eine 6 geworfen wurde
                }
            }
            System.out.println("Gewinn für Runde " + (i+1) + ": " + gewinn + " Euro");

            System.out.println("Runde " + (i+1) + ": Kapital beträgt " + kapital + " Euro");
            System.out.println("--------------------------------------");
        }
        //System.out.println("--------------------------------------");
        System.out.println("Nach " + runden + " Runden beträgt das Kapital: " + kapital + " Euro");
    }
}
