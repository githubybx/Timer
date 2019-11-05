package com.example.demo.多态;

public class WoMan extends HuMan {
    @Override
    public void show() {
        System.out.println("Woman");
    }

    public static void main(String[] args) {
        HuMan huMan = new Man();
        HuMan huMan1 = new WoMan();
        huMan.show();
        huMan1.show();
    }
}
