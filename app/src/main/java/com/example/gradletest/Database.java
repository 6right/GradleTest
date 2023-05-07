//package com.example.gradletest;
//
//
//import static android.content.ContentValues.TAG;
//
//import android.util.Log;
//
//import androidx.annotation.NonNull;
//
//import com.google.firebase.database.DataSnapshot;
//import com.google.firebase.database.DatabaseError;
//import com.google.firebase.database.DatabaseReference;
//import com.google.firebase.database.FirebaseDatabase;
//import com.google.firebase.database.ValueEventListener;
//
//
//import com.google.firebase.database.ChildEventListener;
//import com.google.firebase.database.DataSnapshot;
//import com.google.firebase.database.DatabaseError;
//import com.google.firebase.database.DatabaseReference;
//import com.google.firebase.database.FirebaseDatabase;
//
//public class Database {
//    private DatabaseReference databaseReference;
//    private Square square;
//
//    public Database(Square square, String databasePath) {
//        this.square = square;
//        FirebaseDatabase database = FirebaseDatabase.getInstance();
//        this.databaseReference = database.getReference(databasePath);
//        databaseReference.addChildEventListener(new ChildEventListener() {
//            @Override
//            public void onChildAdded(DataSnapshot dataSnapshot, String s) {
//                updateSquare(dataSnapshot);
//            }
//
//            @Override
//            public void onChildChanged(DataSnapshot dataSnapshot, String s) {
//                updateSquare(dataSnapshot);
//            }
//
//            @Override
//            public void onChildRemoved(DataSnapshot dataSnapshot) {
//                // unused
//            }
//
//            @Override
//            public void onChildMoved(DataSnapshot dataSnapshot, String s) {
//                // unused
//            }
//
//            @Override
//            public void onCancelled(DatabaseError databaseError) {
//                // unused
//            }
//        });
//    }
//
//    private void updateSquare(DataSnapshot dataSnapshot) {
//        String key = dataSnapshot.getKey();
//        if (key.equals("width")) {
//            int width = dataSnapshot.getValue(Integer.class);
//            square.setWidth(width);
//        } else if (key.equals("height")) {
//            int height = dataSnapshot.getValue(Integer.class);
//            square.setHeight(height);
//        }
//    }
//}
