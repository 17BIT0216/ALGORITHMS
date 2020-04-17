package com.PrimesPackage;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int arrr[]={1,4,1,2,7,5,2};
        countingsort(arrr);
    }


    public static void countingsort(int arr[])
    {
        //find max in the given array
        int maxi=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>maxi)
                maxi=arr[i];
        }


        //create another array of the max size
        int other[]=new int[maxi+1];



        for(int i=0;i<arr.length;i++)
        {
            other[arr[i]]=other[arr[i]]+1;
        }

        for(int i=1;i<other.length;i++)
        {
            other[i]=other[i]+other[i-1];
        }

        int other2[]=new int[maxi+1];

        for(int i=0;i<arr.length;i++)
        {
            int ele=arr[i];
            int pos=other[arr[i]];
            other[arr[i]]=other[arr[i]]-1;
            other2[pos]=ele;

        }
        for(int i=0;i<other2.length;i++)
            System.out.println(other2[i]);
    }
}
