package com.example.android2project.data;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import com.example.android2project.model.Course;
import java.util.List;

@Dao
public interface CourseDao {

    @Insert()
    void insert(Course course);

    @Query("SELECT * from courses")
    List<Course> getAllCourses();

    @Query("SELECT * from courses WHERE course_id LIKE :courseId")
    Course findCourseById(int courseId);

    @Query("SELECT course_id from courses WHERE course_name LIKE :courseName")
    int findCourseId(String courseName);

    @Query("DELETE from courses")
    Void deleteAllCourses();
}

