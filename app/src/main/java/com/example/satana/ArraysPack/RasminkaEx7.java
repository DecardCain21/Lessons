package com.example.satana.ArraysPack;

import java.util.Arrays;

public class RasminkaEx7 {
    public static void main(String[] args) {
        int[] massiv = new int[10];
        for (int i = 1; i < massiv.length; i++) {
            massiv[i]=i*i;
            System.out.println(Arrays.toString(massiv));
        }
    }
}
