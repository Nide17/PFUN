package com.example.android2project.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.example.android2project.R;
import com.example.android2project.data.AppDatabase;
import com.example.android2project.model.Course;
import com.example.android2project.model.Quiz;
import com.example.android2project.model.Student;

import java.util.Arrays;
import java.util.List;

public class Courses extends AppCompatActivity {

    ListView courses;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.courses);
       AppDatabase db = AppDatabase.getDatabase(this.getApplicationContext());

        courses = (ListView) findViewById(R.id.courseList);

        try {
            db.courseDao().deleteAllCourses();
            db.quizDao().deleteAllQuizzes();
            db.studentDao().deleteAllStudents();

            Course course1 = new Course(1, "DPSD");
            Course course2 = new Course(2, "DevOps");
            Course course3 = new Course(3, "ICT for Business");

            db.courseDao().insert(course1);
            db.courseDao().insert(course2);
            db.courseDao().insert(course3);

            Student student1 = new Student(788, "Yves");
            Student student2 = new Student(789, "Tyson");
            Student student3 = new Student(790, "Aanu");


            db.studentDao().insert(student1);
            db.studentDao().insert(student2);
            db.studentDao().insert(student3);

            Quiz quiz1 = new Quiz(1, "Q1", 78, 77,89,99,46,course1.getCourse_id(), student1.getStudent_id());
            Quiz quiz2 = new Quiz(2, "Q2", 98, 66,78,97,12,course1.getCourse_id(), student2.getStudent_id());
            Quiz quiz3 = new Quiz(3, "Q3", 88, 88,48,89,55,course1.getCourse_id(), student3.getStudent_id());

            Quiz quiz4 = new Quiz(4, "Q1", 82, 88,89,78,46,course2.getCourse_id(), student1.getStudent_id());
            Quiz quiz5 = new Quiz(5, "Q2", 44, 66,78,100,12,course2.getCourse_id(), student2.getStudent_id());
            Quiz quiz6 = new Quiz(6, "Q3", 96, 57,48,88,68,course2.getCourse_id(), student3.getStudent_id());

            Quiz quiz7 = new Quiz(7, "Q1", 39, 88,89,85,46,course3.getCourse_id(), student1.getStudent_id());
            Quiz quiz8 = new Quiz(8, "Q2", 66, 69,83,89,77,course3.getCourse_id(), student2.getStudent_id());
            Quiz quiz9 = new Quiz(9, "Q3", 71, 66,48,88,84,course3.getCourse_id(), student3.getStudent_id());

            db.quizDao().insert(quiz1);
            db.quizDao().insert(quiz2);
            db.quizDao().insert(quiz3);

            db.quizDao().insert(quiz4);
            db.quizDao().insert(quiz5);
            db.quizDao().insert(quiz6);

            db.quizDao().insert(quiz7);
            db.quizDao().insert(quiz8);
            db.quizDao().insert(quiz9);

            List<Course> coursesList = db.courseDao().getAllCourses();
            String coursesName[] = new String[coursesList.size()];
            int coursesId[] = new int[coursesList.size()];


            for(int i=0; i<coursesList.size(); i++){
                coursesName[i] = coursesList.get(i).getName();
                coursesId[i] = coursesList.get(i).getCourse_id();
            }

            ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, Arrays.asList(coursesName));
            courses.setAdapter(arrayAdapter);

            courses.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                    Bundle bundle = new Bundle();
                    bundle.putString("name", coursesName[i]);
                    Fragment fragment = new ScoreFragment();
                    fragment.setArguments(bundle);
                    getSupportFragmentManager().beginTransaction().replace(R.id.scores_layout,fragment).commit();


                }
            });

        } catch (Exception exc){
            Log.println(Log.INFO,"msg","********************************");
            Log.println(Log.INFO,"msg",exc.getMessage());
            Log.println(Log.INFO,"msg","********************************");
        }
    }



}