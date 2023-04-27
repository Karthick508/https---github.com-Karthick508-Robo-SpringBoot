package com.example.robo.loops;

public class Loops {

    public void forLoop(){
        int x = 10;
        int y = x++;
        int z = ++x;

        System.out.println("x-->" + x);
        System.out.println("y-->" + y);
        System.out.println("z-->" + z);
    }
}
