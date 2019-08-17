package com.example.satana.review1;

import java.util.ArrayList;
import java.util.Scanner;

public class MethodFunctionsC {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> finalmassiv = new ArrayList<>();
        finalmassiv = createmass(finalmassiv, scan);
        ArrayList<Integer>finalmassivTwo=method(finalmassiv);
        System.out.println("Чётные числа массива"+finalmassivTwo);
        scan.close();
    }

    private static ArrayList<Integer> createmass(ArrayList<Integer> massiv, Scanner scan) {
        int p=0;
        int n;
        while (p<10) {
            p++;
            System.out.println("Введите число:");
            n = scan.nextInt();
            massiv.add(n);
        }
        return massiv;
    }

    private static ArrayList<Integer> method(ArrayList<Integer>massiv){
        ArrayList<Integer>massivTwo=new ArrayList<>();
        for(int i=0;i<massiv.size();i++){
            System.out.println(i);
            if(massiv.get(i)%2==0){
                massivTwo.add(massiv.get(i));
            }
        }
        return massivTwo;
    }
}

