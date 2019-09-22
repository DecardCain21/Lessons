package com.example.satana.AnalysisOfArrays;

public class AnalysisEx6 {
    public static void main(String[] args) {
        int[]array={0,9,3,18,5,10,6,9,30,90};
        int max=Integer.MIN_VALUE;
        for(int i=1;i<array.length;i+=2){
                if(array[i]%3==0){
                    if(array[i]>max) {
                        max = array[i];
                        System.out.println(i+"|"+max);
                    }
                }
            }
        System.out.println("\nMax numb:"+max);
        }
    }

