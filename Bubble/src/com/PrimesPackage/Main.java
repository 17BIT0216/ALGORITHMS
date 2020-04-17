package com.PrimesPackage;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //selection sort because we are selecting the smallest element and putting it on its original place
        Scanner sc = new Scanner(System.in);
        int size=sc.nextInt();
        int arr[] = new int[size];
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }

        for(int i=0;i<size;i++)
        {
            for(int j=i+1;j<size;j++)
            {
                if(arr[j]<arr[i])
                {
                    int swap=arr[i];
                    arr[i]=arr[j];
                    arr[j]=swap;
                }
            }
        }
        for(int i=0;i<size;i++)
        {
            System.out.println(arr[i]);
        }
    }
}
