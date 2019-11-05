package com.example.demo.多态;

import javax.xml.transform.Templates;

public class test2 {
    static public class Human{}
    static public class Man extends Human{}
    static public class WoMan extends Man{}
    public void show(Human human){
        System.out.println("HuMan");
    }
    public void show(Man human){
        System.out.println("Man");
    }
    public void show(WoMan human){
        System.out.println("WoMan");
    }
    public static void main(String[] args) {
        Human man = new Man();
        Human woMan = new WoMan();
        test2 test2 = new test2();
        test2.show(man);
        test2.show(woMan);
    }
}
