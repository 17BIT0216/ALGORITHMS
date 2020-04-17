package com.company;
import static com.company.ThreadtColor.ANSI_RED;

public class AnotherThread  extends Thread{
    @Override
    public void run() {
        System.out.println(ANSI_RED +" Hello From another thread");
    }
}
