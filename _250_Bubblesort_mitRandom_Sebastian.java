package uebungen;

import java.util.Random;

public class _250_Bubblesort_mitRandom_Sebastian {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(20);  // Füllt das Array mit Zufallszahlen
        }

        System.out.println("Unsortiertes Array:");
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println();
        array = bubbleSort(array);

        System.out.println("Sortiertes Array:");
        for (int i : array) {
            System.out.print(i + " ");
        }
    }

    public static int[] bubbleSort(int[] array) {
        int n = array.length;
        boolean swapped;
        do {
            swapped = false;
            for (int i = 0; i < n - 1; i++) {
                if (array[i] > array[i + 1]) {
                    // Tausche array[i] und array[i+1]
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    swapped = true;
                }
            }
        } while (swapped);
        return array;
        }
    }

