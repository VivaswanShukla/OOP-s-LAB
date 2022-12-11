package com.codes;
interface A{
    void meth1();
    void meth2();
}
class MyClass{
    public void meth1(){
        System.out.println("Hello, I am meth1()");
    }
    public void meth2(){
        System.out.println("Hello, I am meth2()");
    }
}
public class lab_5_2 {
    public static void main(String[] args) {
        MyClass mc = new MyClass();
        mc.meth1();
        mc.meth2();
    }
}
