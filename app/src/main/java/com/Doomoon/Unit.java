package com.Doomoon;

public abstract class Unit extends Thread{



    int hp , dam, range, speed , maketime ;

    int x, y ;

    public abstract void stat();

    public int move(){
        if (x>500){
         attack();
        }
        else{
            x += speed;
        }
        return x;
    }


    public void attack(){

    }

}
