package com.example.satana.ArraysPack;

import java.util.ArrayList;
import java.util.Scanner;

public class RasminkaEx4 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        ArrayList<Integer> massivTwo=new ArrayList();
        System.out.println("Введите число");
        int chislo=scan.nextInt();
        System.out.println("Введите разность");
        int difference=scan.nextInt();
        massivTwo.add(chislo);
        for (int i = chislo; chislo>0; i++) {
            chislo = chislo*difference;
            massivTwo.add(chislo);
        }
        scan.close();
        System.out.println(massivTwo);
    }
}
