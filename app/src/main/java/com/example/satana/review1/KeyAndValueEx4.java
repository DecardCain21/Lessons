package com.example.satana.review1;

import java.util.HashMap;

public class KeyAndValueEx4 {
    public static void main(String[] args) {
        char[] simvol1;
        String[] slovo = {"Cyberpunk"};
        simvol1 = new char[slovo[0].length()];
        HashMap<String, String> store = new HashMap<>();
        for (int i = 0; i <= slovo[0].length(); i++) {
            simvol1[0] = slovo[0].charAt(i);
            System.out.println(i);
            break;
        }
        char[] result = slovo[0].toCharArray();
        String key = String.valueOf(simvol1[0]);
        String counter = String.valueOf(result);
        store.put(key, counter);

        for (String i : store.keySet()) {
            System.out.println("Ключ: " + i + " Значение " + store.get(i));
        }
    }
}