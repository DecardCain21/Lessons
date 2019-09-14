package com.example.satana.AnotherArrays;

import java.util.ArrayList;

public class SummOfElements {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        int[] array = {1, 2, 3, 4, 5, 1, 7, 8, 2, 6, 3, 8, 10, 0};
        for (int i = 0; i < array.length; i++) {
            if (i >= array.length - 1) {
                break;
            }
            if (array[i] == array[i + 1] - 1 || array[i] == array[i - 1] + 1) {
                list.add(array[i]);
                System.out.println("Последовательное число:" + array[i]);
            }
        }
        int max = Integer.MIN_VALUE;
        for (int z=0;z<list.size();z++) {
            if (z > list.size()+2) {
                break;
            }
            if (max>list.get(z) + list.get(z + 1) + list.get(z+2)) {
                max = list.get(z) + list.get(z + 1) + list.get(z + 2);
            }
        }
        System.out.println("Максимальная последовательность" + max);
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