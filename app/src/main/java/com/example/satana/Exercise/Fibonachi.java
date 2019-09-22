package com.example.satana.Exercise;

import java.util.Scanner;

public class Fibonachi {
    public static void main(String[] args) {
        System.out.println(" Числа Фибоначчи ");
        Scanner scan = new Scanner(System.in);
        int u, u1 = 1, u2 = 0;
        System.out.println("Введите N=");
        int n = scan.nextInt();
        for (u = 1; ; u += 1) {
            u = u1 + u2;
            if (u >= n)
                break;
            u1 = u2;
            u2 = u;
            System.out.println("Ряд Фибо: " + u);// - "Переменная1 = " + u1 + " || Переменная2 = " + u2 ещё такой вариант нашёл

        }
        scan.close();
    }
}
