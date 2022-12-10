package com.driver;

public class Main {
    public  static class A{
        public  String meth(){
            return "class A method invoked";
        }
    }

    public  static  class B extends  A{
        @Override
        public String meth(){
            return "Method is overridden in Extended class B";
        }
    }
    public static void main(String[] args) {
        B b=new B();
        b.meth();
    }
}