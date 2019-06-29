package com.example.satana.Exercise;

import java.util.Scanner;

public class CycleRevers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x;
        int reverse;
        int z;
        int reverse2;
        int f=1;
        System.out.println("Press ur number");
        x = scan.nextInt();
        do {
            z = +10;
            reverse = x % z;
            System.out.println("Revers:"+reverse);
            x = x / 10;
            f=f*10;
            reverse2=reverse*f;
            System.out.println("Это чё:"+reverse2);
        }
        while (x > 0);
    }

}

