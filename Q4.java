package com.company;


public class Q4 {

    private double radius = 1.0;
    String color = "red";

    Q4() {
        System.out.println("default constructor");
    }

    Q4(double radius) {
        this.radius = radius;
        System.out.println("Radius :- " + radius);
    }

    public double getRadius() {
        this.radius = radius;
        return radius;
    }

    public double getArea() {

        return Math.PI * radius * radius;

    }

    public static void main(String[] args) {
        Q4 cir = new Q4();
        System.out.println("Radius :- " + cir.getRadius());
        System.out.println("Area of circle :- " + cir.getArea());
    }


}
