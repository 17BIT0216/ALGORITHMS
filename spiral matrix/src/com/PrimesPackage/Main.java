package com.PrimesPackage;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        System.out.println("ENter the row");
        int row=sc.nextInt();
        System.out.println("Enter the col");
        int col = sc.nextInt();
        int arr[][] = new int[row][col];

        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                System.out.println("Enter the element");
                arr[i][j]=sc.nextInt();
            }
        }
        int k=0,q=row;  //takes care of the rows  first row,last column,last row,first col
        int l=0,n=col;  //take care of the columns

        System.out.println("Matrix in spiral form");
        while(k<q && l<n)
        {
            for(int i=l;i<n;i++)  //l-->n
            {
                System.out.print(arr[k][i]+" ");
            }
            k++;



            for(int j=k;j<q;j++)
            {
                System.out.print(arr[j][n-1]+" ");
            }
            n--;


            if(k<q)
            for(int z=n-1;z>=l;z--)
            {
                System.out.print(arr[q-1][z]+" ");
            }
            q--;

            if(l<n)
            for(int d=q-1;d>=k;d--)
            {
                System.out.print(arr[d][l]+" ");
            }
            l++;

        }

    }
}
