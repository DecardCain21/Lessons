package com.example.satana.review1;

import java.util.HashMap;
import java.util.Scanner;

public class ValueOfStringEx5 {
    public static void main(String[] args) {
        HashMap<String, Integer> store = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        int z = 0;
        while (z < 10) {
            z++;
            System.out.println("Введите целое чилсло");
            String key = scanner.nextLine();
            Integer counter = store.get(key);
            if (counter == null) {
                counter = 0;
            }
            counter++;
            store.put(key, counter);
        }
        scanner.close();
        for (String i : store.keySet()) {
            System.out.println("число: " + i + " введено колл во раз: " + store.get(i));
        }
        System.out.println("Bye bye");
    }
}
