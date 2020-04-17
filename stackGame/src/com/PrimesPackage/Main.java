package com.PrimesPackage;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of test cases");
        int test = sc.nextInt();

        for(int i=1;i<=test;i++)
        {
            ArrayList<stack> arr = new ArrayList<>();
            System.out.println("Enter the size of the array");
            int size=sc.nextInt();
            int myarr[]= new int[size];

            for(int s=0;s<size;s++)
            {
                System.out.println("Enter the elements of the array");
                myarr[s]=sc.nextInt();
            }


            if(arr.size()==0)
                arr.add(new stack());

            for(int j=0;j<size;j++)
            {
                int ele=myarr[j];
                boolean pushhua=false;
                for(stack c:arr)
                {
                    if(c.peek()==Integer.MIN_VALUE) {
                        c.push(ele);
                        pushhua=true;
                    }
                    else if(c.peek()>ele)// agar bada hai push kar sakte hai then break aage jane ki zaroorat nahi hai
                    {
                     pushhua=true; //dalne vale aaega to mark kar denge
                     c.push(ele);
                     break;
                    }
                }
                if(pushhua==false)
                {
                    stack z = new stack();
                    z.push(ele);
                    arr.add(z);
                }

            }
            System.out.print(arr.size()+" ");
            for (stack x:arr)
            {
                System.out.print(x.peek()+" ");
            }

        }
    }
}
