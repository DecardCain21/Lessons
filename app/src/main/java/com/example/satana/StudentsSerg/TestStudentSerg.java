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

        List<Integer> listthree = new ArrayList<Integer>();
        listthree.add(2);
        listthree.add(5);
        listthree.add(4);
        Student three = new Student("Glen", 23, listthree);

        List<Integer> listfour = new ArrayList<Integer>();
        listfour.add(4);
        listfour.add(5);
        listfour.add(4);
        Student four = new Student("Bob", 20, listfour);

        ArrayList<Student> groupone = new ArrayList<Student>();
        groupone.add(one);
        groupone.add(two);
        groupone.add(three);
        groupone.add(four);

        StudentsGroup studentsGroup = new StudentsGroup("risovanieGroup", 1234123);
        studentsGroup.setStudentgroup(one);

        ArrayList<Student> listofBest = new ArrayList<>();
        ArrayList<Student> listofBad = new ArrayList<>();
        int i;
        for (int j = 0; j < groupone.size(); j++) {
             i=0;
            for (; i < groupone.get(j).assessments.size(); i++) {
                if (groupone.get(j).assessments.get(i) >= 4) {
                    System.out.println("next "+i);
                    if(i>=groupone.get(j).assessments.size()-1) {
                        System.out.println("Оценки:" + groupone.get(j).assessments.size() + " Имя:" + groupone.get(j).getName());
                        listofBest.add(groupone.get(j));
                        System.out.println(listofBest.size());
                    }
                }
                else {
                    System.out.println("На парушу этого  " + groupone.get(j).getName());
                    listofBad.add(groupone.get(j));
                    break;
                }
            }
            System.out.println("Отличники:"+listofBest.size()+"\nВ жертву:"+listofBad.size());
        }
    }
}

//    public static ArrayList<Student> analysisStudent(ArrayList<Student> groupone) {
//        ArrayList<Student> listofBest=new ArrayList<>();
//        for (int i = 0; i < groupone.size(); i++) {
//            if(groupone.get(i).assessments.get(i)<4){
//                listofBest.add(groupone.get(i));
//                System.out.println(listofBest.get(i));
//            }
//            else{
//                System.out.println("На парушу этого  "+groupone.get(i).getName());
//            }
//        }
//
//        return listofBest;
//    }

