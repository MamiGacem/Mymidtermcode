package algorithm;

import org.junit.Assert;
import org.junit.Before;

import java.util.Random;

public class UnitTestSorting {

    /*
      This class is about Unit testing for Sorting Algorithm.
     */
    public static void main(String[] args) {
        int[] unSortedArray = {6, 9, 2, 5, 1, 0, 4};
        int[] sortedArray = {0, 1, 2, 4, 5, 6, 9};
        //Create Sort object
        Sort sort = new Sort();
        //apply unsorted array to selectionSort.
        sort.selectionSort(unSortedArray);
        //verify if the unsorted array is sorted by the selection sort algorithm.
        try {
            Assert.assertArrayEquals(sortedArray, unSortedArray);
        } catch (Exception ex) {
            ex.getMessage();
        }
        sort.insertionSort(unSortedArray);
        try {
            Assert.assertArrayEquals(sortedArray, unSortedArray);
        } catch (Exception ex) {
            ex.getMessage();
        }
       sort.bubbleSort(unSortedArray);
        try {
            Assert.assertArrayEquals(sortedArray, unSortedArray);
        } catch (Exception ex) {
            ex.getMessage();
        }
        sort.mergeSort(unSortedArray);
        try {
            Assert.assertArrayEquals(sortedArray, unSortedArray);
        } catch (Exception ex) {
            ex.getMessage();
        }
        sort.bucketSort(unSortedArray);
        try {
            Assert.assertArrayEquals(sortedArray, unSortedArray);
        } catch (Exception ex) {
            ex.getMessage();
        }
        sort.heapSort(unSortedArray);
        try {
            Assert.assertArrayEquals(sortedArray, unSortedArray);
        } catch (Exception ex) {
            ex.getMessage();
        }
        sort.shellSort(unSortedArray);
        try {
            Assert.assertArrayEquals(sortedArray, unSortedArray);
        } catch (Exception ex) {
            ex.getMessage();
        }
        sort.quickSort(unSortedArray);
        try {
            Assert.assertArrayEquals(sortedArray, unSortedArray);
        } catch (Exception ex) {
            ex.getMessage();
        }
    }}













