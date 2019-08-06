package com.example.satana.review1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import static java.lang.System.in;

public class DifferenceOfNumbs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(in);
        List<Integer> numbList1 = new ArrayList<Integer>();
        List<Integer> numbList = numbList1;
        int chislo = enterNum(scan);
        int result = summ(scan, chislo);
        System.out.println(result);
    }

    private static int enterNum(Scanner scan) {
        System.out.println("Введите число:");
        return scan.nextInt();
    }

    private static int summ(Scanner scan, int numb) {
        List<Integer> numbList1 = new ArrayList<Integer>();
        int result=0;
        int i=0;
        numbList1.add(numb);
        while (i<4) {
            i++;
            numb = scan.nextInt();
            numbList1.add(numb);
            result = Collections.max(numbList1) - Collections.min(numbList1);
        }
        Collections.sort(numbList1);
        return result;
    }
}





