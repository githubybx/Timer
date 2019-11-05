package com.example.demo.Timer;

import java.util.TimerTask;

public class myTask extends TimerTask {
    @Override
    public void run() {
        System.out.println("时间已经过了");
    }
}
