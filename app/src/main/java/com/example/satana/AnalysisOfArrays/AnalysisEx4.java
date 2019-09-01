package com.example.satana.AnalysisOfArrays;

public class AnalysisEx4 {
    public static void main(String[] args) {
        int[]array={0,1,20,3,4,5,7,8,10};
        int summ=0;
        for (int i=0;i<array.length;i++) {//или сделать чётные шаг
            System.out.println(i+"|"+array[i]);
            if(i%2==0){
                summ=summ+array[i];
            }
        }
        System.out.println(summ);
    }
}