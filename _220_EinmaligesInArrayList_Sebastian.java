package uebungen;

import java.util.*;

public class _220_EinmaligesInArrayList_Sebastian {

    public static void main(String[] args) {

        /*
         * Einmaliges in ArrayList
         *
         * Schreibe ein Programm, das eine ArrayList mit neun Zahlen zufällig befüllt.
         * Dabei sollen vier Zahlen doppelt vorkommen und eine Zahl nur einmal.
         *
         * Mische dann die ArrayList per Collections.shuffle(ArrayList)
         *
         * Finde dann aus dieser ArrayList die Zahl, die nur einmal vorkommt.
         * Tipp: Benutze eine HashMap<Integer, Integer>
         */
        ArrayList<Integer> numbers = generateNumbers();
        //System.out.println("Die Zahlen ungemischt sind: " + numbers);

        //ArrayList Mischen
        Collections.shuffle(numbers);
        System.out.println("Die Zahlen sind: " + numbers);
        System.out.println();

        //Die einzigartige Zahl suchen
        int uniqueNumber = findUniqueNumber(numbers);
        System.out.println("Die einzigartige Nummer ist: " + uniqueNumber);
    }

    public static ArrayList<Integer> generateNumbers() {
        ArrayList<Integer> numbers = new ArrayList<>();
        Random rand = new Random();
        int uniqueNum = rand.nextInt(10);  //Einzigartige Zahl
        numbers.add(uniqueNum);
        while (numbers.size() < 9) {
            int randomNum;
            do {
                randomNum = rand.nextInt(10);  //Zufällige Zahlen
            } while (numbers.contains(randomNum));  //Vergleichen ob Einzigartige Zahl nicht schon vorhanden ist
            numbers.add(randomNum);
            numbers.add(randomNum);
        }
        return numbers;
    }


    public static int findUniqueNumber(ArrayList<Integer> numbers) {
        HashMap<Integer, Integer> countMap = new HashMap<>();
        for (int num : numbers) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        return -1;
    }
}
