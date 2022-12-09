package com.codes;
class threadRunnable1 implements Runnable{
    @Override
    public void run() {
        int i = 0;
        while(i < 60)
        {
            System.out.println(" i am thread runnable 1");
            i++;
        }
    }
}
class threadRunnable2 implements Runnable{
    @Override
    public void run() {
        int i = 0;
        while(i < 60)
        {
            System.out.println("I AM THREAD RUNNABLE 2");
            i ++;
        }
    }
}
public class Lab9_1_runnable {
    public static void main(String[] args) {
        threadRunnable1 t1 = new threadRunnable1();
        Thread s1 = new Thread(t1);

        threadRunnable2 t2 = new threadRunnable2();
        Thread s2 = new Thread(t2);

        s1.start();
        s2.start();
    }
}
