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

        ArrayList<Student> groupone = new ArrayList <Student>();
        groupone.add(one);
        groupone.add(two);

        StudentsGroup studentsGroup = new StudentsGroup("risovanieGroup", 1234123);
        studentsGroup.setStudentgroup(one);

        //System.out.println(analysisStudent(one, listone));
    }

    public static ArrayList<Student> analysisStudent(ArrayList<Student> groupone) {
        ArrayList<Student> listofBest=new ArrayList<>();
        for (int i = 0; i < groupone.size(); i++) {
            if(groupone.get(i).assessments.get(i)<4){
                listofBest.add(groupone.get(i));
                System.out.println(listofBest.get(i));
            }
            else{
                System.out.println("На парушу этого  "+groupone.get(i).getName());
            }
        }

        return listofBest;
    }
}
//        for (int i = 0; i < listone.size(); i++) {
//            if (listone.get(i) < 4) {
//                System.out.println("На парашу его");
//                break;
//            } else {
//                System.out.println(listone.get(i));
//            }
//
//        }


