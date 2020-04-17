package com.PrimesPackage;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of ugly number you want create");
       int n=sc.nextInt();
       int i=1;
       int uglycount=0;
       int uglynumber=0;

       while(uglycount<n) {

           boolean a=isugly(i);
           if(a)
               uglycount++;
           i++;
           uglynumber=i;
       }

        System.out.println(uglynumber);
       }




    public static boolean isugly(int num)
    {
        for(int i=2;i<num;i++)
        {

            if(num%i==0)
            {
                if(isPrime(i))
                if(i!=2 && i!=3 && i!=5)
                    return false;
            }
        }
        return true;
    }

   public static boolean isPrime(int n)
    {
        int count=0;
        for(int i=2;i<n;i++)
        {
            if(n%i==0)
                count++;

        }
        if(count==0)
            return true;
        else
            return false;
    }

}
