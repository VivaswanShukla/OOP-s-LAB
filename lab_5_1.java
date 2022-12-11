package com.codes;
interface test{
    void square(int a);
}

class arithmetic implements test{
    int a;
    public void square(int a){
        this.a  = a * a;
        System.out.println("The square is: "+ this.a);
    }
}
public class lab_5_1 {
    public static void main(String[] args) {
        arithmetic at = new arithmetic();
        at.square(5);
    }
}
