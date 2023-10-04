package com.pluralsight;

import static java.lang.Math.abs;

public class MathApp {

    public static void main (String[] args) {

        double bobSalary = 50000.00;
        double garySalary = 60000.00;

        System.out.println("The answer is " + Math.max(bobSalary,garySalary));


        int carPrice = 6;
        int truckPrice = 8;

        System.out.println("The answer is " + Math.min(carPrice, truckPrice));

        float radius = 7.25f;

        System.out.println("The answer is " + 3.14*Math.pow(radius,2));

        double variable = 5.0;

        System.out.println("The answer is " + Math.sqrt(variable));

        double distance = Math.hypot (85-5, 50-10);

        System.out.println("The answer is " + distance);

        double value = -3.8;

        System.out.println("The answer is " + abs(value));

        int min = 0;
        int max = 1;

       // System.out.println ("The answer is " + math.random (0,1));

    }
}
