package uebungen;

public class _120_Fakultaet_Sebastian {

    public static void main(String[] args) {

        /*
         * Fakultät
         *
         * Schreibe ein Programm,
         * das ermittelt, welche Zahl möglichst groß ist
         * ohne dass ihre Fakultät über 1.000.000.000 ist.
         *
         * Gib zum Beweiß auch alle kleineren Fakultäten aus.
         *
         * Hinweis:
         * Fakultät von 5 (Kurzschreibweise: 5!):
         * 1 * 2 * 3 * 4 * 5 = 120
         */
        long fakultaet = 1;
        int i = 1;

        while (true) {
            fakultaet *= i;

            if (fakultaet > 1000000000) {
                break;
            }

            System.out.println("Fakultät von " + i + " ist " + fakultaet);
            i++;
        }
        System.out.println();
        System.out.println("Die größte Zahl, deren Fakultät kleiner als 1.000.000.000 ist, ist: " + (i - 1));
    }
}
