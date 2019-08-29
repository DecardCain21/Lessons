package com.example.satana.ArraysPack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class RasminkaEx4Mass {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int[]array=new int[10];
        System.out.println("Введите число");
        int chislo=scan.nextInt();
        System.out.println("Введите разность");
        int difference=scan.nextInt();
        int raznost=0;
        for (int i=0;i<array.length; i++) {//i=chislo нахер?;
            array[i]=chislo+raznost;
            raznost+=difference;
        }
        scan.close();
        System.out.println(Arrays.toString(array));
    }
}
