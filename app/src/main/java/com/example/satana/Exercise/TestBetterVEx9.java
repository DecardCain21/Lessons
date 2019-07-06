package com.example.satana.Exercise;

import java.util.Scanner;

public class TestBetterVEx9 {
    public static void main(String[] args) {

        {
            int sumNumbers = 0;
            int countNumbers = 0;
            int num;
            Scanner scan = new Scanner(System.in);
            try {
                while (true) {
                    System.out.print("EnterNum: ");
                   num = scan.nextInt();
                    sumNumbers += num;
                    countNumbers++;
                }
            } catch (Exception e){
            System.out.println("finish");
        } finally{
            System.out.println("avg:"+ sumNumbers/countNumbers);
            scan.close();
        }

        }
    }
}