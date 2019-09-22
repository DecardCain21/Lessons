package com.example.satana.AnotherArrays;

import java.util.ArrayList;

public class ArraysMax123 {
    public static void main(String[] args) {
        int max = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int max3 = Integer.MIN_VALUE;
        int[] array = {78, 75, 76, 47, 5, 63, 102, 104,107};
        for (int i = 0; i < array.length; i++) {//лучше фор ич(удобнее)
            if (max < array[i]) {
                max3 = max2;
                max2 = max;
                max = array[i];
            }
            else if (max2 < array[i]) {
                max3 = max2;
                max2 = array[i];
            }
            else if (max3 < array[i]) {
                max3 = array[i];
            }
            System.out.println("max:" + max + " max2:" + max2 + " max3:" + max3);
        }
    }
}

