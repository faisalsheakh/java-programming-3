package com.company;

import  java.util.Scanner;

public class Q7 {

    int num;
    int print1st(int n){
        if(n==0 )
        {
            System.out.print(n+" ");
            return n;
        }
        else {
            System.out.print(n+" ");
            return print1st(n-1);
        }
    }
    int print2nd(int n){
        if(n==num){
            System.out.print(n+" ");
            return n;
        }
        else{
            System.out.print(n+" ");
            return print2nd(n+1);
        }
    }
    public static void main(String[] args){
        Q7 dis=new Q7();
        Scanner sc= new Scanner(System.in);
        System.out.println("Please Enter A Number");
        int n=sc.nextInt();
        dis.num=n;
        dis.print1st(n);
        dis.print2nd(1);
    }
}
