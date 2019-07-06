package com.example.satana.Exercise;

import java.util.Scanner;

public class CycleRevers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x;
        int reverse=0;
        int y=0;
        int z;
        System.out.println("Press ur number");
        x = scan.nextInt();
        while (x > 0)
        {
            y=(y+reverse)*10;
            //System.out.println("Это чё:"+y);
            reverse= x % 10;
            x = x / 10;
            if(x<10){
                z=(y+reverse);
                System.out.println("Reverse is:"+z);
            }
        }
        scan.close();
    }
    //не забывай закрывать сканер иначе это утечка данных
    //привыкай с молоду как говориться
}


