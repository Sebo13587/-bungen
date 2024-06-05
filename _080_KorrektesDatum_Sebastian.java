package uebungen;

public class _080_KorrektesDatum_Sebastian {
    /*
     * Korrektes Datum
     *
     * Die Meyer GmbH benötigt ein Modul,
     * das ein Datum auf Korrektheit prüft.
     * Ist das zu prüfende Datum korrekt,
     * so ist die Variable datok auf 1, andernfalls auf 0
     * zu setzen.
     *
     * Beispiele:
     *
     * 29.02.1999 - datok: 0
     * 29.02.2000 - datok: 1
     * 13.05.2000 - datok: 1
     * 32.05.2000 - datok: 0
     * 24.13.2000 - datok: 0
     *
     * Für die Jahre gilt: jahr > 1900 && jahr < 2100
     */
    public static void main(String[] args) {
        String[] daten = {"29.02.1999", "29.02.2000", "13.05.2000", "32.05.2000", "24.13.2000", "31.04.2000"};
        for (String datum : daten) {
            int datok = pruefeDatum(datum);
            if (datok == 1) {
                System.out.println(datum + " - datok: " + datok + " - das Datum ist korrekt.");
            } else {
                System.out.println(datum + " - datok: " + datok + " - das Datum ist nicht korrekt.");
            }
        }
    }

    public static int pruefeDatum(String datum) {
        String[] teile = datum.split("\\.");
        int tag = Integer.parseInt(teile[0]);
        int monat = Integer.parseInt(teile[1]);
        int jahr = Integer.parseInt(teile[2]);

        if (jahr > 1900 && jahr < 2100) {
            if (monat >= 1 && monat <= 12) {
                if (monat == 2) {
                    if (((jahr % 4 == 0) && (jahr % 100 != 0)) || (jahr % 400 == 0)) {
                        if (tag >= 1 && tag <= 29) {
                            return 1;
                        } else {
                            return 0;
                        }
                    } else {
                        if (tag >= 1 && tag <= 28) {
                            return 1;
                        } else {
                            return 0;
                        }
                    }
                } else if (monat == 4 || monat == 6 || monat == 9 || monat == 11) {
                    if (tag >= 1 && tag <= 30) {
                        return 1;
                    } else {
                        return 0;
                    }
                } else {
                    if (tag >= 1 && tag <= 31) {
                        return 1;
                    } else {
                        return 0;
                    }
                }
            } else {
                return 0;
            }
        } else {
            return 0;
        }
    }
}
