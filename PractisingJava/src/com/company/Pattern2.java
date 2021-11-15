package com.company;

import java.util.Scanner;

public class Pattern2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int k=0;
        System.out.println("Enter no of terms");
        int n=sc.nextInt();
        for (int i = 1; i <=n ; i++) {
            for (int j = n-1; j >=i ; j--) {
                System.out.print("  ");
            }
            for (int j = 1; j <=i ; j++) {
                System.out.print(++k+"   ");
            }
            System.out.println();
        }
    } //NICESUUUUUUUUUUUUUUUUUUU
}
