package com.example.satana.Exercise;

import java.util.Scanner;

public class CycleRevers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x;
        int reverse;
        int z;
        System.out.println("Press ur number");
        x = scan.nextInt();
        do {
            z = +10;
            reverse = x % z;
            System.out.println("Revers:"+reverse);
            x = x / 10;
        }
        while (x > 0);
    }

}

