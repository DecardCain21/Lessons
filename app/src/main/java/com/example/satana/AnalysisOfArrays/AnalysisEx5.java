package com.example.satana.AnalysisOfArrays;

import java.math.BigInteger;

public class AnalysisEx5 {
    public static void main(String[] args) {
        int[]array={1,8,3,6,2};
        int min= Integer.MAX_VALUE;
        for(int i=0;i<array.length;i++){
            if(array[i]%2==0){
                if(array[i]<min){
                    min=array[i];
                }
            }
        }
        System.out.println(min);
    }
}
