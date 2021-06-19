package com.example.themestylespractice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.transition.Scene;
import android.transition.Transition;
import android.transition.TransitionInflater;
import android.transition.TransitionManager;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

public class main_activity extends AppCompatActivity {
    private Scene scene;
    private Scene scene2;
    private Scene currentScene;
    private Transition transition;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        FrameLayout frameLayout = findViewById(R.id.sceneRootFrameLayout);
//        scene = Scene.getSceneForLayout(frameLayout, R.layout.scene_1, this);
//        scene2 = Scene.getSceneForLayout(frameLayout, R.layout.scene_2, this);
//        scene.enter();
//        currentScene = scene;
//
//        transition = TransitionInflater.from(this).inflateTransition(R.transition.explode);
    }

    public void onClick(View view) {
//
//        if (currentScene == scene) {
//            TransitionManager.go(scene2, transition);
//        } else {
//            TransitionManager.go(scene, transition);
//        }
    }
}