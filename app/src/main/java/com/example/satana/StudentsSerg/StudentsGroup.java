package com.example.satana.StudentsSerg;

import java.util.ArrayList;
import java.util.List;

public class StudentsGroup {
    public static void main(String[] args) {
        StudentsGroup group1=new StudentsGroup();


        List <Integer> listone = new ArrayList<Integer>();
        listone.add(2);
        listone.add(5);
        listone.add(4);

        Student one = new Student("Ivan",24,listone);


        System.out.println("Имя студента:"+one.getName()+"\nВозраст:"+one.getAge()+"\nУспеваемость:"+one.getAssessments());
    }
}
