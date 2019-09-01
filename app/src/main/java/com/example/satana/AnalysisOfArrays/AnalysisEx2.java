package com.example.satana.AnalysisOfArrays;

public class AnalysisEx2 {
    public static void main(String[] args) {
        int []array={0,80,1,8,20,2,3,4,5};
        int z=0;
        for (int i=0;i<array.length;i++) {
            if(array[i]%2==0){
                z++;
            }
        }
        System.out.println("Кол-во чётных чисел в массиве:"+(z-1));
    }
}
//Integer i:array
//Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 8
//	at com.example.satana.AnalysisOfArrays.AnalysisEx2.main(AnalysisEx2.java:8)
