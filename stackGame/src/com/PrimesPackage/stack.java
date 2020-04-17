package com.PrimesPackage;

public class stack {
    int arr[] = new int[100];
    int top;
    stack()
    {
        top=-1;
    }
    public void push(int ele)
    {
        top++;
        arr[top]=ele;
    }
    public int pop()
    {
        int ele=arr[top];
        top--;
        return ele;

    }
    public int peek()
    {
        if(top==-1)
            return Integer.MIN_VALUE;
        else
            return arr[top];
    }

}
