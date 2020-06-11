package com.example.immobilien;

import androidx.appcompat.app.AppCompatActivity;
import android.content.SharedPreferences;

import android.content.Intent;
import android.widget.Button;
import android.view.View;

//import android.app.ActionBar;
//import android.support.v7.app.ActionBar;
import android.os.Bundle;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    public static List<filter> allFilter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button searchButton = (Button)findViewById(R.id.searchButton);

        searchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, RoB.class));
            }
        });
    }
}