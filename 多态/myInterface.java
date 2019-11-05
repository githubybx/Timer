package com.example.demo.多态;

public interface myInterface {
    public static final int a = 3;
    public abstract void show1();
    public default void show3(){
        System.out.println("接口默认方法");
    }
    public static void show5(){
        System.out.println("接口静态方法");
    }
}
