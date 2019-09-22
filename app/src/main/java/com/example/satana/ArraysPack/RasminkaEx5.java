package com.example.satana.ArraysPack;

import java.util.ArrayList;
import java.util.Scanner;

public class RasminkaEx5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> massivTwo = new ArrayList();
        System.out.println("Введите число");
        int chislo = scan.nextInt();
        chislo=chislo-chislo%3;
        massivTwo.add(chislo);
        for (int i =0;i<10; i++) {
            chislo = chislo-3;
            massivTwo.add(chislo);
            System.out.println(i);
        }
        scan.close();
        System.out.println(massivTwo);
    }
}
//Перелелать,включая отрицательные
