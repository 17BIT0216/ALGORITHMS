package com.PrimesPackage;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int n=10;
        int arr[]={25,10,5,1};
        int dynamic[][] = new int[n+1][arr.length];
        int ways=makechange(n,arr,0,dynamic);
        //we can improve it use dynamic programming

        System.out.println(ways);
    }

    public static int makechange(int amount,int arr[],int index,int dynamic[][])
    {
        if(index>=arr.length-1)
            return 1;// we got a solution

        if(dynamic[amount][index]>0)
            return dynamic[amount][index];


        int ways=0;
        int denominations=arr[index];

        for(int i=0;i*denominations<=amount;i++) // starting with a zero because pehli bar vo denomination nahi le rahe hai
        {
            int leftamount=amount-(i*denominations);
            ways+=makechange(leftamount,arr,index+1,dynamic);
        }
        dynamic[amount][index]=ways;
        return ways;
    }
}
