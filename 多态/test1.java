package com.example.demo.多态;

public class test1 extends myFather {
    static {
        a = 7;
    }
    public static int a = 8;

    public static void main(String[] args) {
        System.out.println(test1.a);
    }
}
