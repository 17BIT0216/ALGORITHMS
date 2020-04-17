package com.PrimesPackage;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int size=7;
        Integer arr[] = new Integer[8];
        ArrayList<Integer []> list = new ArrayList<>();
        findsolution(0,arr,list);
        for(int i=0;i<list.size();i++)
        {
            Integer a[]=list.get(i);
            for(int z=0;z<a.length;z++)
            {
                System.out.print(a[z]+" ");

            }
            System.out.println();
        }
        System.out.println(list.size());
    }

    public static void findsolution(int row,Integer [] columns,ArrayList<Integer []>result)
    {
        if(row==8) //we got our answer
        {
            result.add(columns.clone());
        }
        else
        {
            for(int col=0;col<=7;col++)
            {
                if(checkthis(row,col,columns))
                {
                    columns[row]=col; //because we are maintaining a single array in which each cell represents a row
                    findsolution(row+1,columns,result);

                }
            }
        }
    }

    public static boolean checkthis(int row1,int col1,Integer [] coloumns)
    {
        for(int row2=0;row2<row1;row2++) {
            //iterate in the coloumns array
           int col2=coloumns[row2];

           //check if whether a queen was places in the same column before or not by going through the array
            if(col2==col1)
                return false;

            //check for the diagonals
            int coldist=Math.abs(col1-col2);
            int rowdist=row1-row2;
            if(coldist==rowdist)
                return false;



        }
        return true;
    }
}
