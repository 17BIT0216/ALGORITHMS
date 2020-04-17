package com.PrimesPackage;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //in bubble sort we must know about the number of passes the number of passes is one less than the elements in the array
        Scanner sc = new Scanner(System.in);
        int size=sc.nextInt();
        int arr[]=new int[size];
        for (int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }

        //outter loop for number of passes
        for(int i=0;i<size-1;i++)
        {
            for(int j=0;j<size-(i+1);j++)
            {
                if(arr[j+1]<arr[j]) // if this swap both the elements
                {
                    int ele=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=ele;
                }
            }
        }

        for(int i=0;i<size;i++)
        {
            System.out.println(arr[i]);
        }
    }
}
