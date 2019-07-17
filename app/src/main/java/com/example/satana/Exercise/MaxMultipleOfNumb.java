package com.example.satana.Exercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MaxMultipleOfNumb {
    public static void main(String[] args) {
        List<Double> massnumb = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число");
        double numb = scan.nextInt();
        double multiple;
        for (int i = 1; i < numb; i++) {
            multiple = numb / i;
            if (multiple % 1 == 0) {
                massnumb.add(multiple);
            }
        }
        System.out.println(Collections.min(massnumb));
        scan.close();
    }
}
//33:2:3:4:5...






