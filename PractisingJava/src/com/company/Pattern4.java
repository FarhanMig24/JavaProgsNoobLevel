package com.company;

import java.util.Scanner;

public class Pattern4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of terms");
        int n=sc.nextInt();
        for (int i = 1; i < 2*n ; i++) {
            if(i<=n) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("* ");
                }
            }
            else {
                for (int j = 2 * n; j > i; j--) {
                    System.out.print("* ");
                }
            }
                System.out.println();

            }
        }

        }
