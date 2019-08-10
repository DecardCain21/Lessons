package com.example.satana.review1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class ValueOfStringEx5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> key=new ArrayList<>();
        ArrayList pay=key;
        HashMap<String, Integer> store = store2(pay,scanner);
        for (String i : store.keySet()) {
            System.out.println("Символ: " + i + " введено колл во раз: " + store.get(i));
        }
        System.out.println("Bye bye");
    }

    private static HashMap<String,Integer> store2(ArrayList<String>key,Scanner scanner) {
        HashMap<String, Integer> store2 = new HashMap<>();
        int z = 0;
        while (z < 10) {
            z++;
            System.out.println("Введите символ:");
            String simvol=scanner.nextLine();
            Integer counter = store2.get(simvol);
            if (counter == null) {
                counter = 0;
            }
            counter++;
            store2.put(simvol, counter);
        }
        return store2;
    }
}
