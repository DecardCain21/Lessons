package com.example.satana.ArraysPack;

import java.util.Arrays;

public class RasminkaEx3 {
    public static void main(String[] args) {
        int[] massiv = new int[10];
        int d=1;
        for (int i = 0; i < massiv.length; i++) {
            massiv[i] = massiv[i]+d;
            d+=2;
            System.out.println(Arrays.toString(massiv));//massiv[i]?
        }
    }
}

