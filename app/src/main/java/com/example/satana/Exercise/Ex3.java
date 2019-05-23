package com.example.satana.Exercise;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numb1;
        System.out.print("Press number 1 : ");
        numb1 = scan.nextInt();
        int numb2;
        System.out.print("Press number 2 : ");
        numb2 = scan.nextInt();
        int Result = numb1/numb2;
            System.out.println(Result);
    }
}


