package com.example.satana.AnotherArrays;

import java.util.ArrayList;

public class SummOfElements {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        int summ = Integer.MIN_VALUE;
        int[] array = {1,2,3,5,6,5,7,8,7};
        for (int i = 0; i < array.length-2; i++) {
            if(array[i]==array[i+1]-Math.abs(1)&&array[i]==array[i+2]-Math.abs(2)){
                int i1=array[i]+array[i+1]+array[i+2];
                System.out.println(i1=array[i]+array[i+1]+array[i+2]);
                if(i1>summ)
                summ=i1;

            }
            else {
                System.out.println("Массив не удовлетворяет параметрам");
            }
        }
        System.out.println("Максимальная последовательность"+summ);
    }
}
//три последовательных элемнта в смысле 1,2,3...9,10,11...сделать без сортировки
// int summ=Integer.MIN_VALUE;
//        int[]array={1,2,9,4,20,1,7,8,2,10};
//        for(int i=0;i<array.length-2;i++){
//            int i1 = array[i] + array[i + 1] + array[i + 2];
//            if(i1 >summ){
//                summ= i1;
//            }
//        }
//    }
//}