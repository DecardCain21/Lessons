package com.example.satana.NewMassivi;

public class MaxSeries {
    public static void main(String[] args) {
        int [] array={10,0,4,5,6,7,8,91,3,5,7,9,11,1};
        int count=1;
        int count2=0;
        for(int i=0;i<array.length-1;i++) {
            if(count>count2){
                count2=count;
                System.out.println("Count2:"+count2);
            }
            if(array[i]<array[i+1]){
                count++;
                System.out.println(count);
            }
            else {
                    count=0;
            }

        }
        System.out.println("Максимальная последовательность:"+count2);
    }
}
