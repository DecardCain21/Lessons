package com.example.satana.StudentsSerg;

import java.util.ArrayList;
import java.util.List;

public class TestStudentSerg {
    public static void main(String[] args) {


        List<Integer> listone = new ArrayList<Integer>();
        listone.add(4);
        listone.add(5);
        listone.add(4);
        Student one = new Student("Ivan", 24, listone);

        List<Integer> listtwo = new ArrayList<Integer>();
        listtwo.add(2);
        listtwo.add(5);
        listtwo.add(4);
        Student two = new Student("Alexander", 24, listtwo);

        StudentsGroup studentsGroup = new StudentsGroup("risovanieGroup", 1234123);
        studentsGroup.setStudentgroup(one);

        System.out.println(analysisStudent(one,listone));
    }
    public static Student analysisStudent(Student one,List<Integer> listone) {
        for (int i = 0; i < listone.size(); i++) {
            if (listone.get(i) < 4) {
                System.out.println("На парашу его");
                break;
            } else {
                System.out.println(listone.get(i));
            }

        }
        return one;
    }
}
//    System.out.println("Студент:"+one.getName()+"\nГруппа:"+group1616.getStudentgroupnum()+"\nУниверситет:"+group1616.getGroupname());

