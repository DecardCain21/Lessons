package com.example.satana.review1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MethodFunctionsA {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;
        System.out.println("Введите число:");
        n=scan.nextInt();
        ArrayList <Integer> finalmassiv;
        finalmassiv=method(n);
        System.out.println(finalmassiv);
        scan.close();
    }

    private static ArrayList<Integer> method(int n) {
        ArrayList<Integer>massiv=new ArrayList<>();
        for(int i=1;i<=n;i++){
            massiv.add(i);
        }
        return massiv;
    }
}
