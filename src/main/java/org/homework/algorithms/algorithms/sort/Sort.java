package org.homework.algorithms.algorithms.sort;

public class Sort {

    public static void InsertionSort(int[] intArray) {

        for (int j = 1; j < intArray.length; j++) {
            var key = intArray[j];
            int i = j - 1;
            while (i >= 0 && intArray[i] > key) {
                intArray[i + 1] = intArray[i];
                i = i - 1;
            }
            intArray[i + 1] = key;
        }
    }
}
