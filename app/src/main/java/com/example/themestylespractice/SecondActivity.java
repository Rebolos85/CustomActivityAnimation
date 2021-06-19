package com.example.themestylespractice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Button secondButton = findViewById(R.id.second_activity_button);

        secondButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent thirdActivity = new Intent(SecondActivity.this,third_activity.class);
                startActivity(thirdActivity);
            }
        });
    }
}