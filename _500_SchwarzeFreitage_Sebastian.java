package uebungen;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class _500_SchwarzeFreitage_Sebastian {

    public static void main(String[] args) {

        /*
         * Schwarze Freitage
         *
         * Schreibe ein Methode, mit dem alle Freitage einer beliebigen
         * Zeitspanne aufgezeigt werden, die auf einen 13. fielen.
         * Die Methode erwartet das Anfangsjahr und das Endjahr als Parameter.
         *
         * Zusatz:
         * Ermittle, in welchen Jahren des 20. Jahrhundert, es jeweils drei schwarze Freitage gab.
         */

        int startYear = 1901; // Anfangsjahr
        int endYear = 2000; // Endjahr

        for (int year = startYear; year <= endYear; year++) {
            int count = 0; // Zähler für schwarze Freitage

            for (int month = 1; month <= 12; month++) {
                LocalDate date = LocalDate.of(year, month, 13);
                if (date.getDayOfWeek() == DayOfWeek.FRIDAY) {
                    count++;
                    System.out.println("Freitag der 13. im Jahr " + year + ": " + date);
                }
            }
            System.out.println();
            if (count == 3) {
                System.out.println("Im Jahr " + year + " gab es drei schwarze Freitage.");
                System.out.println();

            }
        }
    }
}
