package com.company;

import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array length");
        int l=sc.nextInt();
        int a[]=new int[l];
        System.out.println("Enter the array values now");
        for (int i = 0; i < l; i++) {
            a[i]=sc.nextInt();
        }
        for (int i = l-1; i >=0; i--) {
            for (int j = 0; j < i; j++) {
                if (a[j] > a[j+1]) {
                    a[j] += a[j+1];
                    a[j+1] = a[j] - a[j+1];
                    a[j] = a[j]-a[j+1];
                }
            }
        }
        System.out.println("The sorted array is");
        for (int i = 0; i < l; i++) {
            System.out.print(a[i]+"  ");

        }
        }
    }

