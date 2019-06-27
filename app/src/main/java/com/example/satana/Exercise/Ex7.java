package com.example.satana.Exercise;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {

        //todo Марат не обязательно надо было так делать, тут было задание просто выразить это мат выражение в программном коде
        // но так тоже норм
        //доп задание к этому коду, почитать try catch и добавить сюда проверку валидности ввода цифр, если чтоб не падал если ввел букву
        Scanner scan = new Scanner(System.in);
        {
            try {
                double numb1;
                System.out.print("Press number 1 : ");
                numb1 = scan.nextDouble();

                double numb2;
                System.out.print("Press number 2 : ");
                numb2 = scan.nextDouble();

                double numb3;
                System.out.print("Press number 3 : ");
                numb3 = scan.nextDouble();

                double numb4;
                System.out.print("Press number 4 : ");
                numb4 = scan.nextDouble();

                double numb5;
                System.out.print("Press number 5 : ");
                numb5 = scan.nextDouble();

                double numb6;
                System.out.print("Press number 6 : ");
                numb6 = scan.nextDouble();

                System.out.println((numb1 * numb2 - numb3 * numb4) / (numb5 - numb6));
            } catch (InputMismatchException errorZ) {
                System.out.println("Введена буква или знак");

            } catch (Exception anyError) {
                System.out.println("Нельзя сотворить здесь");

            }
        }
    }
}







//((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5))