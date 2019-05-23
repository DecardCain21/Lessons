package com.example.satana.Exercise;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numb1;//не обязательно обнулять примитив, компилятор по дефолту и так даст ему нуль
        System.out.print("Press number 1 : ");
        numb1 = scan.nextInt();
        int numb2;
        System.out.print("Press number 2 : ");
        numb2 = scan.nextInt();
        System.out.println(numb1 + numb2); //зачем ты написал эту строчку в блоке ? тут нет смысла
    }
}
