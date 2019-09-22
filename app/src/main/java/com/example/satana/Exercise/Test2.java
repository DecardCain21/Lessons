package com.example.satana.Exercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        String[] slovo = {"Witcher","Cyberpunk","Gwent"};
        HashMap<String, String> store = store2(slovo);
        for (String i : store.keySet()) {
            System.out.println("Ключ: " + i + " Значение " + store.get(i));
        }
    }

    private static HashMap<String, String> store2(String[] slovo) {
        HashMap<String, String> store2 = new HashMap<>();
        char[] simvol;
        for (int i = 0; i < slovo.length;i++) {
            simvol = new char[slovo[i].length()];
            for (int z = 0; z < slovo[i].length(); z++) {
                if (simvol[z] < slovo[i].charAt(z)) {
                    simvol[z] = slovo[i].charAt(z);
                    System.out.println(simvol[z]);
                }
                String key = String.valueOf(simvol[0]);
                String counter = String.valueOf(simvol[z]);
                store2.put(key, counter);
            }
        }
        return store2;
    }
}
//Collections.sort(list1);
//Collections.sort(list2);
//System.out.println(list1.equals(list2));
////list1.containsAll(list2)
