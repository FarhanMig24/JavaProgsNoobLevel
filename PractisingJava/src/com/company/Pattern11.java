package com.company;

import java.util.Scanner;

public class Pattern11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of terms");
        int n = sc.nextInt();
        int temp,temp2,d1,d2;
        for(int j=n;j>1;j--){
            System.out.print("   ");
        }
        System.out.println(1+"  ");
        for (int i = 1; i <= n ; i++) {
            for(int j=n;j>i;j--){
                System.out.print("   ");
            }
            temp=(int)Math.pow(11.0,i-1);
            temp2=temp*10;
            while(temp2>0)
            {
                d1=temp%10;
                d2=temp2%10;
                System.out.print(d1+d2+"  ");
                temp/=10;
                temp2/=10;
            }
            System.out.println();
        }

        }

        }




































