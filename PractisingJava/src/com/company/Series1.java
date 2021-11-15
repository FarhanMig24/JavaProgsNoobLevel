package com.company;

import java.util.Scanner;

public class Series1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float result=0;
        System.out.println("Enter the last term");
        int n=sc.nextInt();
        for (float i = 1; i <= n; i++) {
            if(i%2==0)
                result-=1/i;
            else
                result+=1/i;
        }
        System.out.println("The result is "+result);
    }
}
