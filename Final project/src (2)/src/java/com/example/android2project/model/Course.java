package com.example.android2project.model;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;


@Entity(tableName = "courses")
public class Course {

    @PrimaryKey
    private int course_id;
    @ColumnInfo(name = "course_name")
    private String name;


    public Course(int course_id, String name)
    {
        this.course_id = course_id;
        this.name = name;
    }

    public int getCourse_id()
    {
        return course_id;
    }

    public void setCourseId(int course_id)
    {
        this.course_id = course_id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }
}
