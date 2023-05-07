//package com.example.gradletest;
//
//
//import com.google.firebase.database.DatabaseReference;
//import com.google.firebase.database.FirebaseDatabase;
//
//public class DatabaseWriter {
//    DatabaseReference mDatabaseRef;
//
//    public void writeData(int x, int y) {
//        mDatabaseRef = FirebaseDatabase.getInstance().getReference();
//        mDatabaseRef.child("users").child("width").setValue(x);
//        mDatabaseRef.child("users").child("height").setValue(y);
//    }
//}
