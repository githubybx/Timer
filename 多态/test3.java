package com.example.demo.多态;

import java.io.Serializable;

public class test3 extends myFather implements myInterface{
    @Override
    public void show1() {
        System.out.println("忽略");
    }
    /*public void show(char a){
        System.out.println("char");
    }*/
   /* public void show(int a){
        System.out.println("int");
    }*/
    /*public void show(long a){
        System.out.println("long");
    }*/
    /*public void show(double a){
        System.out.println("double");
    }*/
    /*public void show(float a){
        System.out.println("float");
    }*/
    /*public void show(myFather a){
        System.out.println("Father");
    }*/
    /*public void show(myInterface a){
        System.out.println("myInterface");
    }*/
    /*public void show(Character a){
        System.out.println("Character");
    }*/
    public void show(Integer a){
        System.out.println("Integer");
    }
    public void show(Object a){
        System.out.println("Object");
    }
    public void show(Serializable a){
        System.out.println("Serializable");
    }
    public static void main(String[] args) {
        test3 test3 = new test3();
        test3.show(test3);
    }
}
