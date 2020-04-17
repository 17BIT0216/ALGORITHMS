package com.PrimesPackage;

public class Box {
    int hieght;
    int breadth;
    int length;

    Box(int h,int b,int l)
    {
        hieght=h;
        breadth=b;
        length=l;
    }

    public boolean canbeabove(Box b1)
    {
        if(this.hieght>b1.hieght && this.length>b1.length && this.breadth>b1.breadth)
        {
            return true;
        }
        else
            return false;
    }

}
