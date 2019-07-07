package com.example.satana.Exercise;

import java.util.Scanner;

public class NumPolindrom {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int Chislo;
        int Ostatok = 0;
        int PredChislo = 0;
        int FinalNumb;
        System.out.println("Press ur number");
        Chislo = scan.nextInt();
        int FirstNumb = Chislo;
        while (Chislo > 0) {
            PredChislo = (PredChislo + Ostatok) * 10;
            Ostatok = Chislo % 10;
            Chislo = Chislo / 10;
            FinalNumb = (PredChislo + Ostatok);
            if (FinalNumb == FirstNumb) {
                System.out.println("This numb its polindrom:" + FinalNumb);
            }else {
                System.out.println("ne polindrom");
            }
        }
        scan.close();
    }

}

