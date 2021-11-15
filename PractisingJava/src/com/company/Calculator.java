package com.company;
import java.lang.Math;
import java.util.*;
public class Calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1st no");
        int a=sc.nextInt();
        System.out.println("Enter 2nd no");
        int b=sc.nextInt();
        System.out.println("Enter the operation");
        sc.nextLine();
        char op=sc.nextLine().charAt(0);
        switch(op)
        {
            case 'A':
            case 'a':
                int s=a+b;
                System.out.println(s);
                break;
            case 'S':
            case 's':
                int d= Math.abs(a-b);
                System.out.println(d);
                break;
            case 'M':
            case 'm':
                int p=a*b;
                System.out.println(p);
                break;
            case 'D':
            case 'd':
                int q=a/b;
                System.out.println(q);
                break;
            default:
                System.out.println("Fuck off, you have given wrong input");


            }
        }
    }

