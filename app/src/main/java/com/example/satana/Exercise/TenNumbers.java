package com.example.satana.Exercise;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class TenNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> masseleven = new ArrayList<Integer>();
        List<Integer> massseven = new ArrayList<Integer>();
        List<Integer> massfive = new ArrayList<Integer>();
        List<Integer> massthree = new ArrayList<Integer>();
        List<Integer> masstwo = new ArrayList<Integer>();
        int chislo;
        int i = 0;
        do {
            System.out.println("Press ur number");
            chislo = scan.nextInt();
            i++;
            if (chislo < 10) {
                System.out.println("Введите число chislo>=10");
            }
            if ((chislo % 2)==0) {
                int two=chislo;
                System.out.println("This numb multiple of two");
                masstwo.add(chislo);
                System.out.println (masstwo);
            }
            if ((chislo % 3) == 0) {
                int three= chislo;
                System.out.println("This numb multiple of three");
                massthree.add(chislo);
                System.out.println (massthree);
            }
            if ((chislo % 5) == 0) {
                int five=chislo;
                System.out.println("This numb multiple of five");
                massfive.add(chislo);
                System.out.println (massfive);
            }
            if ((chislo % 7) == 0) {
                int seven=chislo;
                System.out.println("This numb multiple of seven");
                massseven.add(chislo);
                System.out.println (massseven);
            }
            if ((chislo % 11) == 0) {
                int eleven=chislo;
                System.out.println("This numb multiple of eleven");
                masseleven.add(chislo);
                System.out.println (masseleven);
            }
            }
        while (i < 10) ;
        scan.close();
        }
    }
//        List<Integer> list = new ArrayList<Integer>();
//       System.out.println(Arrays.toString(arr));
//    System.out.println(list.get(0));





