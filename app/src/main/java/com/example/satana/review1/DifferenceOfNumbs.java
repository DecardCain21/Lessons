package com.example.satana.review1;

import java.util.Arrays;

public class DifferenceOfNumbs {
    public static void main(String[] args) {
        int[] massiv = {1,23,3,2};
        int result = different(massiv);
        System.out.println(result);
    }

    private static int different(int[] massiv) {
        int result;
        Arrays.sort(massiv);
        result = massiv[massiv.length-1] - massiv[0];
        return result;
    }

    //сдеалать без сортировки

}





