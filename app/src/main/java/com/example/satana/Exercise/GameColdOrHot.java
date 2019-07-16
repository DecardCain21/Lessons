package com.example.satana.Exercise;

import java.util.Random;
import java.util.Scanner;

public class GameColdOrHot {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int min = 0;
        int max = 200;
        int diff = max - min;
        Random rnd = new Random();
        int gamenumber = rnd.nextInt(max);
        System.out.println(gamenumber);
        while (true) {
            System.out.println("Введите число");
            int numb = scan.nextInt();
            if (numb == gamenumber) {
                System.out.println("Вы угадали загадонное число");
            }
            else if (numb+7< gamenumber|| gamenumber < numb - 7) {
                System.out.println("Холодно1");
            }
            else if(gamenumber-numb<Math.abs(7)){
                System.out.println("Горячо");
            }

        }
    }
}