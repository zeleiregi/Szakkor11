package com.example.zeleregi.szakkor11;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

/**
 * Created by zeleregi on 2016.12.09..
 */

public class MyView extends SurfaceView implements SurfaceHolder.Callback {

    private SurfaceHolder surfaceHolder;
    Paint paint = new Paint();
    public MyView(Context context, AttributeSet attrs) {
        super(context, attrs);

        paint.setColor(Color.BLUE);
        surfaceHolder = getHolder();
        surfaceHolder.addCallback(this);

    }

    @Override
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        Canvas canvas = surfaceHolder.lockCanvas();

        if(canvas!= null){

            render(canvas);
            surfaceHolder.unlockCanvasAndPost(canvas);
        }
    }

    private void render (Canvas canvas){
        //canvas.drawRect(10,10, 100, 100, paint);

        float cx = 200;
        float cy = 200;
        float radius = 100;
        float prevx = cx + radius;
        float prevy = cy ;

        for(int i=0; i <= 360; i+=5){
            float y = cy + radius * (float) Math.sin(Math.toRadians(i));
            float x = cx +  radius * (float) Math.cos(Math.toRadians(i));

            canvas.drawLine(prevx, prevy, x, y, paint);

            prevx = x;
            prevy = y;
        }
    }

    @Override
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i1, int i2) {

    }

    @Override
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {

    }
}

