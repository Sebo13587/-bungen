package uebungen;

public class _620_Palindrom_Sebastian {

    public static void main(String[] args) {

        /*
         * Palindrom
         *
         * Ein Palindrom ist ein Text,
         * der von vorne und hinten gelesen den gleichen Inhalt hat.
         * Z. B. »Lagerregal« oder »Trug Tim eine so helle Hose nie mit Gurt?«.
         * Leer- und Satzzeichen werden dabei ignoriert.
         * Schreibe eine Methode, die testet,
         * ob eine Zeichenkette ein Palindrom ist.
         */

        String text1 = "Lagerregal";
        String text2 = "Trug Tim eine so helle Hose nie mit Gurt?";
        String text3 = "Hallo Welt";

        System.out.println(text1 + " ist ein Palindrom?: " + istPalindrom(text1));  //Ja
        System.out.println(text2 + " ist ein Palindrom?: " + istPalindrom(text2));  //Ja
        System.out.println(text3 + " ist ein Palindrom?: " + istPalindrom(text3));  //Nein
    }

    public static String istPalindrom(String text) {
        String bereinigterText = text.replaceAll("[\\W]", "").toLowerCase();
        String umgekehrterText = new StringBuilder(bereinigterText).reverse().toString();
        return bereinigterText.equals(umgekehrterText) ? "Ja" : "Nein";
    }

}
