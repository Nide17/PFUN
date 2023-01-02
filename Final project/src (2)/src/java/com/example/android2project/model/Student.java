package com.example.android2project.model;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "students")
public class Student {

    @PrimaryKey
    private int student_id;
    @ColumnInfo(name = "student_name")
    private String name;

    public Student(int student_id, String name) {
        this.student_id = student_id;
        this.name = name;
    }

    public int getStudent_id() {
        return student_id;
    }

    public String getName() {
        return name;
    }
}
