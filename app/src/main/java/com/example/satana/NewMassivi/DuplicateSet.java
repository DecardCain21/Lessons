package com.example.satana.NewMassivi;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

public class DuplicateSet {
    public static void main(String[] args) {
        HashSet set=new HashSet();
        int[] array = {4, 10, 10, 4, 9, 2, 5, 7, 5};
        for (int i1 : array) {
            set.add(i1);
        }
        for (Integer integer : (Iterable<Integer>) set) {
            System.out.println(integer);
        }

    }
}