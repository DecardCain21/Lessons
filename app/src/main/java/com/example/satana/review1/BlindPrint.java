package com.example.satana.review1;

import java.util.Random;
import java.util.Scanner;

import static java.lang.System.in;

public class BlindPrint {
    public static void main(String[] args) {
        Scanner scan=new Scanner(in);
        String infoOne=info();
        System.out.println(infoOne);
        String a = "a";
        String b = "a";
        int min = 1;
        int max = 2;
        String rndS = "";
        String one = "ы";
        String two = "в";
        int diff = max - min;
        Random random = new Random();
        for (int z = 0; z <= 10; z++) {
            int i = random.nextInt(diff + 1);
            i += min;
            if (i == 2) {
                rndS += one;
            }
            if (i == 1) {
                rndS += two;
            }
        }
        System.out.println(rndS);
        System.out.println("Введите последовательность:");
        String uprint=scan.nextLine();
        System.out.println(rndS.equals(uprint));
    }
    private static String info(){
        String info="«Поставьте мизинец левой руки на букву Ф, безымянный палец — на Ы, средний — на В, указательный — на А. Мизинец правой руки на букву Ж,\nбезымянный палец — на Д, средний — на Л, указательный — на О. Запомните расположение пальцев. Повторяйте за мной:».";
        return info;
    }

}

