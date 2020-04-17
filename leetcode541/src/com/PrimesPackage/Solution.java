package com.PrimesPackage;

public class Solution {

        public String reverseStr(String s, int k) {
            StringBuilder str = new StringBuilder();
            String str1="";

            int i=0;
            for( i=0;i<s.length();i=i+2k)
            {

                if((2k+i) <= s.length())
                {
                     str1 = s.substring(i,2k+i);
                }
            else
                {
                    str1=s.substring(i);
                }

                str.append(str1.substring(0,k)).reverse();
                str.append(str1.substring(k));

            }
        }
    }

