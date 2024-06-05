package uebungen;

import java.util.HashMap;

public class _450_Primzahlensieb_Sebastian {

    public static void main(String[] args) {

        /*
         * Primzahlensieb (Sieb des Eratosthenes)
         *
         * Schreibe ein Programm, das alle Primzahlen bis zur Zahl n ermittelt.
         *
         * Die Primzahlen sollen mithilfe des Siebs des Eratosthenes
         * folgendermaßen ermittelt werden:
         *
         * - Lege eine HashMap an mit den Indexen von der kleinensten natürlichen Primzahl 2
         *   bis zur Zahl n mit jeweils dem Wert true.
         *
         * - Setze den Wert aller Indexe, die ein Vielfaches der Zahl 2 sind, auf false.
         *
         * - Suche die nächstgrößere Zahl, deren Wert true ist
         *   und setze wieder alle Vielfachen der Zahl auf false.
         *
         * - Führe diesen Schritt solange weiter durch, bis von einer Zahl
         *   das kleinste Vielfache ausserhalb der HashMap liegt.
         *
         * - Alle Indexe, deren Wert jetzt noch true sind, sind die Primzahlen.
         *
         * Die Ausgabe soll in folgender Form erfolgen:
         * (In jeder Zeile sollen 10 Zahlen stehen.)
         *
         *      2     3     5     7    11    13    17    19    23    29
         *     31    37    41    43    47    53    59    61    67    71
         *     73    79    83    89    97   101   103   107   109   113
         *    127   131   137   139   149   151   157   163   167   173
         *    ...
         *    ...
         *    ...
         */

        int n = 282; //gewünschte Obergrenze
        printPrimes(n);
    }

    public static void printPrimes(int n) {
        HashMap<Integer, Boolean> isPrime = sieveOfEratosthenes(n);
        int count = 0;
        for (int i = 2; i <= n; i++) {
            if (isPrime.get(i)) {
                System.out.printf("%6d", i);
                count++;
                if (count % 10 == 0) {
                    System.out.println();
                }
            }
        }
    }

    public static HashMap<Integer, Boolean> sieveOfEratosthenes(int n) {
        HashMap<Integer, Boolean> isPrime = new HashMap<>();
        for (int i = 2; i <= n; i++) {
            isPrime.put(i, true);
        }
        for (int i = 2; i * i <= n; i++) {
            if (isPrime.get(i)) {
                for (int j = i * i; j <= n; j += i) {
                    isPrime.put(j, false);
                }
            }
        }
        return isPrime;
    }
}
