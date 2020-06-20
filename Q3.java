package com.company;

import java.util.Scanner;


class Complex{

    int relSum;
    int imgSum;
    int relSub;
    int imgSub;
    int relMulti;
    int imgMulti;
    void add(int rel1,int rel2,int img1,int img2) {
        relSum = rel1 + rel2;
        imgSum = img1 + img2;
    }
    void displaySum(){
        System.out.println(relSum+"+"+imgSum+"img");
    }
    void diff(int rel1,int rel2,int img1,int img2){
        relSub=rel1-rel2;
        imgSub=img1-img2;
    }
    void displaySub(){
        System.out.println(relSub+"+"+imgSub+"img");
    }
    void mul(int rel1,int rel2,int img1,int img2){
        relMulti=(rel1*rel2)-(img1*img2);
        imgMulti=(rel1*img2)+(rel2*img1);
    }
    void displayMulti(){
        System.out.println(relMulti+"+"+imgMulti+"img");
    }

    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter First Real And Img Number");
        int rel1=sc.nextInt();
        int img1=sc.nextInt();
        System.out.println("enter Second real and img no.");
        int rel2=sc.nextInt();
        int img2=sc.nextInt();
        Complex com=new Complex();
        System.out.println("ADDITION");
        com.add(rel1,rel2,img1,img2);
        com.displaySum();
        System.out.println("SUBTRACTION");
        com.diff(rel1,rel2,img1,img2);
        com.displaySub();
        System.out.println("MULTIPLICATION");
        com.mul(rel1,rel2,img1,img2);
        com.displayMulti();

    }
}