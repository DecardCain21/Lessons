package com.example.satana.NewMassivi;

import java.util.Arrays;

public class ReturnArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 32, 4, 53, 6, 77, 8};
        int [] tempArray=reversArray(array);
        System.out.println("Перевёрнутый массив:" + Arrays.toString(tempArray));
    }

    public static  int [] reversArray(int [] array) {
        int[] tempArray = new int[array.length];
        int n = array.length;
        for (int i = array.length - 1; i >= 0; i--) {
            tempArray[n - i - 1] = array[i];
            System.out.println("Проверка:" + Arrays.toString(tempArray));
        }
        return tempArray;

    }
}

