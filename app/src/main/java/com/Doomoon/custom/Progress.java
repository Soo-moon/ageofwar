package com.Doomoon.custom;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.ProgressBar;


public class Progress extends ProgressBar {

    public Progress(Context context) {
        this(context , null);
    }

    public Progress(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }


}
