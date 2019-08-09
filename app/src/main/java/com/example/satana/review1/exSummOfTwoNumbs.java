package com.example.satana.review1;

public class exSummOfTwoNumbs {
    public static void main(String[] args) {
        int[] massiv = {4, 6, 1, 3, 4};
        int result = summ(massiv);
        System.out.println(result);
    }

    private static int summ(int[] massiv) {
        if (massiv.length < 2) {
            return massiv[0];
        } else {
            return massiv[0] + massiv[1];
        }
    }
}

