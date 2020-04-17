package com.Currency;

import java.util.Scanner;

public class Currency {

    //Currency coverter
    public void valueConverter1()
    {
        System.out.println("Enter your choice ");
        System.out.println("1.Dollor to INR");
        System.out.println("2.EURO to INR");
        System.out.println("3.YEN To INR");
        System.out.println("4 INR To DOllar");
        System.out.println("5. INR To Euro");
        System.out.println("6. INR to YEN");


        int choice;
        Scanner sc = new Scanner(System.in);
        choice = sc.nextInt();
        System.out.println("Enter the value to convert to");
        int val = sc.nextInt();
        double converted = 0.0;
        if (choice == 1) {
            converted = val * 71.9;
        } else if (choice == 2) {
            converted = val * 79.3572;
        } else if (choice == 3) {
            converted = val * 0.6744;
        } else if (choice == 4) {
            converted = 0.014 * val;
        } else if (choice == 5) {
            converted = 0.0125 * val;
        } else if (choice == 6) {
            converted = 1.483 * val;
        }
        System.out.println("value after conversion is");
        System.out.println(converted);
    }
}
