package com.example.satana.Exercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите 1-ое число:");
        int numb1 = scan.nextInt();
        System.out.println("Введите 2-ое число:");
        int numb2 = scan.nextInt();
        int Ostatok = 0;
        int Ostatok2 = 0;
        List<Integer> numbList1 = new ArrayList<Integer>();
        List<Integer> numbList2 = new ArrayList<Integer>();
        for (int i = 0; i <= numb1; i++) {
            Collections.sort(numbList1);
            Ostatok = numb1 % 10;
            numb1 = numb1 / 10;
            numbList1.add(Ostatok);
            System.out.println("Массив один:" + numbList1);
        }
        for (int z = 0; z <= numb2; z++) {
            Collections.sort(numbList2);
            Ostatok2 = numb2 % 10;
            numb2 = numb2 / 10;
            numbList2.add(Ostatok2);
            System.out.println("Массив два:" + numbList2);
        }
    }
}
//Collections.sort(list1);
//Collections.sort(list2);
//System.out.println(list1.equals(list2));
////list1.containsAll(list2)

//for (int j = 0; j <= numbList1.size(); j++) {
//            for ( j = j + 1; j <= numbList1.size(); j++) {
//                System.out.println(numbList1);
//            }