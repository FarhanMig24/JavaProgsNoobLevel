package com.company;

import java.util.Scanner;

public class Pattern5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of terms");
        int n=sc.nextInt();
        for (int i = 1; i <= n ; i++) {
            if (i>2 && i<n)
            {
                System.out.print("* ");
                for (int j = 1; j < i-1; j++) {
                    System.out.print("  ");
                }
                System.out.print("* ");
                }
            else
            {
                for (int j = 1; j <=i ; j++) {
                    System.out.print("* ");
                }
            }
            System.out.println();
            }
        }
}