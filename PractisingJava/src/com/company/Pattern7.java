package com.company;

import java.util.Scanner;

public class Pattern7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of terms");
        int n=sc.nextInt();
        for (int i = 1; i < 2*n ; i++) {
            if(i<=n) {
                for (int j = n; j >= i ; j--) {
                    System.out.print("  ");
                }
                for (int j = 1; j <= i; j++) {
                    System.out.print("* ");
                }
            }
            else {
                for (int j = i; j >=n ; j--) {
                    System.out.print("  ");
                }
                for (int j = 2*n-1; j >= i; j--) {
                    System.out.print("* ");
                }
            }
            System.out.println();

        }
    }

}
