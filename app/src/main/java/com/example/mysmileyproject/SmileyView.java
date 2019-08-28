package com.example.mysmileyproject;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.v7.widget.AppCompatImageView;
import android.util.AttributeSet;
import android.widget.Toast;

import java.util.jar.Attributes;

public class SmileyView extends AppCompatImageView {
    private Paint pinsel;
    boolean isSm = true;

    public SmileyView(Context context) {
        super(context);

    }

    public SmileyView(Context context, AttributeSet attrs) {
        super(context, attrs);

    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        pinsel = new Paint();
        pinsel.setColor(Color.YELLOW);
        pinsel.setStrokeWidth(5);
        canvas.drawOval(0,0,getWidth(),getHeight()/2, pinsel);
        pinsel.setColor(Color.BLACK);
        canvas.drawCircle(270,150,50,pinsel);
        canvas.drawCircle(470,150,50,pinsel);
        pinsel.setColor(Color.WHITE);
        canvas.drawCircle(255,156,10,pinsel);
        canvas.drawCircle(455,156,10,pinsel);
        pinsel.setColor(Color.BLACK);
        pinsel.setStyle(Paint.Style.STROKE);


        if (isSm){
            canvas.drawArc(100,0,getWidth() - 100,getHeight() -470,0,180,false,pinsel);
            isSm = false;
        }else{
            isSm = true;
            canvas.drawArc(100,0,getWidth() - 100,getHeight() -100,0,-180,false,pinsel);
        }


    }
}
