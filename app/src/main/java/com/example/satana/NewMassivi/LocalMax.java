package com.example.satana.NewMassivi;

public class LocalMax {
    public static void main(String[] args) {
        int[] array = {101, 100, 1, 99, 2, 4, 5, 1, 10, 2, 100, 1111};
        int count = getLocalMaximumCount(array);
        System.out.println("Кол-во локальных максимумов:" + count);
    }


    public static int getLocalMaximumCount(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (i == 0) {
                if (array[i] > array[i + 1]) {
                    count++;
                    System.out.println("array[i]:" + array[i]+"count:"+count);
                }
            }else if (i == array.length-1) {
                    if (array[i] > array.length - 1) {
                        count++;
                        System.out.println("array[i]:" + array[i]+"count:"+count);
                    }
                }
            else {
                if (array[i] > array[i - 1] && array[i] > array[i + 1]) {
                    count++;
                    System.out.println("test:" + array[i]);
                }
            }
        }
        return count;
    }
}

//    public static void showLocalMaximumCounts(int[] array) {
//        int count = 0;
//        for (int i = 0; i < array.length; i++) {
//            if (i == 0) {
//                if (array[i] > array[i + 1]) {
//                    count++;
//                    System.out.println("test:" + array[i]);
//                }
//            } else if (i == array.length - 1) {
//                if (array[i] > array[i - 1]) {
//                    count++;
//                    System.out.println("test:" + array[i]);
//                }
//            } else {
//                if (array[i] > array[i + 1] && array[i] > array[i - 1]) {
//                    count++;
//                    System.out.println("test:" + array[i]);
//                }
//            }
//        }
//        System.out.println("Кол-во локальных максимумов" + count);
//    }
