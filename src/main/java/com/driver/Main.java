package com.driver;

public class Main {

    public  Main() {
    }
    public static class A {
        public A() {
        }

        public String meth() {
            return "Invoking method from class A";
        }
    }

    public static class B extends A {
        public B() {
        }

        public String meth() {
            return "Method is overridden in Extendend class B";
        }
    }

  public static void main(String[] args) {
    B obj=new B();
   String s=obj.meth();
   System.out.println(s);
  }


}