package com.company;

import java.util.Scanner;

public class Q1 {

    public static void main(String[] args)  {
        int c=0;
        int n;
        int a;
        int temp;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter a Number");
        n= sc.nextInt();
        temp=n;
        while(n>0)
        {
            a=n%10;
            n=n/10;
            c=c+(a*a*a);
        }
        if(temp==c)
            System.out.println("Enterd number is armstrong number");
        else
            System.out.println("Enterd number is Not armstrong number");
    }
}
