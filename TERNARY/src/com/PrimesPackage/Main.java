package com.PrimesPackage;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int arr[]={1,2,3,4,5,6,7,8,10,11,20,26,60,68};//array must be sorted
        if(ternarysearch(arr,100,0,arr.length-1))
            System.out.println("Found");
        else
            System.out.println("Not found");


    }
     public static boolean ternarysearch(int arr[],int val,int l,int r) {
         if (l <= r)
         {
             int mid1 = l + (r - l) / 3;
         int mid2 = mid1 + (r - l) / 3;

         if (arr[mid1] == val)
             return true;

         if (arr[mid2] == val)
             return true;

         if (val < mid1)
             ternarysearch(arr, val, l, mid1 - 1);
         else if (val > mid2)
             ternarysearch(arr, val, mid2 + 1, r);
         else
             ternarysearch(arr, val, mid1 + 1, mid2 - 1);

     }
         return false;

     }

}
//Binary search is better than ternary search because the number of comparisions in binary search are less than that of ternary search
//log2n+2 for binary and log3n+4 for ternary
