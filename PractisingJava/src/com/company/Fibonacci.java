package com.company;
import java.util.*;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int f=0,s=1,t,i,n,sum;
        System.out.println("Enter the no of terms");
        n=sc.nextInt();
        System.out.print(f+" "+s+" ");
        for ( i = 1; i <n-1 ; i++) {
            t=f+s;
            System.out.print(t+" ");
            f=s;
            s=t;


        }
    }
}
