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
    }
}



//        List<Integer> list = new ArrayList<Integer>();
//       System.out.println(Arrays.toString(arr));
//    System.out.println(list.get(0));


//С оператором switch...




