package com.example.satana.review1;

import java.util.ArrayList;
import java.util.Scanner;

public class MethodFunctionsB {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int []finalmassiv = {20,22,23,1,5};
        int z = method2(finalmassiv);
        System.out.println("Сумма элементов:"+z);
        scan.close();
    }

//    private static ArrayList<Integer> createmass(ArrayList<Integer> massiv, Scanner scan) {
//        int n = 1;
//        while (n != 0) {
//            System.out.println("Введите число:");
//            n = scan.nextInt();
//            massiv.add(n);
//        }
//        return massiv;
//    }

    private static int method2(int[] finalmassiv) {
        int summ =0;
        int i;
        for (i = 0; i < finalmassiv.length; i++) {
            System.out.println("Проверяка1:"+i);
            summ=summ+finalmassiv[i];

        }
        return summ;
    }
}


