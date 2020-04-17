package com.PrimesPackage;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String txt="Arun is my name";
        String pat="Arug";
        char text[]=txt.toCharArray();
        char pattern[]=pat.toCharArray();
        int i=0;
        int j=0;
        if(subsearch(text,pattern,i,j))
            System.out.println("Found");
        else
            System.out.println("Not found");

    }

    public static boolean subsearch(char text[],char pattern[], int i ,int j)
    {
        //base condition kya hogi
        //text khatm ho jae ya pattern khatm ho jae
        if(i>text.length-1)
            return false;

        if(text[i]==pattern[j])
        {
            if(exactmatch(text,pattern,i+1,j+1))
            {
                return true;
            }
            else
                subsearch(text,pattern,i+1,j);
        }
        else
            subsearch(text,pattern,i+1,j);

        return false;

    }

    static boolean exactmatch(char text[],char pattern[],int i,int j)
    {

        if(j>pattern.length-1)
            return true;
        if(i>text.length-1 && j<pattern.length-1)
            return false;
        if(text[i]==pattern[j])
        {
            if(exactmatch(text,pattern,i+1,j+1))
                return true;
        }
        return false;
    }
}
