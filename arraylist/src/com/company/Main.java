package com.company;

import java.util.Scanner;

public class Main {

    private static Scanner scan =new Scanner(System.in);
    private static MobilePhone mobile=new MobilePhone("7860389838");


    public static void main(String[] args)
    {
        boolean quit=true;
        startPhone();
        printActions();
        while(quit)
        {

        }


    }

    private static void printActions() {

    }
    private static void startPhone()
    {
        System.out.println("Starting the phone");
    }



}
