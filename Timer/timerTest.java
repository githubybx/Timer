package com.example.demo.Timer;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class timerTest {
    public static void main(String[] args) {
        try {
            myTask myTask = new myTask();
            Timer timer = new Timer();
            //5秒之后执行
            //timer.schedule(myTask, 5000);
            //每一个timer对象同一时间只能执行同一个任务一次
            System.out.println(LocalDateTime.now());
            //任务隔一段时间执行
            //timer.schedule(myTask,1000,2000);
            System.out.println("12");
            //任务执行的追赶性
            String str = "2019-11-5 21:30:23";
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            Date parse = simpleDateFormat.parse(str);
            //timer.schedule(myTask,parse);
            System.out.println("上面的");
            timer.scheduleAtFixedRate(myTask,parse,1000);
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }
}
