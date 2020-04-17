package com.PrimesPackage;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    static char  stack[] = new char[100];
    static int top=-1;

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the infix to convert  in postfix in lowerCase");
        String str = sc.nextLine();
        StringBuffer post = new StringBuffer();

        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(ch>='a' && ch<='z')
            {
                post.append(ch);
            }
            else if(ch=='+' || ch=='-' || ch=='*' || ch=='/' || ch=='%') {
                if (top == -1) {
                    push(ch);
                }
                else {
                    int val1 = getpriority(ch);
                    if (val1 >= getpriority(peek())) {
                        push(ch);
                    } else {
                        while (getpriority(peek()) > val1) {
                            char ch2 = pop();
                            post.append(ch2);
                        }
                        push(ch);
                    }
                }
            }
            else if(ch=='(')
                push(ch);
            else if(ch==')')
            {
                while(peek()!='(')
                {
                    post.append(pop());
                }
            }
        }
        while(!isEmpty())
        {
            post.append(pop());
        }
        System.out.println("Formed psotfix expression");
        System.out.println(post.toString());

    }

    public static int getpriority(char ch)
    {
        if(ch=='+' || ch=='-')
            return 0;
        else if(ch=='*' || ch=='/' || ch=='%')
            return 1;
        return -1;
    }

    public  static void push(char ch)
    {
        top++;
        stack[top]=ch;
    }


    public static char pop()
    {
        char ch=stack[top];
        top--;
        return ch;
    }

    public static char peek()
    {
        return stack[top];
    }

    public static boolean isEmpty()
    {
        if(top==-1)
            return true;
        else return false;
    }




}
