//package com.example.gradletest;
//
//import android.app.Activity;
//import android.content.Context;
//
//import android.widget.TextView;
//
//public class Game {

//
//
//
//
////    private GameLoop gameLoop;
////    Square square;
////    DatabaseWriter writer = new DatabaseWriter();
//
////    public Game(Context context) {
////        super(context);
////        SurfaceHolder surfaceHolder = getHolder();
////        surfaceHolder.addCallback(this);
////        gameLoop = new GameLoop(this, surfaceHolder);
////        square = new Square(0, 0, Color.RED);
////        new Database(square, "users");
////
////    }
////    @Override
////    public void surfaceCreated(SurfaceHolder holder) {
////        if (gameLoop.getState().equals(Thread.State.TERMINATED)) {
////            SurfaceHolder surfaceHolder = getHolder();
////            surfaceHolder.addCallback(this);
////        }
////        gameLoop.startLoop();
////    }
////    @Override
////    public void surfaceChanged(SurfaceHolder holder, int format, int width, int height) {
////    }
////    @Override
////    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
////        boolean retry = true;
////        while (retry) {
////            try {
////                SurfaceHolder holder = getHolder();
////                if (holder != null) {
////                    gameLoop.join();
////                    retry = false;
////                }
////            } catch (InterruptedException e) {
////                gameLoop.stopLoop();
////            }
////        }
////    }
////    public void draw(Canvas canvas) {
////        super.draw(canvas);
////        square.draw(canvas);
////    }
////
////    public boolean onTouchEvent(MotionEvent event) {
////        if (event.getAction() == MotionEvent.ACTION_DOWN) {
////            int x = (int) event.getX();
////            int y = (int) event.getY();
////            writer.writeData(x,y);
////        }
////        return super.onTouchEvent(event);
////    }
////}
//
