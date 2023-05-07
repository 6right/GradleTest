package com.example.gradletest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.Guideline;

import android.os.Bundle;
import android.widget.TextView;

import com.example.gradletest.auth.BaseWriter;
import com.example.gradletest.auth.Users;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;


public class MainActivity extends AppCompatActivity {
    Users users = new Users();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        BaseWriter baseWriter = new BaseWriter(users);

        TextView textView = new TextView(this);
        textView.setText("Hello, world!");

        setContentView(textView);
    }
}