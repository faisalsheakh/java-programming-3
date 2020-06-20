package com.company;
import  java.util.Scanner;

class AreaRectangle{
    int len;
    int bre;
    void setdim(){
        Scanner src = new Scanner(System.in);
        System.out.println("What is length");
        len=src.nextInt();
        System.out.println("What is breadth");
        bre=src.nextInt();

    }
    int getarea(){
        int area=len*bre;
        return area;
    }
}
class Area {

    public static void main(String[] args) {
        AreaRectangle rec = new AreaRectangle();
        rec.setdim();
        int areaout = rec.getarea();
        System.out.println(areaout);
    }
}
