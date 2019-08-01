package com.example.satana.Exercise;

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
                    return;
                case 2:
                    System.out.println("Вторник");
                    return;
                case 3:
                    System.out.println("Среда");
                    return;
                case 4:
                    System.out.println("Четверг");
                    return;
                case 5:
                    System.out.println("Пятница");
                    return;
                case 6:
                    System.out.println("Суббота");
                    return;
                case 7:
                    System.out.println("Воскресенье");
                    return;
                default:
                    System.out.println("Ещё по одной?");
            }
        }
    }
}