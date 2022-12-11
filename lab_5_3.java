package com.codes;
interface hemlo{
    int a = 50;
}
public class lab_5_3 implements hemlo {
    public static void main(String[] args) {
        lab_5_3 l = new lab_5_3();
        l.a = 40; // you cannot change the value of a as it is final variable.
    }
}
