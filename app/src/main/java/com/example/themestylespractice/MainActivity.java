package com.example.themestylespractice;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.transition.Explode;
import android.transition.Transition;
import android.transition.TransitionInflater;
import android.util.Pair;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int onStartCount = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().requestFeature(Window.FEATURE_CONTENT_TRANSITIONS);
        setContentView(R.layout.activity_main);
         onStartCount = 1;
        Button button = findViewById(R.id.button);
        TextView helloWorld = findViewById(R.id.hello_World);
        TextView developer = findViewById(R.id.developer);

        if (savedInstanceState == null) {
            overridePendingTransition(R.anim.slide_in_left,R.anim.slide_out_left);
        }else {
            onStartCount = 2;
        }

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent secondActivity = new Intent(MainActivity.this,SecondActivity.class);
                startActivity(secondActivity);
            }
        });

    }




}
