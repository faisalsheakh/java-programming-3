package com.company;

import java.util.Scanner;


class Q6{
public static class sumRec {

    int s=0;
    int n;
    int temp=0;
    int input(int n) {
        temp = n;
        if (n <= 0) {
            return n;
        } else {
            int mod = n % 10;
            s = s  + mod;
            return input(n / 10);
        }
    }
    void Sum(){
        System.out.println(s);
    }
    public static void main(String [] args){
        sumRec sum1=new sumRec();
        System.out.println("Enter the number to get sum of digits");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        sum1.input(a);
        sum1.Sum();
    }
}
}