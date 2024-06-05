package uebungen;

public class _630_PrimzahlenRueckwaerts_Sebastian {

    public static void main(String[] args) {

        /*
         * Primzahlen rückwärts
         *
         * Schreibe eine Programm, das alle Primzahlen bis 1000 ausgibt,
         * die, wenn man sie rückwärts liest, auch eine Primzahl sind.
         *
         * Z.B. 199 und 991 sind beides Primzahlen.
         */
        for (int i = 1; i <= 1000; i++) {
            if (istPrimzahl(i) && istPrimzahl(umkehren(i))) {
                System.out.println("Ist auch Rückwärts eine Primzahl: " + i);
            }
        }
    }

    public static boolean istPrimzahl(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int umkehren(int num) {
        int umgekehrt = 0;
        while (num != 0) {
            int ziffer = num % 10;
            umgekehrt = umgekehrt * 10 + ziffer;
            num /= 10;
        }
        return umgekehrt;
    }

}
