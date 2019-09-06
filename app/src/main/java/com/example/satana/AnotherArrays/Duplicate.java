package com.example.satana.AnotherArrays;

public class Duplicate {
    public static void main(String[] args) {
        int duplicate=0;
        int[] array = {4,10,10,4,9,2,5,7,5};
        for(int i=0;i<array.length;i++){
            for(int z=0;z<i;z++){
                if(array[i]==array[z]){
                    duplicate++;
                }
            }
        }
        System.out.println("Number of duplicate:"+duplicate);
    }
}
