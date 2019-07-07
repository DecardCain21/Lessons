package com.example.satana.Exercise;

import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int countElements = 0;
        int numb2 = 0;
        int numb1;
        try {
            while (true) { // если хочешь сделать бесконечный цикл
                System.out.print("Enter number: ");
                numb1 = scan.nextInt();
                numb2 += numb1;
                countElements++;
            }
        } catch (Exception e) {
            System.out.println("Нужно построить зиккурат");
        } finally {
            System.out.println(numb2 / countElements);
            scan.close();
        }
    }
}
    //+-
//InputMismatchException
//todo Марат добавочное задание к этому
       /* сделай так чтоб можно было вводить бесконечное колличевство цифр,
                но когда ты вводишь букву(что то что не цифра)
        он считает среднее всех введеных чисел*/
