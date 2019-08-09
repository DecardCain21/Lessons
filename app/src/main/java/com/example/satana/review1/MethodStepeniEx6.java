package com.example.satana.review1;

public class MethodStepeniEx6 {
    public static void main(String[] args) {

        int[] massiv={7,24,3,5,18};
        int result=function(massiv,2);
    }

    private static int function( int[]massiv,int stepen) {
        int result=1;
        for(int i=0;i<massiv.length;i++){
           result=massiv[i]*massiv[i];
           System.out.println(result);
        }
        return result;
    }
}
