package com.PrimesPackage;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String s1="a##c";
        String s2="#a#c";

        if(s1.equals(s2)) {
            System.out.println("True");;
        }
        else
        System.out.println("Fasle");

    }
    public static String backSpace(String s1)
    {
        StringBuffer cap=new StringBuffer()
;        StringBuffer str1=new StringBuffer();
        str1.append(s1);
        str1=str1.reverse();
//        System.out.println(str1.toString());
        int count=0;
        for(int i=0;i<str1.length();)
        {
            count=0;
            //if we get a # skip next character

            while(str1.charAt(i)=='#' && i<str1.length())
            {
                i++;
                count++;
            }

//            System.out.println(count);
//            System.out.println(i);
            while(count!=1 && i<str1.length()) {
                count--;
                i++;
            }

            if(i<str1.length() && str1.charAt(i)!='#')
            cap.append(str1.charAt(i));
            i++;


//            System.out.println(i);
//            System.out.println(count);
        }
        return cap.toString();
    }
}
