package com.example.satana.AnotherArrays;

import android.renderscript.Sampler;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Duplicate {
    public static void main(String[] args) {
        Map<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
        Integer key;
        Integer counter;
        int[] array = {4, 10, 10, 4, 9, 2, 5, 7, 5};
        for (int i1 : array) {
            key = i1;
            counter = hashMap.get(key);
            if(counter==null){
                counter=0;
            }
            counter++;
            hashMap.put(key, counter);
        }
        for (Integer i : hashMap.keySet()) {
            System.out.println("Ключ|Число:" + i + "  Кол-во дубликатов: " + hashMap.get(i));
        }

    }
}
//сделать одним for
