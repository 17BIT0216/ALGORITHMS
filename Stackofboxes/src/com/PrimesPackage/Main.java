package com.PrimesPackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ArrayList<Box> boxes= new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of boxes");
        int num=sc.nextInt();
        for(int i=0;i<num;i++)
        {
            int h=sc.nextInt();
            int b=sc.nextInt();
            int l=sc.nextInt();
            Box b1=new Box(h,b,l);
            boxes.add(b1);

        }
        Collections.sort(boxes,(o1, o2) ->
        {
            if(o1.hieght>o2.hieght)
            {
                return -1;
            }
            else if(o1.hieght==o2.hieght)
                return 0;
            else
                return 1;

        });
        int maxh=0;
        for(int i=0;i<boxes.size();i++)
        {
            int max=sortBoxes(boxes,i);
            maxh=Math.max(max,maxh);
        }
        System.out.println("MAX HIEGHT POSSIBLE");
        System.out.println(maxh);

    }

    public static int sortBoxes(ArrayList<Box> boxes,int positon)
    {

        Box bottom = boxes.get(positon);
        int maxhieght=0;
        for(int i=positon+1;i<boxes.size();i++)
        {
            if(bottom.canbeabove(boxes.get(i)))
            {
               int hieght=sortBoxes(boxes,i);
               maxhieght=Math.max(maxhieght,hieght);
            }
        }
        maxhieght=maxhieght+bottom.hieght;
        return maxhieght;

    }


}
