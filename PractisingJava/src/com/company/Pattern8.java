package com.company;

import java.util.Scanner;

public class Pattern8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of terms");
        int n = sc.nextInt();
        for (int i = 1; i <= 2*n ; i++) {
            if(i==n+1)
                System.out.println();
            if (i <= n) {
                for (int j = n; j >= i; j--) {
                    System.out.print("* ");
                }
                for (int k = 0; k <=1 ; k++) {
                    for (int j = 1; j <= i; j++) {
                    System.out.print("  ");
                }
                }
                for (int j = n; j >= i; j--) {
                    System.out.print("* ");
                }
                System.out.println();
            }
            else {
                for (int j = n; j < i; j++) {
                    System.out.print("* ");
                }
                for (int k = 0; k <=1 ; k++) {
                    for (int j = 2*n; j >= i; j--) {
                       System.out.print("  ");
                    }
                }
                for (int j = n; j < i; j++) {
                    System.out.print("* ");
                }
                System.out.println();

            }

        }
    }
}
