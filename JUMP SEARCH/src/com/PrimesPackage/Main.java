package com.PrimesPackage;

public class Main {


   static boolean jumpSearch(int arr[], int val)
    {
        int size=arr.length;
        int step=(int)Math.floor(Math.sqrt(size));
        System.out.println(step);
        int prev=0;
        while(arr[step]<val && step<size)
        {
            prev=step;
            step=step+step;
        }

        while(prev<=step)
        {
            if(arr[prev]==val)
                return true;
            prev++;
        }

        return false;

    }

    public static void main(String[] args) {
	// write your code here
        int arr[]={1,5,10,20,30,40,45,69,70,75,76,78,79,89,90,100};//for this array must be sorted
        int x=45;
        boolean result=jumpSearch(arr,x);

        if(result)
        System.out.println("found");
        else
            System.out.println("Not found");
    }
}
