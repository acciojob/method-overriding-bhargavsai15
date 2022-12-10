package com.driver;

public class Main {
  public  static class A{
    public String meth(){
        return "This is parent class";
    }
  }

  public static class B extends A{
      public  String  meth(){
          return "class B extends class A method";
      }
  }

    public static void main(String[] args) {
      B obj = new B();
        System.out.println(obj.meth());
    }
}