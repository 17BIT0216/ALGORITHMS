package com.Currency;

import Distance.Distance;
import Distance.TimeConverter;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("1.Currenct Converter");
        System.out.println("2.Distance Converter");
        System.out.println("3.Time converter");
        Scanner sc =new Scanner(System.in);
        int choice=sc.nextInt();

        if(choice==1) {
            Currency c = new Currency();
            c.valueConverter1();
        }
        else if(choice==2) {
            Distance d = new Distance();
            d.Distance();
        }
        else {
            TimeConverter t = new TimeConverter();
            t.TimeConverted();
        }


    }
}
