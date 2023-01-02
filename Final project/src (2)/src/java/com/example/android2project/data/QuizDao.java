package com.example.android2project.data;
import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import com.example.android2project.model.Quiz;
import com.example.android2project.model.Statistic;

import java.util.List;

@Dao
public interface QuizDao {
    @Insert()
    void insert(Quiz quiz);

    @Query("SELECT * from quizzes")
    List<Quiz> getAllQuizzes();

    @Query("SELECT * from quizzes WHERE course_id LIKE :courseId")
    List<Quiz> getQuizzesOfCourse(int courseId);

    @Query("DELETE from quizzes")
    Void deleteAllQuizzes();

    @Query("SELECT MAX(q1) AS q1, MAX(q2) AS q2, MAX(q3) AS q3, MAX(q4) AS q4, MAX(q5) AS q5 FROM quizzes WHERE course_id LIKE :courseId")
    Statistic getHighScore(int courseId);

    @Query("SELECT MIN(q1) AS q1, MIN(q2) AS q2, MIN(q3) AS q3, MIN(q4) AS q4, MIN(q5) AS q5 FROM quizzes WHERE course_id LIKE :courseId")
    Statistic getLowScore(int courseId);

    @Query("SELECT AVG(q1) AS q1, AVG(q2) AS q2, AVG(q3) AS q3, AVG(q4) AS q4, AVG(q5) AS q5 FROM quizzes WHERE course_id LIKE :courseId")
    Statistic getAverageScore(int courseId);

}