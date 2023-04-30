package com.example.gradletest;


import static android.content.ContentValues.TAG;

import android.util.Log;

import androidx.annotation.NonNull;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;


public class Database {
    public DatabaseReference mDatabaseRef;
    public String value;

    public String writeData() {
        mDatabaseRef = FirebaseDatabase.getInstance().getReference();

        return value;
    }
}
