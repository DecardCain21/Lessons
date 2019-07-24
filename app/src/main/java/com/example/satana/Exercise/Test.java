package com.example.satana.Exercise;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import static java.lang.System.in;

public class Test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(in);
        System.out.println("Введите число");
        int numb = scan.nextInt();
        try {
            for (int i=0; i < numb; i++) {
                int[][] massnumb = new int[i][];
                massnumb[i][numb]= scan.nextInt();
                numb = scan.nextInt();
                System.out.println(massnumb[i][numb]);
            }
        }
        catch (InputMismatchException e){
            System.out.println("Это фиаско");
        }
        finally {
            //System.out.println(massnumb[i][10]);
        }
    }
}
