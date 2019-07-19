package com.example.satana.Exercise;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class TenNumbBetterVersion {
    public static void main(String[] args) {
        int num;
        int[] deliteli = {2, 3, 5, 7, 11};
        Scanner scan = new Scanner(System.in);
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            System.out.println("введите число больше 10: ");
            num = scan.nextInt();
            for (int z : deliteli) {
                if (num % z == 0) {
                    ArrayList<Integer> tempList = map.get(z);
                    if (tempList == null) {
                        tempList = new ArrayList<>();
                    }
                    tempList.add(num);
                    map.put(z, tempList);
                }
            }
        }
        for (int i : map.keySet()) {
            System.out.println("числа делящиеся на: " + i + ":[" + map.get(i) + "]");
        }
    }
}
