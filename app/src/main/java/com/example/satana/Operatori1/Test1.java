package com.example.satana.Operatori1;

public class Test1 {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        boolean s = a > b;
        s = true;
        System.out.print("It s true ");//Квадрат показывает сколько ошибок
        //серые это незадействованных переменных
        if (a < b) {
            System.out.println("A<B");

        } else if (a > b) {
            System.out.println("A>B");
        } else {
            System.out.println("Ravno");
        }
    }
    class MyString {
        public MyString() {
        }
    }
}
