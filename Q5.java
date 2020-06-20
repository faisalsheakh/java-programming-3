package com.company;

import java.util.Scanner;

public class palandromeNumber {

    int r=0;
    int temp=0;
    int toCheck(int num){

        if(num<=0)
        {
            return r;
        }
        else {
            int re = num % 10;
            r = (r * 10) + re;
            return toCheck(num / 10);
        }
    }


    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        palandromeNumber pal = new palandromeNumber();
        System.out.println("Please Enter A Number");
        int n=sc.nextInt();
        int temp=n;

        pal.toCheck(n);
        if (pal.r==temp) {
            System.out.println(" This is Palandeome Number");
        } else {
            System.out.println("This is not Palandeome Number");
        }
    }
}
