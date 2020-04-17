package com.company;
import static com.company.ThreadtColor.ANSI_BLUE;
public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Hello from main thread");

        AnotherThread athread = new AnotherThread();
        athread.start();
        System.out.println("Hello again from main thread");
       // athread.start(); can start a thread only once

        new Thread()
        {
            public void run()
            {
                System.out.println("ANSI_BLUE + hello from anonymous thread"); //we cannot know in which order the thread will be executed
            }

        }.start();
    }
}

