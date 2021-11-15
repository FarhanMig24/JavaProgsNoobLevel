package com.company;
import java.util.*;
public class Anagrams {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        boolean ana=false;
        int l;
        System.out.println("Enter two strings to check whether they are Anagrasm or not");
        String a=sc.next().trim();
        String b=sc.next().trim();
        l=a.length();
        if(a.length()!=b.length())
           ana=false;
        else {
            char a1[]=new char[l];
            char b1[]=new char[l];
            for (int i = 0; i < l; i++) {
                a1[i]=a.charAt(i);
                b1[i]=b.charAt(i);
            }
            Arrays.sort(a1);
            Arrays.sort(b1);
            for (int i = 0; i < l; i++) {
                if(a1[i]!=b1[i])  {
                    ana=false;
                    break;
                }
                ana=true;
            }
        }
        if (ana==true)
            System.out.println("They are Anagrams");
        else
            System.out.println("They are not Anagrams");
    }
}
