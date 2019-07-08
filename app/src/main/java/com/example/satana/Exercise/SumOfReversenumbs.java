package com.example.satana.Exercise;

import java.util.Scanner;

public class SumOfReversenumbs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int Chislo;
        int Ostatok;
        int PredChislo = 0;
        int Reverse;
        System.out.println("Press ur number");
        Chislo = scan.nextInt();
        while (Chislo > 9) {
            Ostatok = Chislo % 10;
            Chislo = Chislo / 10;
            PredChislo = (PredChislo + Ostatok);
        }
        Reverse = (PredChislo + Chislo);
        System.out.println("ReversE is:" + Reverse);
        scan.close();
    }
}
