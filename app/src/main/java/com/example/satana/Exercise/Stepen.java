package com.example.satana.Exercise;

import java.util.Scanner;

public class Stepen {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int result=1;
        System.out.println("Введите число:");
        int numb=scan.nextInt();
        System.out.println("Введите степень");
        int stepen=scan.nextInt();
        for(int i=0;i<stepen;i++){
            result=result*numb;
            System.out.println(result);
        }

    }
}
