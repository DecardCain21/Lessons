package com.example.satana.review1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import static java.lang.System.in;

public class DifferenceOfNumbs {
    public static void main(String[] args) {
        int[] massiv ={1,23,3,45,5};
        int result = summ(massiv);
        System.out.println(result);
    }

    private static int summ(int []massiv) {
        int result;
        Arrays.sort(massiv);
        result = massiv[4] - massiv[0];
        return result;
    }
}





