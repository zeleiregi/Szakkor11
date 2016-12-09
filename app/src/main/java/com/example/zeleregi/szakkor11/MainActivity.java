package com.example.zeleregi.szakkor11;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        /*Bitmap bitmap = Bitmap.createBitmap(100, 200, Bitmap.Config.ARGB_8888);

        Paint paint = new Paint();

        Canvas canvas = new Canvas(bitmap);

        canvas.drawColor(Color.RED);

        canvas.drawRect(25, 50, 75, 150, paint);

        ImageView imageView = new ImageView(this);
        imageView.setImageBitmap(bitmap);

        RelativeLayout layout = new RelativeLayout(this);
        RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT);

        params.addRule(RelativeLayout.CENTER_IN_PARENT);
        layout.addView(imageView, params);
        layout.setBackgroundColor(Color.BLACK);


        setContentView(layout);*/

    }
}
