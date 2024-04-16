package com.example.taskmanagement;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.widget.ImageView;
import android.widget.ListView;

import com.google.gson.Gson;

public class Math extends AppCompatActivity {
    private ListView listView;
    private SharedPreferences preference;
    private SharedPreferences.Editor editor;
    private Gson testsGson;

    //_____________________________________________________________________________________________________________________________________

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_math);

        setupSharedPreferences();   //Setup SharedPreferences, Editor and Gson
        setupViews();   //Setup the needed elements that we will need in this class


    }
    //_____________________________________________________________________________________________________________________________________
    //_____________________________________________________________________________________________________________________________________

    private void setupSharedPreferences() { //Setup SharedPreferences, Editor and Gson
        preference = PreferenceManager.getDefaultSharedPreferences(this);
        editor = preference.edit();
        testsGson = new Gson();
    }
    //_____________________________________________________________________________________________________________________________________

    private void setupViews() { //Setup the needed elements that we will need in this class
        ImageView examImage = (ImageView) findViewById(R.id.ivMath);//This image will be added at run time(dynamically)
        examImage.setImageResource(R.drawable.math);
        listView = (ListView) findViewById(R.id.listView);

    }
    }