package com.example.satana.review1;

import java.util.Arrays;

public class DifferenceOfNumbs {
    public static void main(String[] args) {
        int[] massiv = {1,23,3,2,5,55};
        int result = different(massiv);
        System.out.println(result);
    }

    private static int different(int[] massiv) {
        int result;
        int max=0;
        int min=0;
        for (int ktr = 0; ktr < massiv.length; ktr++) {
            if (massiv[ktr] > max) {
                max = massiv[ktr];
            }
            min=max;
            for (int ktr2 = 0; ktr2 < massiv.length; ktr2++) {
                if (massiv[ktr2]< min) {
                    min = massiv[ktr2];
                }
            }
        }
        System.out.println("Максимальное значение:"+max);
        System.out.println("Минимальное значение:"+min);
        result = max - min;
        return result;
    }

    //сдеалать без сортировки

}





