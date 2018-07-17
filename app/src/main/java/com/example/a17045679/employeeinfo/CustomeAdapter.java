package com.example.a17045679.employeeinfo;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class CustomeAdapter extends ArrayAdapter {


    Context parent_context;
    int layout_id;
    ArrayList<todoEmployee> movieList;


    public CustomeAdapter(@NonNull Context context, int resource, @NonNull ArrayList<todoEmployee>  objects) {
        super(context, resource, objects);
        parent_context = context;
        layout_id = resource;
        movieList = objects;
    }



    //Right-Click generate Override Method
    //It runs the roll everytime it runs
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(layout_id, parent, false);
        TextView tvName = rowView.findViewById(R.id.textViewName);
        TextView tvCourse = rowView.findViewById(R.id.textViewCourse);
        TextView tvMoney = rowView.findViewById(R.id.textViewPrice);
        todoEmployee currentItem = movieList.get(position);
        String name = currentItem.getName();
        String course = currentItem.getCourse();
        double money = currentItem.getMoney();

        tvName.setText(name);
        tvCourse.setText(course);
        tvMoney.setText(String.valueOf(money));

        return rowView;
    }
}
