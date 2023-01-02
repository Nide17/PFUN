package com.example.android2project.model;

import androidx.room.ColumnInfo;

public class Statistic {
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

    public Statistic(double q1, double q2, double q3, double q4, double q5) {
        this.q1 = q1;
        this.q2 = q2;
        this.q3 = q3;
        this.q4 = q4;
        this.q5 = q5;
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
}
