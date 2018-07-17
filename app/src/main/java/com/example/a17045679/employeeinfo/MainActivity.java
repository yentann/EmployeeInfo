package com.example.a17045679.employeeinfo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    ListView lvMovie;
    ArrayList<todoEmployee> alMovieList;
    CustomeAdapter caMovie;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvMovie = findViewById(R.id.listView);
        alMovieList = new ArrayList<>();

        todoEmployee item1 = new todoEmployee("John", "Software Technical Leader", 3400.00);
        todoEmployee item2 = new todoEmployee("May", "Programmer", 2200.0);

        alMovieList.add(item1);
        alMovieList.add(item2);

        caMovie = new CustomeAdapter(this, R.layout.todo_employee, alMovieList);

        lvMovie.setAdapter(caMovie);
    }
    }

