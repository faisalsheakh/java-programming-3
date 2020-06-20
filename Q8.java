package com.company;

import java.util.Scanner;

public class Q8 {

    int num1;
    int num2;
    int check(int n, int k){

        if(n-k<=0){
            num2=n-k;
            return num2;
        }
        else{
            n=n-k;
            return check(n,k);

        }
    }
    int show1(int n,int k){
        if(n<=0 )
        {
            return n;
        }

        else {
            System.out.print(n+",");
            return show1(n-k,k);
        }
    }
    int show2(int n,int k){
        if(n==num1){
            System.out.print(n+",");
            return n;
        }
        else{
            System.out.print(n+",");
            return show2(n+k,k);
        }
    }
    public static void main(String[] args){
        Q8 display=new Q8();
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Value For n");
        int n=sc.nextInt();
        System.out.println("Enter Value For k");
        int k=sc.nextInt();
        int num=display.check(n,k);
        display.num1=n;

        display.show1(n,k);
        display.show2(num,k);

    }

}
