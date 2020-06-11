package com.example.immobilien;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;

public class filter_page extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_filter_page);

        Button applyButton = (Button)findViewById(R.id.applyButton);
        final Switch favButton = findViewById(R.id.favSwitch);
        final Switch showAllButton = findViewById(R.id.allSwitch);

        favButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(favButton.isChecked())
                {
                    showAllButton.setChecked(false);
                }
            }
        });

        showAllButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(showAllButton.isChecked())
                {
                    favButton.setChecked(false);
                }
            }
        });

        applyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText locationButton = findViewById(R.id.locationInput);
                EditText radiusButton = findViewById(R.id.radInput);
                EditText prizeButton = findViewById(R.id.priceInput);
                EditText sizeButton = findViewById(R.id.sizeInput);


                String location = locationButton.getText().toString();
                String tempString = radiusButton.getText().toString();
                int radius = 0;
                if (!"".equals(tempString)){
                    radius=Integer.parseInt(tempString);
                }
                tempString = prizeButton.getText().toString();
                int prize = 0;
                if (!"".equals(tempString)){
                    prize=Integer.parseInt(tempString);
                }
                tempString = sizeButton.getText().toString();
                int size = 0;
                if (!"".equals(tempString)){
                    size=Integer.parseInt(tempString);
                }
                boolean onlyFav = favButton.isChecked();
                boolean showAll = showAllButton.isChecked();
                filter tempFilter = new filter(location, radius, prize, size, onlyFav, showAll);

            }
        });

    }
}