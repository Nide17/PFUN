package com.example.android2project.view;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import com.example.android2project.R;
import com.example.android2project.data.AppDatabase;
import com.example.android2project.model.Quiz;
import com.example.android2project.model.Statistic;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ScoreFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ScoreFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public ScoreFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment ScoreFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static ScoreFragment newInstance(String param1, String param2) {
        ScoreFragment fragment = new ScoreFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_score, container, false);

        TextView course_title;

        TextView h1 = view.findViewById(R.id.highScore1);
        TextView h2 = view.findViewById(R.id.highScore2);
        TextView h3 = view.findViewById(R.id.highScore3);
        TextView h4 = view.findViewById(R.id.highScore4);
        TextView h5 = view.findViewById(R.id.highScore5);

        TextView l1 = view.findViewById(R.id.lowScore1);
        TextView l2 = view.findViewById(R.id.lowScore2);
        TextView l3 = view.findViewById(R.id.lowScore3);
        TextView l4 = view.findViewById(R.id.lowScore4);
        TextView l5 = view.findViewById(R.id.lowScore5);

        TextView a1 = view.findViewById(R.id.averageScore1);
        TextView a2 = view.findViewById(R.id.averageScore2);
        TextView a3 = view.findViewById(R.id.averageScore3);
        TextView a4 = view.findViewById(R.id.averageScore4);
        TextView a5 = view.findViewById(R.id.averageScore5);

        TableLayout layoutT = (TableLayout) view.findViewById(R.id.tableLayout);


        course_title = view.findViewById(R.id.course_title);

        Bundle bundle = getArguments();

        course_title.setText(bundle.getString("name"));

        AppDatabase db = AppDatabase.getDatabase(this.getActivity().getApplicationContext());

        List<Quiz> allQuizzes = db.quizDao().getAllQuizzes();
        List<Quiz> studentQuizzes = new ArrayList<>();

        int courseId = db.courseDao().findCourseId(bundle.getString("name"));

        DecimalFormat formatVal = new DecimalFormat("#.00");
        Statistic highScores = db.quizDao().getHighScore(courseId);
        h1.setText(formatVal.format(highScores.getQ1())+"");
        h2.setText(formatVal.format(highScores.getQ2())+"");
        h3.setText(formatVal.format(highScores.getQ3())+"");
        h4.setText(formatVal.format(highScores.getQ4())+"");
        h5.setText(formatVal.format(highScores.getQ5())+"");

        Statistic lowScores = db.quizDao().getLowScore(courseId);
        l1.setText(formatVal.format(lowScores.getQ1())+"");
        l2.setText(formatVal.format(lowScores.getQ2())+"");
        l3.setText(formatVal.format(lowScores.getQ3())+"");
        l4.setText(formatVal.format(lowScores.getQ4())+"");
        l5.setText(formatVal.format(lowScores.getQ5())+"");

        Statistic averageScores = db.quizDao().getAverageScore(courseId);
        a1.setText(formatVal.format(averageScores.getQ1())+"");
        a2.setText(formatVal.format(averageScores.getQ2())+"");
        a3.setText(formatVal.format(averageScores.getQ3())+"");
        a4.setText(formatVal.format(averageScores.getQ4())+"");
        a5.setText(formatVal.format(averageScores.getQ5())+"");

        for(int x=0; x<allQuizzes.size(); x++){
            studentQuizzes = db.quizDao().getQuizzesOfCourse(courseId);
        }

        for(int y=0; y<studentQuizzes.size(); y++){

            TextView student_txt = new TextView(this.getActivity().getApplicationContext());
            TextView q1 = new TextView(this.getActivity().getApplicationContext());
            TextView q2 = new TextView(this.getActivity().getApplicationContext());
            TextView q3 = new TextView(this.getActivity().getApplicationContext());
            TextView q4 = new TextView(this.getActivity().getApplicationContext());
            TextView q5 = new TextView(this.getActivity().getApplicationContext());

            student_txt.setText(studentQuizzes.get(y).getStudentId()+"");
            q1.setText(studentQuizzes.get(y).getQ1()+"");
            q2.setText(studentQuizzes.get(y).getQ2()+"");
            q3.setText(studentQuizzes.get(y).getQ3()+"");
            q4.setText(studentQuizzes.get(y).getQ4()+"");
            q5.setText(studentQuizzes.get(y).getQ5()+"");

            TableRow row= new TableRow(this.getActivity().getApplicationContext());
            TableRow.LayoutParams lp = new TableRow.LayoutParams(TableRow.LayoutParams.WRAP_CONTENT);
            row.setLayoutParams(lp);

            row.addView(student_txt);
            row.addView(q1);
            row.addView(q2);
            row.addView(q3);
            row.addView(q4);
            row.addView(q5);

            layoutT.addView(row);
        }

        return view;

    }
}