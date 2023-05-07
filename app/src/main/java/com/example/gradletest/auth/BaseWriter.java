package com.example.gradletest.auth;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class BaseWriter {
    DatabaseReference mDatabaseRef;
    // Записываем в базу данных UID пользователя
    public void writeUID(String UID) {
        mDatabaseRef = FirebaseDatabase.getInstance().getReference();
        mDatabaseRef.child("games").child("user1").setValue(UID);
    }
}
