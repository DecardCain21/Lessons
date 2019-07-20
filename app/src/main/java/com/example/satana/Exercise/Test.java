package com.example.satana.Exercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char[] array = new char[5];
        array[0]='%';
        array[1]='/';
        array[2]='*';
        array[3]='+';
        array[4]='-';
        System.out.println("Введите 1-ое число:");
        int numb1 = scan.nextInt();
        System.out.println("Введите оператора:");
        char operator = scan.next().charAt(0);
        System.out.println("Введите 2-ое число:");
        int numb2 = scan.nextInt();
        if (array[0]== operator)
            System.out.println("Итого:"+(numb1%numb2));

        if(array[1]==operator)
            System.out.println("Итого:"+(numb1/numb2));

        if(array[2]==operator)
            System.out.println("Итого:"+(numb1*numb2));

        if(array[3]==operator)
            System.out.println("Итого:"+(numb1+numb2));
        if(array[4]==operator)
            System.out.println("Итого:"+(numb1-numb2));
    }
}

//        else if (gamenumber < numb - 7) {
//        System.out.println("Холодно1");
//        }
//        else if (gamenumber > numb + 7) {
//        System.out.println("Холодно");
//Math.floor Math.ceil
//Math.ceil(multiple = numb / i);
//            if (chislo < 10) {
//                System.out.println("Введите число chislo>=10");
//            }
//ОР System.out.println("Итого:"+numb1+numb2);