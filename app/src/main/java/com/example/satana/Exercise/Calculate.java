package com.example.satana.Exercise;

import java.util.Scanner;

public class Calculate {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
//        String[] array = new String[5];
//        array[0] = "%";
//        array[1] = "/";
//        array[2] = "*";
//        array[3] = "+";
//        array[4] = "-";
        System.out.println("Введите 1-ое число:");
        int numb1 = scan.nextInt();
        System.out.println("Введите оператора:");
        final char operator = scan.next().charAt(0);
        System.out.println("Введите 2-ое число:");
        int numb2 = scan.nextInt();
        switch (operator) {
            case '%':
                System.out.println("Итого:" + (numb1 % numb2));
                break;

            case '/':
                System.out.println("Итого:" + (numb1 / numb2));
                break;

            case '*':
                System.out.println("Итого:" + (numb1 * numb2));
                break;

            case '+':
                System.out.println("Итого:" + (numb1 + numb2));
                break;
            case '-':
                System.out.println("Итого:" + (numb1 - numb2));
                break;
        }
    }
}


