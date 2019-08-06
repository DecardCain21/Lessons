package com.example.satana.review1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import static java.lang.System.in;

public class exSummOfTwoNumbs {
        public static void main(String[] args) {
            Scanner scan = new Scanner(in);
            int chislo=enterNum(scan);
            int result=summ(scan,chislo);
            System.out.println(result);
            scan.close();
        }
        private static int enterNum(Scanner scan) {
            System.out.println("Введите число:");
            return scan.nextInt();
        }

        private static int summ(Scanner scan,int numb1) {
            List<Integer> massiv = new ArrayList<Integer>();
            int i = 0;
            int result;
            massiv.add(numb1);
            while (i < 2) {
                i++;;
                numb1=scan.nextInt();
                massiv.add(numb1);
            }
            result=massiv.get(0)+massiv.get(1);
            return result;
        }
    }

