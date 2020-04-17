package com.PrimesPackage;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows");
        int row = sc.nextInt();
        System.out.println("Enter the columns");
        int col = sc.nextInt();

        int arr[][] = new int[row][col];
        int PSA[][] = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.println("Enter the elements");
                arr[i][j] = sc.nextInt();
            }
        }
        PSA[0][0] = arr[0][0];

        //row wise addition in PSA
        for (int i = 1; i < row; i++) {
            PSA[0][i] = PSA[0][i - 1] + arr[0][i];
        }
        //coloumn wise addition for the boundary
        for (int i = 1; i < col; i++) {
            PSA[i][0] = PSA[i - 1][0] + arr[i][0];
        }
        for (int i = 1; i < row; i++) {

            for (int j = 1; j < col; j++) {
                PSA[i][j] = PSA[i - 1][j] + PSA[i][j - 1] - PSA[i - 1][j - 1] + arr[i][j];
            }
        }


        //printing the 2D array after summation
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(PSA[i][j]+" ");
            }
            System.out.println();
        }


    }
}

