package com.example.satana.review1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FizzBuzzEx3 {
    public static void main(String[] args) {
        int min = 0;
        int max = 15;
        String [] massiv = new String [max];
        List<String>FizzBuzz=new ArrayList<>();
        for (int i = min; i <= max; i++) {
            Integer.toString (i);
            FizzBuzz.add(i);
            if (i % 3 == 0) {
                System.out.println("Fizz");
            }
            if (i%5==0){
                System.out.println("Buzz");
            }
            if(i%3==0&&i%5==0){
                System.out.println("FizzBuzz");
            }
        }
        System.out.println(massiv);
    }
}
