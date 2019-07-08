package com.example.satana.Exercise;

import java.util.Scanner;

public class ExSotki {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int Chislo;
        int Ostatok = 0;
        int i = 0;
        System.out.println("Press ur number");
        Chislo = scan.nextInt();
        while (i < 3) {
            Ostatok = Chislo % 10;
            Chislo = Chislo / 10;
            i++;
        }
        System.out.println("This is hundreds: " + Ostatok );
        scan.close();
    }
}
