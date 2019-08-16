package com.example.satana.review1;

import java.util.ArrayList;
import java.util.Scanner;

public class MethodFunctionsB {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> finalmassiv = new ArrayList<>();
        finalmassiv = createmass(finalmassiv, scan);
        int z = method2(finalmassiv);
        System.out.println("Сумма элементов:"+z);
        scan.close();
    }

    private static ArrayList<Integer> createmass(ArrayList<Integer> massiv, Scanner scan) {
        int n = 1;
        while (n != 0) {
            System.out.println("Введите число:");
            n = scan.nextInt();
            massiv.add(n);
        }
        return massiv;
    }

    private static int method2(ArrayList<Integer> massiv) {
        int summ =0;
        int i;
        for (i = 0; i < massiv.size(); i++) {
            System.out.println("Проверяка1:"+i);
            for (int j = massiv.get(i); j < massiv.size(); j++) {
                summ=summ+j;
                System.out.println("Проверяка2:"+summ);
            }
            break;
        }
        return summ;
    }
}


