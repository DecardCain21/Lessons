package com.example.satana.Exercise;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        char[] timestamp = new char[40];
        String []name={"Cyberpunk"};

        timestamp = new char[name[0].length()];
        for(int i=0; i<name[0].length();)
        {
            timestamp[0] = name[0].charAt(i);
            System.out.println(i);
            break;
        }
        System.out.println(timestamp);
    }
}
//    String testString = {"Cyberpunk"};
//    char myChar = testString[0].charAt(2);
//        System.out.println(myChar);
