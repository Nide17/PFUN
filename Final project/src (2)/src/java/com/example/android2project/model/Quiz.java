package com.example.android2project.model;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;

@Entity(tableName = "quizzes", foreignKeys = {
        @ForeignKey(entity = Student.class, parentColumns = "student_id", childColumns = "student_id", onDelete = ForeignKey.CASCADE),
        @ForeignKey(entity = Course.class, parentColumns = "course_id", childColumns = "course_id", onDelete = ForeignKey.CASCADE),


})
public class Quiz {

    @PrimaryKey
    private int id;
    @ColumnInfo(name = "quiz_name")
    private String name;
    @ColumnInfo(name = "q1")
    private double q1;
    @ColumnInfo(name = "q2")
    private double q2;
    @ColumnInfo(name = "q3")
    private double q3;
    @ColumnInfo(name = "q4")
    private double q4;
    @ColumnInfo(name = "q5")
    private double q5;
    @ColumnInfo(name = "course_id")
    private int course_id;
    @ColumnInfo(name = "student_id")
    private long student_id;


    public Quiz(int id, String name, double q1, double q2, double q3, double q4, double q5, int course_id, long student_id) {
        this.id = id;
        this.name = name;
        this.q1 = q1;
        this.q2 = q2;
        this.q3 = q3;
        this.q4 = q4;
        this.q5 = q5;
        this.course_id = course_id;
        this.student_id = student_id;
    }

    public long getStudent_id() {
        return student_id;
    }

    public int getCourse_id() {
        return course_id;
    }

    public void setCourse_id(int course_id) {
        this.course_id = course_id;
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public double getQ1() {
        return q1;
    }

    public double getQ2() {
        return q2;
    }

    public double getQ3() {
        return q3;
    }

    public double getQ4() {
        return q4;
    }

    public double getQ5() {
        return q5;
    }

    public void setQ1(double q1) {
        this.q1 = q1;
    }

    public void setQ2(double q2) {
        this.q2 = q2;
    }

    public void setQ3(double q3) {
        this.q3 = q3;
    }

    public void setQ4(double q4) {
        this.q4 = q4;
    }

    public void setQ5(double q5) {
        this.q5 = q5;
    }

    public void setStudent_id(int student_id) {
        this.student_id = student_id;
    }

    public int getCourseId()
    {
        return course_id;
    }

    public void setCourseId(int course)
    {
        this.course_id = course;
    }

    public void setStudentId(int student)
    {
        this.student_id = student;
    }

    public long getStudentId()
    {
        return student_id;
    }

}
