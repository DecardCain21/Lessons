package com.example.satana.StudentsSerg;

import java.util.ArrayList;
import java.util.List;

public class StudentsGroup {
    private String university;
    private int studentgroupnum;


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
