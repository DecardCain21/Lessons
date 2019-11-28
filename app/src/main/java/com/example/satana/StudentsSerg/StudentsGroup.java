package com.example.satana.StudentsSerg;

import java.util.ArrayList;

public class StudentsGroup {
    private String groupname;
    private int studentgroupnum;
    private ArrayList<Student> groupofstudent;


        StudentsGroup (String name,int id){
        groupname=name;
        studentgroupnum=id;
        groupofstudent = new ArrayList<>();
    }

    public void setStudentgroup(Student student){
            groupofstudent.add(student);
    }

    public ArrayList<Student> getGroupofstudent() {
        return groupofstudent;
    }

    public String getGroupname() {
        return groupname;
    }



    public int getStudentgroupnum() {
        return studentgroupnum;
    }

    public void setStudentgroupnum(int studentgroupnum) {
        this.studentgroupnum = studentgroupnum;
    }

}
