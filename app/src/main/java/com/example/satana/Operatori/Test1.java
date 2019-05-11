package com.example.satana.Operatori;

public class Test1 {
    private static int num;
    private static boolean N;

    public static void main(String[] args) {

        String s1 = "GG";
        String s2 = new String("WP"); //original - это подсказка
        //redundant нигде не используется больше
        System.out.println("num is: " + num + " n is: " + N);
        if (num >= 5)
            System.out.println("Do?");
        {
            System.out.println(s1 + s2);
            System.out.println(s1 + N + s2);
        }
    }
}
