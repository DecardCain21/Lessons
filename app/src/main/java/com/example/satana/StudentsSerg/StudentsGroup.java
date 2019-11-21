package com.example.satana.StudentsSerg;

import java.util.ArrayList;
import java.util.List;

public class StudentsGroup {

    ArrayList<Integer>listone=new ArrayList<>();
    ArrayList<Integer>listtwo=new ArrayList<>();
    ArrayList<Integer>listthree=new ArrayList<>();

    Student one=new Student("Sanya",27,listone);
    Student two=new Student("Ivan",24,listtwo);
    Student three=new Student("Bob",22,listthree);



    public StudentsGroup(Student one,Student two,Student three){
    this.one=one;
    this.two=two;
    this.three=three;
    }

}
