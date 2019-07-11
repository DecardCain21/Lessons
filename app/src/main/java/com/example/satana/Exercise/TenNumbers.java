package com.example.satana.Exercise;

import java.util.Scanner;
import java.util.ArrayList;

public class TenNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        int two = 0;
        int three = 0;
        int five = 0;
        int seven = 0;
        int eleven = 0;
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
                chislo = two;
                System.out.println("This numb multiple of two");
                numbers.add(0);
            }
            if ((chislo % 3) == 0) {
                chislo = three;
                System.out.println("This numb multiple of three");
                numbers.add(1);
            }
            if ((chislo % 5) == 0) {
                chislo = five;
                System.out.println("This numb multiple of five");
                numbers.add(2);
            }
            if ((chislo % 7) == 0) {
                chislo = seven;
                System.out.println("This numb multiple of seven");
                numbers.add(3);
            }
            if ((chislo % 11) == 0) {
                chislo = eleven;
                System.out.println("This numb multiple of eleven");
                numbers.add(4);
            }
            }
        while (i < 10) ;
        scan.close();
        }
    }
//        int [] arr={two,three,five,seven,eleven};
//       System.out.println(Arrays.toString(arr));
//    System.out.println(list.get(0));





