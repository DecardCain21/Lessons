package com.example.satana.Exercise;

public class Ex10 {
    public static void main(String[] args) {
        //давай добавим сканер чтоб на бегу тестить разные результаты
        int x = 42357;
        int reverse;
        int z;
        do {
            z = +10;
            reverse = x % z;
            System.out.println(reverse);
            x = x / 10;
        }
        while (x > 0);
    }

}






