package com.example.satana.Exercise;

import java.util.Random;
import java.util.Scanner;

public class GameColdOrHot {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int max = 200;
        Random rnd = new Random();
        int gamenumber = rnd.nextInt(max);
        System.out.println(gamenumber);
        int numb = scan.nextInt();
        while(gamenumber!=numb){
            System.out.println("Введите число");
            if (Math.abs(gamenumber - numb) > Math.abs(7)) {
                System.out.println("Холодно");
            } else
                System.out.println("Горячо");
            numb = scan.nextInt();
        }
        scan.close();
    }
}
//Одним if else сделать...