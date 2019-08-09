package com.example.satana.review1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import static java.lang.System.in;

public class FizzBuzzEx3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(in);
        int numbmin = enterNum(scan);
        int numbmax = enterNum2(scan);
        List<String> result = Line(scan, numbmin, numbmax);
        System.out.println(result);
        int i = 0;
    }

    private static int enterNum(Scanner scan) {
        System.out.println("Введите число минимального диапозона:");
        return scan.nextInt();
    }

    private static int enterNum2(Scanner scan) {
        System.out.println("Введите число максимального диапозона");
        return scan.nextInt();
    }

    private static List<String> Line(Scanner scan, int min, int max) {
        List<String> FizzBuzz = new ArrayList<>();
        for (int i = min; i <= max; i++) {
            String z = String.valueOf(i);
            if (i % 3 == 0 && i % 5 == 0) {
                FizzBuzz.add("FizzBuzz");
                continue;
            }
            if (i % 3 == 0) {
                FizzBuzz.add("Fizz");
                continue;
            }
            if (i % 5 == 0) {
                FizzBuzz.add("Buzz");
                continue;
            }
            FizzBuzz.add(z);
        }
        return FizzBuzz;
    }
}