package com.example.satana.Exercise;

import java.util.Scanner;

public class ThreeNumbsRounding {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите 1-ое число:");
        int numb1 = scan.nextInt();
        System.out.println("Введите 2-ое число:");
        int numb2 = scan.nextInt();
        System.out.println("Введите 3-е число:");
        int numb3=scan.nextInt();
        double Ostatok;
        double summ=numb1+numb2+numb3;
        System.out.println(summ);
            Ostatok=summ%10;
            if(Ostatok>5){
                summ=summ/10;
                summ=Math.round (summ);
                System.out.println("Округлённое число:"+(summ*10));
            }
            if(Ostatok<5){
                summ=summ/10;
                summ=Math.round(summ);
                System.out.println("Округлённое число:"+(summ*10));
            }
        scan.close();
        }
    }
