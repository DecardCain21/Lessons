package com.example.satana.Exercise;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class TenNumbers {
    public static void main(String[] args) {/*
        Scanner scan = new Scanner(System.in);
        List<Integer> masseleven = new ArrayList<Integer>();
        List<Integer> massseven = new ArrayList<Integer>();
        List<Integer> massfive = new ArrayList<Integer>();
        List<Integer> massthree = new ArrayList<Integer>();
        List<Integer> masstwo = new ArrayList<Integer>();*/
   /*     int chislo;
        int i = 0;
        do {
            System.out.println("Press ur number");
            chislo = scan.nextInt();
            i++;
            if (chislo < 10) {
                System.out.println("Введите число chislo>=10");
            }
            if ((chislo % 2) == 0) {
                int two = chislo;
                masstwo.add(chislo);
            }
            if ((chislo % 3) == 0) {
                int three = chislo;
                massthree.add(chislo);
            }
            if ((chislo % 5) == 0) {
                int five = chislo;
                massfive.add(chislo);
            }
            if ((chislo % 7) == 0) {
                int seven = chislo;
                massseven.add(chislo);
            }
            if ((chislo % 11) == 0) {
                int eleven = chislo;
                masseleven.add(chislo);
            }
        }
        while (i < 10);
        System.out.println("Числа делённые на 2:"+masstwo+"\nЧисла делённые на 3:"+massthree+"\nЧисла делённые на 5:"+massfive+"\nЧисла делённые на 7:"+massseven+"\nЧисла делённые на 11:"+masseleven);
        scan.close();
    }*/

        fun();
    }

    private static void fun() {
        int num;
        int[] deliteli = {2, 3, 5, 7, 11};
        Scanner scan = new Scanner(System.in);
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            System.out.println("введите число больше 10: ");
            num = scan.nextInt();
            for (int z : deliteli) {
                if (num % z == 0) {
                    ArrayList<Integer> tempList = map.get(z);
                    if (tempList == null) {
                        tempList = new ArrayList<>();
                    }
                    tempList.add(num);
                    map.put(z, tempList);
                }
            }
        }
        for (int i : map.keySet()) {
            System.out.println("числа делящиеся на: " + i + ":[" + map.get(i) + "]");
        }
    }
}


//С оператором switch...




