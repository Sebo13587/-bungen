package uebungen;

public class _710_Zahlenbeginn_Sebastian {

    /*
     * Zahlenbeginn
     *
     * In einem Spiel werden die Zahlen von 1 bis n durchgezählt.
     * Man kann nun folgende Feststellung machen:
     * Die 12. Zahl, die mit den Ziffern 253 beginnt, ist 25 300;
     * denn 253 ist die 1., 2530 die 2., 2531 die 3., ..., 2539 die 11., und 25 300 die 12. Zahl.
     *
     * Schreibe ein Programm, das die 1000. Zahl ermittelt, die mit den Ziffern 9876 beginnt.
     */
    public static void main(String[] args) {
        findNumber(253, 12);
        findNumber(9876, 1000);
    }

    public static void findNumber(int start, int targetCount) {
        int count = 0;
        int number = start;
        while (true) {
            if (String.valueOf(number).startsWith(String.valueOf(start))) {
                count++;
            }
            if (count == targetCount) {
                break;
            }
            number++;
        }
        System.out.println("Die " + targetCount + ". Zahl, die mit den Ziffern " + start + " beginnt, ist " + number);
    }
}

