package com.example.satana.review1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import static java.lang.System.in;

public class exSummOfTwoNumbs {
        public static void main(String[] args) {
            int[] massiv={4,6,1,3,4};
            int result=summ(massiv);
            System.out.println(result);
        }

        private static int summ(int[] massiv) {
            int result=10;
            if(massiv.length<2){
                result=massiv[0];
                return result;
            }
            if(massiv.length>2){
                result=massiv[0]+massiv[1];
                return result;
            }
            return result;
        }
    }

