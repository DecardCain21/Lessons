package com.example.satana.Exercise;

import com.example.satana.review1.FizzBuzzEx3;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import static java.lang.System.in;

public class Test {
    public static void main(String args[]) {
        String[] slovo = {"Clockwork"};
        char[] simvol1;
        char[] simvol2;
        simvol1 = new char[slovo[0].length()];
        simvol2 = new char[slovo[0].length()];
        HashMap<String, String> store = new HashMap<>();
        for (int i = 0; i <= slovo[0].length(); i++) {
            simvol1[0] = slovo[0].charAt(i);
            System.out.println(i);
            break;
        }
        for (int z = 0; z < slovo[0].length(); z++) {
            if(simvol2[z]<slovo[0].charAt(z)) {
                simvol2[z] = slovo[0].charAt(z);
                System.out.println(z);
            }

            char[] result = slovo[0].toCharArray();
            String key = String.valueOf(simvol1[0]);
            String counter = String.valueOf(simvol2[z]);
            store.put(key, counter);

        }
        for (String i : store.keySet()) {
            System.out.println("Ключ: " + i + " Значение " + store.get(i));
        }
    }
}



