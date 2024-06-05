package uebungen;

import java.util.Random;
import java.util.Arrays;

public class _090_KleinsteVonDreiUnterschiedlichenZahlen_Sebastian {

    public static void main(String[] args) {

        /*
         * Kleinste von drei UNTERSCHIEDLICHEN Zahlen
         *
         * Schreibe ein Programm,
         * das drei Variablen mit zufälligen,
         * UNTERSCHIEDLICHEN Zahlen (aus dem gleichen Zahlenraum) befüllt.
         * Dann soll das Programm testen,
         * welche der Zahlen die Kleinste ist und diese ausgeben.
         *
         */
        Random rand = new Random();
        int[] numbers = new int[3];

        for (int i = 0; i < 3; i++) {
            int num;
            do {
                num = rand.nextInt(1,51);  // Obergrenze festlegen (nur bound, zweiter Wert)
            } while (contains(numbers, num));
            numbers[i] = num;
        }

        int min = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        System.out.println("Die Zahlen sind: " + Arrays.toString(numbers));
        System.out.println("Die kleinste Zahl ist: " + min);
    }

    public static boolean contains(int[] array, int num) {
        for (int i : array) {
            if (i == num) {
                return true;
            }
        }
        return false;
    }

}

