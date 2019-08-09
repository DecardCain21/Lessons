package com.example.satana.review1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.System.in;

public class FizzBuzzEx3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(in);
        int numbmin = enterNum(scan);
        int numbmax = enterNum2(scan);
        List<String> result = line(numbmin, numbmax);
        System.out.println(result);
    }

    private static int enterNum(Scanner scan) {
        System.out.println("Введите число минимального диапозона:");
        return scan.nextInt();
    }

    private static int enterNum2(Scanner scan) {
        System.out.println("Введите число максимального диапозона");
        return scan.nextInt();
    }

    private static List<String> line(int min, int max) {
        List<String> fizzBuzz = new ArrayList<>();
        for (int i = min; i <= max; i++) {
            String num = "";
            if (i % 3 == 0) {
                num += "Fizz";
            }
            if (i % 5 == 0) {
                num += "Buzz";
            }
            String result = num.length() > 0 ? num : String.valueOf(i); //условие ?(если тру) то что нужно вернуть :(если фолс) вернуть этот ответ
            fizzBuzz.add(result);
        }
        return fizzBuzz;
    }
}

//позаботиться о том чтоб возможность ввода разных чисел не мешало созданию диапозона