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
        int z = 0;
        int f=0;
        for (int i = 0; i < groupone.size(); i++) {
            System.out.println("Оценки:"+groupone.get(z).assessments.size()+" Имя:"+groupone.get(z).getName());
            if (groupone.get(z).assessments.get(f) >=4) {
                f++;
                if(groupone.get(z).assessments.size()>=groupone.get(z).assessments.size()-1) {
                    listofBest.add(groupone.get(z));
                    System.out.println(groupone.get(z).assessments.size());
                    System.out.println(listofBest.get(z));
                    f = 0;
                    z++;
                }

            } else {
                System.out.println("На парушу этого  " + groupone.get(i).getName());
                z++;
            }
        }

        //System.out.println(analysisStudent(one, listone));
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

