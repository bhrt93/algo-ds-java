package com.algods.sort.divideandconquer;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class QuickSortTest {
    @Test
    public void test() {
        QuickSort sorter = new QuickSort();
//        int[] arr = { 20, 35, -15, 7, 55, 1, -22 };
//
//        sorter.quickSort(arr, 0, arr.length-1);
//        System.out.println(Arrays.toString(arr));
//
//        int []arr2 = {10, 7, 8, 9, 1, 5};
//        int []expected = {1, 5, 7, 8, 9, 10};
//        sorter.quickSort(arr2, 0, arr2.length-1);
//        Assertions.assertFalse(Arrays.equals(arr2, expected));
//        System.out.println(Arrays.toString(arr2));
        
        int []arr3 = {5, 2, 1, 4, 3, 7};
        sorter.quickSort(arr3, 0, arr3.length-1);
        System.out.println(Arrays.toString(arr3));
    }
}