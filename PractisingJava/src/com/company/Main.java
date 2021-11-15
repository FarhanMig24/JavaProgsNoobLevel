package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int a,b,o,d,n,x;
        System.out.println("Enter four numbers");
        a=sc.nextInt();
        b=sc.nextInt();
        o=a|b;
        n=~a;
        x=a^b;
        d=a&b;
        System.out.println("The values are"+o+','+n+','+x+','+d);

    }
}
