package com.example.satana.Exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class DaysOfWeek {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("Введите число:");
            int Number = scan.nextInt();
            switch (Number) {
                case 1:
                    System.out.println("Понедельник");
                    break;
                case 2:
                    System.out.println("Вторник");
                    break;
                case 3:
                    System.out.println("Среда");
                    break;
                case 4:
                    System.out.println("Четверг");
                    break;
                case 5:
                    System.out.println("Пятница");
                    break;
                case 6:
                    System.out.println("Суббота");
                    break;
                case 7:
                    System.out.println("Воскресенье");
                    break;
                    default:
                        System.out.println("Ещё по одной?");
            }

        }
    }
}