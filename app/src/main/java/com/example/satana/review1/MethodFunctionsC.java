package com.example.satana.review1;

import java.util.ArrayList;
import java.util.Scanner;

public class MethodFunctionsC {
    public static void main(String[] args) {
        int [] finalmassiv = {1,2,3,3,4,5,6,7,8,9,10,11,12,13,14,15};
        ArrayList<Integer>finalmassivTwo=method(finalmassiv);
        System.out.println("Чётные числа массива"+finalmassivTwo);
    }



    private static ArrayList method(int[]finalmassiv){
        ArrayList<Integer>massivTwo=new ArrayList<>();
        for(int i=0;i<finalmassiv.length;i++){
            if(finalmassiv[i]%2==0){
                massivTwo.add(finalmassiv[i]);
            }
        }
        return massivTwo;
    }
}

