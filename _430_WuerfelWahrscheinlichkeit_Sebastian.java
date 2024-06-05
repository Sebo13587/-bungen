package uebungen;

public class _430_WuerfelWahrscheinlichkeit_Sebastian {

        /*
         * Würfel-Wahrscheinlichkeit
         *
         * Wie groß ist die Wahrscheinlichkeit,
         * dass beim Wurf zweier Würfel die Summe der Augenzahlen 7 entspricht?
         *
         * Die Wahrscheinlichkeit dafür, dass die Summe der Augenzahlen 7 ist,
         * berechnet sich aus der Anzahl aller Würfe mit Summe 7,
         * geteilt durch die Anzahl aller möglichen Würfe.
         *
         * Zusatz:
         * Schreibe eine Methode,
         * die obige Wahrscheinlichkeit für eine beliebige Summe berechnet.
         */
        public static double berechneWahrscheinlichkeit(int summe) {
            int moeglicheKombinationen = 0;

            for (int i = 1; i <= 6; i++) {
                for (int j = 1; j <= 6; j++) {
                    if (i + j == summe) {
                        moeglicheKombinationen++;
                    }
                }
            }

            return (double) moeglicheKombinationen / 36;
        }

    public static void main(String[] args) {
        int summe = 7;
        double wahrscheinlichkeit = berechneWahrscheinlichkeit(summe);
        System.out.println("Die Wahrscheinlichkeit, dass die Summe der Augenzahlen " + summe + " ist, beträgt " + wahrscheinlichkeit);
//        int summe2 = 10;
//        double zahl = berechneWahrscheinlichkeit(summe2);
//        System.out.println("Die Wahrscheinlichkeit, dass die Summe der Augenzahlen " + summe2 + " ist, beträgt " + zahl);
    }

}
