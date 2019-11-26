package com.example.satana.StudentsSerg;

import java.util.ArrayList;
import java.util.List;

public class TestStudentSerg {
    public static void main(String[] args) {


        List<Integer> listone = new ArrayList<Integer>();
        listone.add(2);
        listone.add(5);
        listone.add(4);
        Student one=new Student("Ivan",24,listone);

        List<Integer> listtwo = new ArrayList<Integer>();
        listtwo.add(2);
        listtwo.add(5);
        listtwo.add(4);
        Student two=new Student("Alexander",24,listtwo);

        StudentsGroup group1616=new StudentsGroup("NNGY");
        group1616.setStudentgroupnum(1616);

//        ArrayList<Student> groupOne=new ArrayList<>();
//        groupOne.add(one);
//        groupOne.add(two);



        System.out.println("Студент:"+one.getName()+"\nГруппа:"+group1616.getStudentgroupnum()+"\nУниверситет:"+group1616.getUniversity());


    }
}
