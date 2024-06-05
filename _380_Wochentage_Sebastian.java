package uebungen;


import java.util.ArrayList;
import java.util.Arrays;

public class _380_Wochentage_Sebastian {

    public static void main(String[] args) {

        // Wochentage

        // Schreibe eine Metgode, der man ein Array mit Wochentag-Objekten übergeben kann
        // und die überprüft, ob dieses Array alle Wochentage
        // in der richtigen Reihenfolge beinhaltet.
        ArrayList<String> userWeekdays = new ArrayList<>(Arrays.asList("Montag", "Dienstag", "Mittwoch", "Donnerstag", "Freitag", "Samstag", "Sonntag"));

        System.out.println("Die zu überprüfenden Wochentage sind: " + userWeekdays);
        System.out.println();
        if (checkWeekdayOrder(userWeekdays)) {
            System.out.println("Die Wochentage sind in der richtigen Reihenfolge.");
        } else {
            System.out.println("Die Wochentage sind nicht in der richtigen Reihenfolge.");
        }
    }

    public static boolean checkWeekdayOrder(ArrayList<String> weekdays) {
        ArrayList<String> expectedOrder = new ArrayList<>(Arrays.asList("Montag", "Dienstag", "Mittwoch", "Donnerstag", "Freitag", "Samstag", "Sonntag"));

        if (weekdays.size() != expectedOrder.size()) {
            return false;
        }

        for (int i = 0; i < weekdays.size(); i++) {
            if (!weekdays.get(i).equals(expectedOrder.get(i))) {
                return false;
            }
        }

        return true;
    }
}
