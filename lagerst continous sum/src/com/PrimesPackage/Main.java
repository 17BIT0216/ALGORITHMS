package com.PrimesPackage;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        System.out.println("ENter the size of the array");
        int n = sc.nextInt();

        int arr[]=new int[n] ;
        for(int i=0;i<n;i++)
        {
            System.out.println("ENter the elemet");
            arr[i]=sc.nextInt();
        }
        int sum=arr[0];
        int maxsum=Integer.MIN_VALUE;
        int start=0,end=0;
        for(int i=0;i<n;i++)
        {
            if(sum<0)
                sum=0;
            sum=sum+arr[i];

           maxsum=Math.max(sum,maxsum);

            maxsum=Math.max(sum,maxsum);


        }
        System.out.println(maxsum);
    }
}
