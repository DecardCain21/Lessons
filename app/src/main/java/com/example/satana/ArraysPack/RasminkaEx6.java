package com.example.satana.ArraysPack;

import java.util.ArrayList;
import java.util.Scanner;

public class RasminkaEx6 {
    public static void main(String[] args) {
        ArrayList<Integer>massiv=new ArrayList<>();
        Scanner scan=new Scanner(System.in);
        int u, u1 = 1, u2 = 0;
        System.out.println("Введите кол-во рядов");
        int n=scan.nextInt();
        for (int i=0;i<n;i++) {
            u = u1 + u2;
            u1 = u2;
            u2 = u;
            if (u >= 100)
                break;
            massiv.add(u);
        }
        System.out.println(massiv);
    }
}

