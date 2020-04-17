package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Thread mythread = new Thread(new MyRunnable());
        mythread.start();
        mythread.setName("FirstThread");
        System.out.println(mythread.getName());
        System.out.println();

        FirstThread my = new FirstThread();
        my.start();
        try {
            mythread.sleep(3000);
            my.interrupt();

        }
        catch (InterruptedException e)
        {
            System.out.println("Error occured");
            return;
        }
        try
        {
            mythread.join();
        }
        catch (InterruptedException e)
        {
            System.out.println("I was interrupted my something");
        }


    }
    class CountDown()
    {
    public void countDown()
        {
            String color;
            switch (Thread.currentThread().getName())
            {
                case "Thread 1":
                    color=ThreadColor.ANSI_BLUE;
                    break;
                case "Thread 2":
                    color=ThreadColor.ANSI_GREEN;
                    break;


            }
        }

    }

    class countDownThread extends Thread
    {
        private CountDown threadCount;
        public void run()
        {

        }

    }


}
