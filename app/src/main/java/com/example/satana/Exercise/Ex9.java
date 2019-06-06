package com.example.satana.Exercise;

import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {

        //todo Марат добавочное задание к этому
       /* сделай так чтоб можно было вводить бесконечное колличевство цифр,
                но когда ты вводишь букву(что то что не цифра)
        он считает среднее всех введеных чисел*/
        Scanner scan = new Scanner(System.in);
        double numb1;
        System.out.print("Press number 1 : ");
        numb1 = scan.nextDouble();
        double numb2;
        System.out.print("Press number 2 : ");
        numb2 = scan.nextDouble();
        double numb3;
        System.out.print("Press number 3 : ");
        numb3 = scan.nextDouble();

        double summ = (numb1 + numb2 + numb3) / 3;
        System.out.println(summ);
    }
}
