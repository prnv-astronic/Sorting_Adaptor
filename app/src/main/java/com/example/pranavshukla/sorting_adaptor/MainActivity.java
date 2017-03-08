package com.example.pranavshukla.sorting_adaptor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Collections;

public class MainActivity extends AppCompatActivity {
    // create array of string class holding months
    String[] months = new String[]{"January","February","March","April","May","June","July","August","September","October","November","December"};
    // list view anad buttons
    ListView list;
    Button sort_asc,sort_Dec;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

      // registering items in layout
        list=(ListView)findViewById(R.id.My_List);
        sort_asc=(Button)findViewById(R.id.button);
        sort_Dec=(Button)findViewById(R.id.button2);
        // setting adaptor
        final ArrayAdapter<String> my_adaptor =new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,months);
        list.setAdapter(my_adaptor);
            // setting on click listner for ascending button
        sort_asc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Arrays.sort(months);// sorting array 
                my_adaptor.notifyDataSetChanged();

            }
        });
        // setting on click listner for decending button
        sort_Dec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

              Arrays.sort(months,Collections.<String>reverseOrder()); // sorting array in reverse order
                my_adaptor.notifyDataSetChanged();
            }
        });


    }
}
