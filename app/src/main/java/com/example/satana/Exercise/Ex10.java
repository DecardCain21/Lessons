package com.example.satana.Exercise;

public class Ex10 {
    public static void main(String[] args) {
        //давай добавим сканер чтоб на бегу тестить разные результаты
        int Chislo = 42357;
        int Ostatok;
        do {
            Ostatok = Chislo % 10;
            System.out.print(Ostatok);
            Chislo = Chislo / 10;
        }
        while (Chislo > 0);
    }
}
//+





