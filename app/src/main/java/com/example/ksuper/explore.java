package com.example.ksuper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;


public class explore extends AppCompatActivity {
    ListView listView;
    ArrayList<String> array;
    ArrayAdapter<String> adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explore);


                //initializing the variables within the oncreate method
                listView = (ListView) findViewById(R.id.box);
                array = new ArrayList<>();

                //adding items to the array
                array.add("location");
                array.add("items");
                array.add("help");
                array.add("promotions");
                array.add("aim");


                //setting up the adapter
        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, array);
        listView.setAdapter(adapter);

                //adding onclick listner for the items
                listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

                        Toast.makeText(getApplicationContext()," "+array.get(position),Toast.LENGTH_SHORT).show();

                    }
                });







            }
        }





