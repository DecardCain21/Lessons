package com.example.satana.ArraysPack;

import java.util.ArrayList;
import java.util.Scanner;

public class RasminkaEx5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> massivTwo = new ArrayList();
        System.out.println("Введите число");
        int chislo = scan.nextInt();
        massivTwo.add(chislo);
        chislo=chislo-chislo%3;
        for (int i = chislo; i>=1; i--) {
            i=chislo;
            chislo = chislo-3;
            massivTwo.add(chislo);
            System.out.println(i);
        }
        scan.close();
        System.out.println(massivTwo);
    }
}
