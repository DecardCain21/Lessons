package com.example.satana.NewMassivi;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;

public class PrintMap {
    public static void main(String[] args) {
        String[] russian = {"q", "w", "e", "r", "t", "y", "u", "i", "o", "p", "[", "]", "a", "s", "d", "f", "g", "h", "j", "k", "l", ";", "'", "z", "x", "c", "v", "b", "n", "m", ",", "."};
        String[] latin = {"й", "ц", "у", "к", "е", "н", "г", "ш", "щ", "з", "х", "ъ", "ф", "ы", "в", "а", "п", "р", "о", "л", "д", "ж", "э", "я", "ч", "с", "м", "и", "т", "ь", "б", "ю"};
        Map<String, String> hashMap = new HashMap<>();
        StringBuilder result = new StringBuilder();
        String key;
        String counter;
        String slovo = "Ujhяf";
        for (int i = 0; i < russian.length; i++) {
            key = russian[i];
            counter = latin[i];
            hashMap.put(key, counter);
        }
        for (int z = 0; z < slovo.length(); z++) {
            char c = slovo.charAt(z);
            String s = String.valueOf(c).toLowerCase();
            if (!hashMap.containsKey(s)) {
                result.append(s);
            } else if (Character.isUpperCase(c)) {
                result.append(hashMap.get(s).toUpperCase());
            } else {
                result.append(hashMap.get(s));
            }
            for (String i : hashMap.keySet()) {
                System.out.println(result);
            }
        }
    }
}
//    String[] russian = {"q", "w", "e", "r", "t", "y", "u", "i", "o", "p", "[", "]", "a", "s", "d", "f", "g", "h", "j", "k", "l", ";", "'", "z", "x", "c", "v", "b", "n", "m", ",", "."};
//    String[] latin = {"й", "ц", "у", "к", "е", "н", "г", "ш", "щ", "з", "х", "ъ", "ф", "ы", "в", "а", "п", "р", "о", "л", "д", "ж", "э", "я", "ч", "с", "м", "и", "т", "ь", "б", "ю"};
//    Map<String, String> hashMap = new HashMap<>();
//    StringBuilder result = new StringBuilder();
//    String key;
//    String counter;
//    String slovo = "ujhrf";
//        for (int i = 0; i < russian.length; i++) {
//        key = russian[i];
//        counter = latin[i];
//        hashMap.put(key, counter);
//        }
//        for (int z = 0; z < slovo.length(); z++) {
//        char c = slovo.charAt(z);
//        String s = String.valueOf(c).toLowerCase();
//        hashMap.containsKey(s);
//        result.append(hashMap.get(s));
//        }
//        for(String i:hashMap.keySet()){
//        System.out.println(result);
//        }
//        }
//        }

