package com.example.satana.AnotherArrays;

public class SummOfElements {
    public static void main(String[] args) {
        int summ=Integer.MIN_VALUE;
        int[]array={1,2,9,4,20,1,7,8,2,10};
        for(int i=0;i<array.length;i++){
            if(i>=array.length-2){
                System.out.println("Максимальная сумма из трёх последовательных чисел::"+summ);
                break;
            }
            if(array[i]+array[i+1]+array[i+2]>summ){
                summ=array[i]+array[i+1]+array[i+2];
            }
        }
    }
}