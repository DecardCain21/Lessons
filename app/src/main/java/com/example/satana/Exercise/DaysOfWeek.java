package com.example.satana.Exercise;

import java.util.Scanner;

public class DaysOfWeek {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char[] array = new char[8];
        array[0] = '1';
        array[1] = '2';
        array[2] = '3';
        array[3] = '4';
        array[4] = '5';
        array[5] = '6';
        array[6] = '7';
        while (true) {
            System.out.println("Введите 1-ое число:");
            char numb1 = scan.next().charAt(0);
            if (array[0] == numb1) {
                System.out.println("Понедельник");
            }
            else if (array[1] == numb1) {
                System.out.println("Вторник");
            }
            else if (array[2] == numb1) {
                System.out.println("Среда");
            }
            else if (array[3] == numb1) {
                System.out.println("Четверг");
            }
            else if (array[4] == numb1) {
                System.out.println("Пятница");
            }
            else if (array[5] == numb1) {
                System.out.println("Суббота");
            }
            else if (array[6] == numb1) {
                System.out.println("Воскресенье");
            } else {
                System.out.println("Золотой рудник обрушился");
            }
        }
    }
}
