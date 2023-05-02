package com.example.gradletest;

import static android.content.ContentValues.TAG;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class MainActivity extends AppCompatActivity {

    private EditText editText;
    private TextView textView;
    private Button button;
    DatabaseReference mDatabaseRef;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.editText);
        textView = findViewById(R.id.textView);
        button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mDatabaseRef = FirebaseDatabase.getInstance().getReference();
                    mDatabaseRef.child("value").addValueEventListener(new ValueEventListener() {
                        @Override
                        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                            // Получаем новое значение и устанавливаем его в textView
                            String value = dataSnapshot.getValue(String.class);
                            Log.d(TAG, "Value is: " + value);
                            textView.setText(value);
                        }

                        @Override
                        public void onCancelled(@NonNull DatabaseError error) {
                            // Обработка ошибки чтения данных
                            Log.w(TAG, "Failed to read value.", error.toException());
                        }
                    });
                }
            });

        // Добавляем слушатель событий ValueEventListener к mDatabaseRef

    }
}