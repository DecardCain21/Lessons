package com.example.satana.Massivi;

public class Mass1 {
/*
    public static int min(String args[]){

        String[]mm = new String[10];
       mm[0] = "Carl";
       mm[2] = "Clara";
        {
            System.out.println(mm[0]);
        }
*/




    public static void main(String[] args) {
        boolean[] arr;
        arr = new boolean[10];
        arr[0] = true;
        String[] m = new String[10];
        m[0] = "Carl";
        m[2] = "Clara";
        {
            System.out.println(arr[9]);//дефолтное значение false
            System.out.print(arr[0]);
            System.out.println("\n"+m[0]); // \n пропуск строки,\r пропускает строку до этого(выше)
        }
    }
}



