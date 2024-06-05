package uebungen;

import java.util.Random;

public class _190_Kniffel_Sebastian {
    public static void main(String[] args) {

        /*
         * Kniffel
         *
         * Verwende einen Zufallszahlengenerator
         * um Würfelergebnisse (1-6) zu simulieren.
         * Werfe nun 5 Würfel und bilde die Augensumme.
         * Spiele dieses Experiment 1000 Mal durch
         * und ermittel, wie oft jede mögliche Augensumme
         * (Minimum = 5, Maximum = 30) vorgekommen ist.
         * Gib das Ergebnis wie unten grafisch aus.
         */

/*
05->
06->
07->xx
08->xxxxx
09->xxxxxxxxx
10->xxxxxxxxxxxxx
11->xxxxxxxxxxxxxxxxxxxxxxxxxxx
12->xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx
13->xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx
14->xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx
15->xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx
16->xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx
17->xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx
18->xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx
19->xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx
20->xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx
21->xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx
22->xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx
23->xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx
24->xxxxxxxxxxxxxxxx
25->xxxxxxxxxxxxxxxx
26->xxxxxxxxxxx
27->xxxxx
28->xx
29->xx
30->
*/
        int[] counts = new int[26];
        Random rand = new Random();

        for (int i = 0; i < 1000; i++) {
            int sum = 0;
            for (int j = 0; j < 5; j++) {
                sum += rand.nextInt(6) + 1;
            }
            counts[sum - 5]++;
            //System.out.print(sum + ", ");
        }

        for (int i = 0; i < counts.length; i++) {
            System.out.printf("%02d->", i + 5);
            for (int j = 0; j < counts[i]; j++) {
                System.out.print("x");
            }
            System.out.println();
        }
    }
}
