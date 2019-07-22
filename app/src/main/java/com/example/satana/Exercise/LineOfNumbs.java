package com.example.satana.Exercise;

import java.util.Scanner;

public class LineOfNumbs {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int numb1;
        System.out.println("Введите первое число");
        numb1=scan.nextInt();
        int numb2;
        System.out.println("Введите второе число");
        numb2=scan.nextInt();
        if(numb1<numb2){
            System.out.println("Между введёными числами:");
            for(;numb1<=numb2;numb1++){
                System.out.print(numb1+" ");
            }
        }
        if (numb1 > numb2) {
            System.out.print("Между введёными числами:");
            for(;numb1>=numb2;numb1--){
                    System.out.print(numb1+" ");
            }
        }

    }
}

//впринципе норм, только что ты отпчатаешь если введешь 2 одинаковых числа?
//можно сдеать это с одним фором