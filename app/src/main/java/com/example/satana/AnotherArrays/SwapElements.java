package com.example.satana.AnotherArrays;

import android.view.ViewDebug;

import java.util.Arrays;

public class SwapElements {
    public static void main(String[] args) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int imax=0;
        int imin=0;
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                imin=i;

            }
            if(array[i]>max){
                max=array[i];
                imax=i;
            }
        }
        array[imax]=min;
        array[imin]=max;
        System.out.println("Легчайший свап в моей жизни:"+Arrays.toString(array));
    }
}

