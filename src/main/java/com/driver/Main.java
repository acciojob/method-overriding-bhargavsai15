package com.driver;

public class Main {
  public  static class A{
    static void meth(){
        System.out.println("This is parent class");
    }
  }

  public static class B extends A{
      static  void  meth(){
          System.out.println("class B extends class A method");
      }
  }

    public static void main(String[] args) {
      B obj = new B();
      obj.meth();
    }
}