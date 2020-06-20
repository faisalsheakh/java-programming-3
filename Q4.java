package com.company;


public class circle {

    private double radius = 1.0;
    String color = "red";

    circle() {
        System.out.println("default constructor");
    }

    circle(double radius) {
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
        circle cir = new circle();
        System.out.println("Radius :- " + cir.getRadius());
        System.out.println("Area of circle :- " + cir.getArea());
    }


}
