package com.example.satana.Exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class TwoNumbs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите 1-ое число:");
        int numb1 = scan.nextInt();
        System.out.println("Введите 2-ое число:");
        int numb2 = scan.nextInt();
        int Ostatok ;
        int Ostatok2;
        List<Integer> numbList1 = new ArrayList<Integer>();
        List<Integer> numbList2 = new ArrayList<Integer>();
        while (numb1 >= 1) {
            Ostatok = numb1 % 10;
            numb1 = numb1 / 10;
            numbList1.add(Ostatok);
        }
        while (numb2 >= 1) {
            Ostatok2 = numb2 % 10;
            numb2 = numb2 / 10;
            numbList2.add(Ostatok2);
        }
        Collections.sort(numbList1);
        Collections.sort(numbList2);
        for (int i = 0; i < numbList1.size(); i++) {
            for (int j = 0; j < numbList1.size(); j++) {
                if (numbList1.get(i).equals(numbList2.get(j)) == true) {
                    System.out.println(numbList1.get(i) == (numbList2.get(j)) == true);
                    break;
                }
            }
        }
    }
}
