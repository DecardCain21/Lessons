package com.example.satana.ArraysPack;

import java.util.Arrays;

public class RasminkaEx2 {
    public static void main(String[] args) {
        int[]massiv=new int[10];
        for(int i=1;i<massiv.length;i+=2){
            massiv[i]=1;
            System.out.println(Arrays.toString(massiv));//massiv[i]?
        }
    }
}
//Тоже самое с ArrayList
