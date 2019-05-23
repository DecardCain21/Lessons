package com.example.satana.Exercise;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numb1 = 0; //и тут
        System.out.print("Press number 2 : ");
        numb1 = scan.nextInt();
        int numb2;
        System.out.print("Press number 2 : ");
        numb2 = scan.nextInt();
        {//и вот опять 25 зачем блок
            System.out.println(numb1 / numb2);
//                Походу это задания вплодь до 5...первые три
//                нужно было делать проще чем подумал я
        }
    }
}


