package com.example.satana.Exercise;

import java.util.Scanner;

public class Ex9 {
    //не закрыл сканер
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int s = 0;//что это?
        int countElements = 0;
        int numb2 = 0;
        int numb3 = 0;
        try {
            while (true) { // если хочешь сделать бесконечный цикл
                System.out.print("Enter number : ");
                int numb1;
                numb1 = scan.nextInt();
                numb2 += numb1;//зачем тебе num3
                //countElements++; оставить если отрицательное считать за введёное число
                if (numb1 != 0)//почему тебе не нравиться нуль?
                    numb3 = numb2;
                countElements++;
            }
        } catch (Exception e) {
            System.out.println("Нужно построить зиккурат");

        } finally {
            System.out.println(numb3 / countElements);
            scan.close();
        }
    }
}

//InputMismatchException
//todo Марат добавочное задание к этому
       /* сделай так чтоб можно было вводить бесконечное колличевство цифр,
                но когда ты вводишь букву(что то что не цифра)
        он считает среднее всех введеных чисел*/
