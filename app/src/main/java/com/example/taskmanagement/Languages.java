package com.example.taskmanagement;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Languages extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_languages);

        ListView languageListView = findViewById(R.id.languesListView);

        //Add Array items to ListView using an ArrayAdapter
        ArrayAdapter<Language> languagesAdapter = new ArrayAdapter<Language>(this,
                android.R.layout.simple_list_item_1, Language.languages);
        languageListView.setAdapter(languagesAdapter);

        AdapterView.OnItemClickListener itemClickListener = (parent, view, position, id) -> {
            Intent intent = null;

            if(position == 0)
                intent = new Intent(Languages.this, Chemistry.class);
            else if (position == 1)
                intent = new Intent(Languages.this, Math.class);

            startActivity(intent);
        };

        languageListView.setOnItemClickListener(itemClickListener);
    }
}