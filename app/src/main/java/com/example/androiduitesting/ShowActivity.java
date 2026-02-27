package com.example.androiduitesting;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class ShowActivity extends AppCompatActivity {

    private TextView cityText;
    private Button backButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.showactivity);
        cityText = findViewById(R.id.text_city);
        backButton = findViewById(R.id.button_back);
        String cityName = getIntent().getStringExtra("city_name");
        if (cityName != null) {
            cityText.setText(cityName);
        }

        backButton.setOnClickListener(v -> finish());
    }
}