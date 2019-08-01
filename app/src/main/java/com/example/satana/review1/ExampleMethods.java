package com.example.satana.review1;

import java.util.Scanner;

public class ExampleMethods {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int chislo = enterNum(scan);
        int stepen = enterStepen(scan);

        int result = vstepen(chislo, stepen);

        System.out.println(result);

        scan.close();
    }

    private static int enterNum(Scanner scan) {
        System.out.println("Введите число:");
        return scan.nextInt();
    }

    private static int enterStepen(Scanner scan) {
        System.out.println("Введите степень");
        return scan.nextInt();
    }

    public static int vstepen(int num1, int stepen) {
        int result = 1;
        for (int i = 0; i < stepen; i++) {
            result = result * num1;
        }
        return result;
    }
}
