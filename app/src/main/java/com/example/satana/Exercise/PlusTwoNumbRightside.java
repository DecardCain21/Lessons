package com.example.satana.Exercise;

import java.util.Scanner;

public class PlusTwoNumbRightside {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int Chislo;
        int Ostatok = 0;
        int i = 0;
        System.out.println("Press ur number");
        Chislo = scan.nextInt();
        while (i < 2) {
            Ostatok = Chislo % 10;
            Chislo = Chislo / 10;
            i++;
            scan.close();
        }
        System.out.println("Two numb on the right side:" + Ostatok );
    }
}
//System.out.print(Reverse)
