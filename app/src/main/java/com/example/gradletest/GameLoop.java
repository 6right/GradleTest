package com.example.gradletest;

import android.graphics.Canvas;
import android.util.Log;
import android.view.SurfaceHolder;

public class GameLoop extends Thread{
    private boolean isRunning = false;
    private Game game;
    private SurfaceHolder surfaceHolder;

    public GameLoop(Game game, SurfaceHolder surfaceHolder) {
        this.game = game;
        this.surfaceHolder = surfaceHolder;
    }
    public void startLoop() {
        isRunning = true;
        start();
    }
    @Override
    public void run() {
        Log.d("start loop", "LOOP IS STARTED");
        super.run();
        Canvas canvas = null;
        while (isRunning) {
            try {
                canvas = surfaceHolder.lockCanvas();
                synchronized (surfaceHolder) {
                    game.draw(canvas);
                }
            } catch (IllegalArgumentException e) {
                e.printStackTrace();
            } finally {
                if (canvas != null) {
                    try {
                        surfaceHolder.unlockCanvasAndPost(canvas);
                    }catch (Exception e){
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    public void stopLoop() {
        isRunning = false;
        try {
            join();
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
