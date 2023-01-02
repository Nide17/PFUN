package com.example.android2project.data;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import com.example.android2project.model.Student;
import java.util.List;

@Dao
public interface StudentDao {
    @Insert()
    void insert(Student student);

    @Query("SELECT * from students")
    LiveData<List<Student>> getAllStudents();

    @Query("SELECT * from students WHERE student_id LIKE :studentId")
    Student findStudentById(int studentId);

    @Query("DELETE from students")
    Void deleteAllStudents();
}
