package com.PrimesPackage;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int arr[]={7,5,4,18,34,12,36,78,39,100,1};
        quicksort(arr,0,arr.length-1);
        for(int i=0;i<arr.length;i++)
            System.out.println(arr[i]);
    }

    public static int partition(int arr[],int l,int r)
    {
        int i=l-1;
        //scan the array fro, Lower limit to the higher limit
        int j=l;
        int pivotele=arr[r];
        while(j<r-1)
        {
            if(arr[j]<=pivotele)
            {
                //swap elements at i and j
                i=i+1;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;

            }j++;
        }
        i=i+1;
        int temp=arr[i];
        arr[i]=arr[r];
        arr[r]=temp;
        return i;

    }

    public static void quicksort(int arr[],int l,int r)
    {
        if(l<r)
        {
            int q=partition(arr,l,r);
            quicksort(arr,l,q-1);
            quicksort(arr,q+1,r);

        }
    }


}
