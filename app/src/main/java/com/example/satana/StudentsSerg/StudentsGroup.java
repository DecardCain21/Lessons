package com.example.satana.StudentsSerg;

import java.util.ArrayList;
import java.util.List;

public class StudentsGroup {
    private String university;
    private int studentgroupnum;

    List<Integer> listtwo = new ArrayList<Integer>();

    Student one=new Student("Nikita",22,listtwo);
    private ArrayList<Student> groupofstudent;

    public ArrayList<Student> getGroupofstudent() {
        return groupofstudent;
    }

    public String getUniversity() {
        return university;
    }



    public int getStudentgroupnum() {
        return studentgroupnum;
    }

    public void setStudentgroupnum(int studentgroupnum) {
        this.studentgroupnum = studentgroupnum;
    }

    public StudentsGroup(String university){
        this.university=university;
    }

}
