package com.example.satana.ArraysPack;

public class RasminkaEx1 {
    public static void main(String[] args) {
        int[]massiv=new int[10];
        for(int i=0;i<massiv.length;i++){
            massiv[0]=1;
            massiv[massiv.length-1]=1;
            System.out.println(massiv[i]);
        }
    }
}
