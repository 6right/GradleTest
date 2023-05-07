package com.example.gradletest.auth;

import android.util.Log;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class BaseWriter {
    DatabaseReference mDatabaseRef;
    String UID;
    String userID;
    Users users;
    public BaseWriter(Users user) {
        this.users = user;
        UID = users.getUID();
        mDatabaseRef = FirebaseDatabase.getInstance().getReference();
        mDatabaseRef.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                userID = dataSnapshot.child("games").child("user1").getValue(String.class);
                if (userID != null) {
                    if (userID != null) {
                        mDatabaseRef.child("games").child("user1").setValue(UID);
                    } else {
                        mDatabaseRef.child("games").child("user2").setValue(UID);
                    }
                } else {
                    Log.d("gameID==============================", "Value is null");
                }
            }
            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        }
        );}
}
