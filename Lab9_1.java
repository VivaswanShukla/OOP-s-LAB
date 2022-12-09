package com.codes;
class threadext1 extends Thread
{
    @Override
    public void run() {
        int i = 0;
        while(i < 50)
        {
            System.out.println(" i am thread 1");
            i ++;
        }
    }
}
class threadext2 extends Thread
{
    public void run()
    {
        int i = 0;
        while(i < 50)
        {
            System.out.println("I AM THREAD 2");
            i ++;
        }
    }
}
public class Lab9_1 {
    public static void main(String[] args) {
        threadext1 t1 = new threadext1();
        threadext2 t2 = new threadext2();

        t1.start();
        t2.start();
    }
}
