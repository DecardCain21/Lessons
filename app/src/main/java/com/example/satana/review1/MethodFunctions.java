package com.example.satana.review1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MethodFunctions {
    public static void main(String[] args) {
        int n=0;
        Scanner scan = new Scanner(System.in);
        ArrayList <Integer> finalmassiv=new ArrayList<>();
        finalmassiv=method(n,scan);
        System.out.println(finalmassiv);
        scan.close();
    }

    private static ArrayList<Integer> method(int n, Scanner scan) {
        ArrayList<Integer>massiv=new ArrayList<>();
        System.out.println("Введите число:");
        n=scan.nextInt();
        for(int i=0;i<=n;i++){
            massiv.add(i);
        }
        return massiv;
    }
}
