package com.example.satana.ArraysPack;

import java.util.Arrays;

public class RasminkaEx3 {
    public static void main(String[] args) {
        int[] massiv = new int[10];
        for (int i = 0; i < massiv.length; i += 2) {
            massiv[i] = i+1;
            System.out.println(Arrays.toString(massiv));//massiv[i]?
        }
    }
}

