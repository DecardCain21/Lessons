package com.example.satana.Exercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MaxMultipleOfNumb {
    public static void main(String[] args) {
        List<Integer> massone = new ArrayList<Integer>();
        List<Integer> masstwo = new ArrayList<Integer>();
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число");
        int numberone = scan.nextInt();
        System.out.println("Введите второе число");
        int numbertwo = scan.nextInt();
        int z = 1;
        int multipleone=0;
        int multipletwo=0;
        int maxmultiple;
        while (z <= 10) {
            multipleone = numberone * z;
            multipletwo = numbertwo * z;
            massone.add(multipleone);
            masstwo.add(multipletwo);
            z++;

        }
        if (multipleone==multipletwo) {
            System.out.println("Maxmultiple of two numbs:"+ Collections.max(massone));
        }
        else{
            System.out.println("Что-то пошло не так");
        }

    }
}






