package com.example.gradletest;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.Log;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

import androidx.annotation.NonNull;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.ValueEventListener;

public class Game {


//    GameLoop gameLoop;
//    database database = new database();
//
//    public Game(MainActivity mainActivity) {
//        super(mainActivity);
//        SurfaceHolder surfaceHolder = getHolder();
//        surfaceHolder.addCallback(this);
//        gameLoop = new GameLoop(this, surfaceHolder);
//    }
//
//    @Override
//    public void surfaceCreated(SurfaceHolder holder) {
//        if (gameLoop.getState().equals(Thread.State.TERMINATED)) {
//            SurfaceHolder surfaceHolder = getHolder();
//            surfaceHolder.addCallback(this);
//        }
//        MainActivity mainActivity = (MainActivity) getContext();
//        gameLoop = new GameLoop(this, holder);
//        gameLoop.startLoop();
//
//        // Чтение данных из базы данных
//        database.readData();
//    }
//
//    @Override
//    public void surfaceChanged(@NonNull SurfaceHolder surfaceHolder, int i, int i1, int i2) {
//
//    }
//
//    @Override
//    public void surfaceDestroyed(@NonNull SurfaceHolder surfaceHolder) {
//
//    }
//
//    public void draw(Canvas canvas) {
//        super.draw(canvas);
//        Paint paint = new Paint();
//        if (database.value.equals("red"))
//            paint.setColor(Color.RED);
//        else if (database.value.equals("yellow"))
//            paint.setColor(Color.YELLOW);
//        else
//            paint.setColor(Color.GREEN);
//        canvas.drawCircle(500, 500, 50, paint);
//    }
//
//    @Override
//    public boolean onTouchEvent(MotionEvent event) {
//        if (event.getAction() == MotionEvent.ACTION_DOWN) {
//            Log.d("TAG", "onTouchEvent: " + database.value);
//            database.setValue("yellow");
//        }
//        return super.onTouchEvent(event);
//    }
}
