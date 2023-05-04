package com.example.gradletest;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

public class Game extends SurfaceView implements SurfaceHolder.Callback {
    private GameLoop gameLoop;
    Square square;

    public Game(Context context) {
        super(context);
        SurfaceHolder surfaceHolder = getHolder();
        surfaceHolder.addCallback(this);
        gameLoop = new GameLoop(this, surfaceHolder);
        square = new Square(0, 0, Color.RED);
        new Database(square, "users");
    }
    @Override
    public void surfaceCreated(SurfaceHolder holder) {
        if (gameLoop.getState().equals(Thread.State.TERMINATED)) {
            SurfaceHolder surfaceHolder = getHolder();
            surfaceHolder.addCallback(this);
        }
        gameLoop.startLoop();
    }
    @Override
    public void surfaceChanged(SurfaceHolder holder, int format, int width, int height) {
    }
    @Override
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        boolean retry = true;
        while (retry) {
            try {
                SurfaceHolder holder = getHolder();
                if (holder != null) {
                    gameLoop.join();
                    retry = false;
                }
            } catch (InterruptedException e) {
                gameLoop.stopLoop();
            }
        }
    }
    public void draw(Canvas canvas) {
        super.draw(canvas);
        square.draw(canvas);
    }
}

