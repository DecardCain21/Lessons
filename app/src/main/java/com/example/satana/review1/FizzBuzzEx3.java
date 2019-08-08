package com.example.satana.review1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FizzBuzzEx3 {
    public static void main(String[] args) {
        int min = 0;
        int max = 15;
        List<String>FizzBuzz=new ArrayList<>();
        for (int i = min; i <= max; i++) {
            String z=String.valueOf(i);
            if(i%3==0&&i%5==0){
                FizzBuzz.add("FizzBuzz");
                continue;
            }
            if (i % 3 == 0) {
                FizzBuzz.add("Fizz");
                continue;
            }
            if (i%5==0){
                FizzBuzz.add("Buzz");
                continue;
            }
            FizzBuzz.add(z);
        }
        System.out.println(FizzBuzz);

    }
}
