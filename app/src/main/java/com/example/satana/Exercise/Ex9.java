package com.example.satana.Exercise;

import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int s = 0;
        int numbers = 0;
        int numb2 = 0;
        int numb3 = 0;
        while (s != 99) {
            System.out.print("Press number : ");
            int numb1;
            numb1 = scan.nextInt();
            numb2 += numb1;
           //numbers++; оставить если отрицательное считать за введёное число
            if (numb1 > 0) {
                numb3 = numb2;
                numbers++;
            } else {
                System.out.println(numb3 / numbers);
                break;
            }
        }
    }
}

//todo Марат добавочное задание к этому
       /* сделай так чтоб можно было вводить бесконечное колличевство цифр,
                но когда ты вводишь букву(что то что не цифра)
        он считает среднее всех введеных чисел*/
