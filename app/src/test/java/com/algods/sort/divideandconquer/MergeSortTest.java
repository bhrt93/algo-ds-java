package com.algods.sort.divideandconquer;

public class MergeSortTest {

    public static void main(String[] args) {
        MergeSort mergeSort = new MergeSort();
        int[] intArray = { 20, 35, -15, 7, 55, 1, -22 };

        mergeSort.mergeSort(intArray, 0, intArray.length);

        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
    }
}
