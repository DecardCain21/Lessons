package com.example.satana.AnotherArrays;

public class SmallestElements {
    public static void main(String[] args) {
        int min = Integer.MAX_VALUE;
        int min2=Integer.MAX_VALUE;
        int[] array = {10, 4, 5, 7, 9, 1 , 3, 6, 2};
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min2 = min;
                min = array[i];
            }
            else if(min2>array[i]){
                min2=array[i];
            }
        }
        System.out.println("min value:"+min+"\nmin2 value:"+min2);
    }
}
