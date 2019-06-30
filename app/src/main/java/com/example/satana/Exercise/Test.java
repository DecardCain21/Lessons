package com.example.satana.Exercise;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x;
        int reverse=0;
        int y;
        int z;
        System.out.println("Press ur number");
        x = scan.nextInt();
        while (x > 0) {
            y=reverse*10;
            reverse= x % 10;
            z=(reverse+y)*10;
            x = x / 10;
            System.out.println("Это чё:"+z );
        }
    }
}