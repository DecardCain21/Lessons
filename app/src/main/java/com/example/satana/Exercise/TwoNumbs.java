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
        int Ostatok;
        int Ostatok2;
        List<Integer> numbList1 = new ArrayList<Integer>();
        List<Integer> numbList2 = new ArrayList<Integer>();
        int i=0;
        while (i<4) {
            i++;
            Ostatok = numb1 % 10;
            numb1 = numb1 / 10;
            numbList1.add(Ostatok);
            Ostatok2 = numb2 % 10;
            numb2 = numb2 / 10;
            numbList2.add(Ostatok2);
            numbList1.toArray();
            numbList2.toArray();
            System.out.println(numbList1);
            System.out.println(numbList2);
            Collections.sort(numbList1);
            Collections.sort(numbList2);
            if (Ostatok==Ostatok2) {
                System.out.println("Есть одинаковые цифры"+numbList1.equals(numbList2));
                break;
            }
            else{
                System.out.println("Нет одинаковых цифр");
            }
        }
    }
}

