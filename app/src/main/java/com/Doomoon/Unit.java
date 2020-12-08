package com.Doomoon;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.Nullable;

public abstract class Unit extends Thread{



    int hp , dam, range, speed , maketime ;

    int x, y ;


    public abstract void stat();

    public int move(){

        return x;
    }



}
