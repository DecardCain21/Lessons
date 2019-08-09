package com.example.satana.review1;

import java.util.HashMap;
import java.util.Scanner;

public class ValueOfStringEx5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int z = 0;
        HashMap<String, Integer> store = store2(scanner, z);
        for (String i : store.keySet()) {
            System.out.println("число: " + i + " введено колл во раз: " + store.get(i));
        }
        System.out.println("Bye bye");
    }

    private static HashMap<String,Integer> store2(Scanner scanner,int z) {
        HashMap<String, Integer> store2 = new HashMap<>();
        while (z < 10) {
            z++;
            System.out.println("Введите целое чилсло");
            String key = scanner.nextLine();
            Integer counter = store2.get(key);
            if (counter == null) {
                counter = 0;
            }
            counter++;
            store2.put(key, counter);
        }
        return store2;
    }
}
