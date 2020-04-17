package com.PrimesPackage;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //how can we memoize i
        int arr[]={1, 100, 1, 1, 1, 100, 1, 1, 100, 1};
        int c1=stairCase(0,arr);
        int c2=stairCase(1,arr);
        System.out.println(Math.min(c1,c2));

    }
    public static int stairCase(int index,int arr[])
    {
        if(index>=arr.length)
        {
            return 0;
        }
        int min1=arr[index]+stairCase(index+1,arr);
        int min2=arr[index]+stairCase(index+2,arr);

        return Math.min(min1,min2);
    }

}
