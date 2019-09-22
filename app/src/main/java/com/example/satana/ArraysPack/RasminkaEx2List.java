package com.example.satana.ArraysPack;

import java.util.ArrayList;
import java.util.Arrays;

public class RasminkaEx2List {
    public static void main(String[] args) {
        ArrayList <Integer>list=new ArrayList<>();
        for(int i=0;i<30;i++){

            list.add(i%2);//   1/2 или 1 или 0
        }
        System.out.println(list);
    }
}
