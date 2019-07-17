package com.example.satana.Exercise;

import java.util.Random;
import java.util.Scanner;

public class GameColdOrHot {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int min = 0;
        int max = 200;
        Random rnd = new Random();
        int gamenumber = rnd.nextInt(max);
        System.out.println(gamenumber);
        int numb=0;
        do {
            System.out.println("Введите число");
            numb = scan.nextInt();
            if (Math.abs(gamenumber - numb) > Math.abs(7)) {
                System.out.println("Холодно");
            } else
                System.out.println("Горячо");

        }
        while(gamenumber!=numb);
        scan.close();
    }
}
//Одним if else сделать...