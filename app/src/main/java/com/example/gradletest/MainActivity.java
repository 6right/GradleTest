package com.example.gradletest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.Guideline;

import android.os.Bundle;
import android.widget.TextView;

import com.example.gradletest.auth.BaseWriter;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Создаем новый объект TextView
        FirebaseAuth mAuth = FirebaseAuth.getInstance();
        FirebaseUser currentUser = mAuth.getCurrentUser();
        BaseWriter baseWriter = new BaseWriter();
//        if (currentUser != null) {
            String uid = currentUser.getUid();
            baseWriter.writeUID(uid);
//        }

        TextView textView = new TextView(this);
        textView.setText("Hello, world!");

        // Устанавливаем объект TextView в качестве основного макета
        setContentView(textView);
    }
}