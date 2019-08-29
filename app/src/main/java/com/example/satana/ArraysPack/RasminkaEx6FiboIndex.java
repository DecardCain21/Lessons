package com.example.satana.ArraysPack;

import java.util.ArrayList;
import java.util.Scanner;

public class RasminkaEx6FiboIndex {
    public static void main(String[] args) {
        ArrayList<Integer> massiv=new ArrayList<>();
        Scanner scan=new Scanner(System.in);
        System.out.println("Введите кол-во рядов");
        int n=scan.nextInt();
        for (int i=0;i<n;i++) {
            System.out.println(massiv.size());
            if(massiv.size()>2) {
                massiv.add(massiv.get(i) + massiv.get(i + 1));
            }
            else{
                massiv.add(0);
                massiv.add(1);
            }
        }
        System.out.println(massiv);
    }
}
