package com.company;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word="";
        int n=0;
        System.out.println("Enter a string");
        String s = sc.nextLine().trim();
        s=" "+s;
        int l=s.length();
        for (int i = l-1; i >=0 ; i--) {
            char ch=s.charAt(i);
            if (ch!=' ') {
                word = ch + word;
                n = 0;
            }
            else {
                n++;
                if(n==1) {
                    System.out.print(word + " ");
                    word = "";
                }
            }
        }

        }
    }

