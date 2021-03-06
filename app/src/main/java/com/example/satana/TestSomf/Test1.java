package com.example.satana.TestSomf;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Test1 {
    public static void main(String[] args) {

        int [] array =  {64, 42, 73, 41, 32, 53, 16, 24, 57, 42, 74, 55, 36};
        System.out.println("Массив:"+Arrays.toString(array));
        quickSort(array, 0, array.length - 1);
        System.out.println("После сортировки:"+Arrays.toString(array));


    }

    public static void quickSort(int[] arr, int from, int to) {


        if (from < to) {

            int divideIndex = partition(arr, from, to);

            quickSort(arr, from, divideIndex - 1);

            quickSort(arr, divideIndex, to);
        }
    }

    private static int partition(int[] arr, int from, int to) {
        int rightIndex = to;
        int leftIndex = from;

        int pivot = arr[from + (to - from) / 2];//arr[from]
        while (leftIndex <= rightIndex) {

            while (arr[leftIndex] < pivot) {
                leftIndex++;
            }

            while (arr[rightIndex] > pivot) {
                rightIndex--;
            }

            if (leftIndex <= rightIndex) {
                swap(arr, rightIndex, leftIndex);
                leftIndex++;
                rightIndex--;
            }
        }
        return leftIndex;
    }

    private static void swap(int[] array, int index1, int index2) {
        int tmp  = array[index1];
        array[index1] = array[index2];
        array[index2] = tmp;
    }
}
