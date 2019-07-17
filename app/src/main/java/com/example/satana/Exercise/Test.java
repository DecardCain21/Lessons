package com.example.satana.Exercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> masseleven = new ArrayList<Integer>();
        List<Integer> massseven = new ArrayList<Integer>();
        List<Integer> massfive = new ArrayList<Integer>();
        List<Integer> massthree = new ArrayList<Integer>();
        List<Integer> masstwo = new ArrayList<Integer>();
        int i = 0;
        int z;
        do {
            System.out.println("Press ur number");
            int chislo = scan.nextInt();
            i++;
            switch (chislo){
                case 2:
                    i++;
                int two = chislo;
                masstwo.add(chislo);
                case 3:
                    i++;
                int three = chislo;
                massthree.add(three);
                case 5:
                    i++;
                int five = chislo;
                massfive.add(five);
                case 7:
                    i++;
                int seven = chislo;
                massseven.add(seven);
                case 11:
                    i++;
                int eleven = chislo;
                masseleven.add(eleven);
                System.out.println(masseleven);
            }
        }
        while (i < 10);
        System.out.println("Числа делённые на 2:"+masstwo+"\nЧисла делённые на 3:"+massthree+"\nЧисла делённые на 5:"+massfive+"\nЧисла делённые на 7:"+massseven+"\nЧисла делённые на 11:"+masseleven);
    }
}



//        else if (gamenumber < numb - 7) {
//        System.out.println("Холодно1");
//        }
//        else if (gamenumber > numb + 7) {
//        System.out.println("Холодно");
//Math.floor Math.ceil
//Math.ceil(multiple = numb / i);
//            if (chislo < 10) {
//                System.out.println("Введите число chislo>=10");
//            }