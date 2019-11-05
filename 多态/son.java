package com.example.demo.多态;

public class son extends myFather implements myInterface {
    @Override
    public void show1() {
        System.out.println(super.a);
    }

    public static void main(String[] args) {
        son son = new son();
        son.show1();
    }
}
