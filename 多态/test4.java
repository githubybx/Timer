package com.example.demo.多态;

public class test4 {
    static class QQ{}
    static class WeChat{}
    static class Father{
        public void use(QQ qq){
            System.out.println("Father use qq");
        }
        public void use(WeChat qq){
            System.out.println("Father use WeChat");
        }
    }
    static class Son extends Father{
        @Override
        public void use(QQ qq) {
            System.out.println("Son use QQ");
        }

        @Override
        public void use(WeChat qq) {
            System.out.println("Son use WeChat");
        }
    }

    public static void main(String[] args) {
        Father father = new Father();
        father.use(new QQ());
        Father son = new Son();
        son.use(new QQ());
    }
}
