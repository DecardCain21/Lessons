package com.example.satana.review1;

import java.util.HashMap;
import java.util.Scanner;

public class ex1 {

    public static void main(String[] args) {
        HashMap<Integer, Integer> store = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        try {
            while (true) {
                System.out.println("Введите целое чилсло");
                int key = scanner.nextInt();
                Integer counter = store.get(key);
                if (counter == null) {
                    counter = 0;
                }
                counter++;
                store.put(key, counter);
            }
        } catch (Exception e) {
            scanner.close();
            for(Integer i : store.keySet()){
                System.out.println("число: " + i + " введено колл во раз: " + store.get(i));
            }
            System.out.println("Bye bye");
        }
    }
}
