package com.example.satana.StudentsSerg;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private StudentsGroup studentsGroup;
    String name;
    int age;
    List<Integer> assessments;

    public Student(String name,int age,List <Integer> assessments){
        this.name=name;
        this.age=age;
        this.assessments=assessments;
    }
//добавить переменную в конструктор,и возвращать значение хорошист/говношист

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<Integer> getAssessments() {
        return assessments;
    }

    public void setAssessments(List<Integer> assessments) {
        this.assessments = assessments;
    }
}
