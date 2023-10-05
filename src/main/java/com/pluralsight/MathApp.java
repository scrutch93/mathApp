package com.pluralsight;

import static java.lang.Math.abs;

public class MathApp {

    public static void main (String[] args) {

        double bobSalary = 50000.00;
        double garySalary = 60000.00;

        System.out.println("The answer is " + Math.max(bobSalary,garySalary));


        double carPrice = 16000.99;
        double truckPrice = 18000.98;

        System.out.println("The answer is " + Math.min(carPrice, truckPrice));

        double  radius = 7.25;
        double  area = Math.PI * Math.pow(radius , 2f);

        System.out.println("The answer is " + area);

        double variable = 5.0;

        System.out.println("The answer is " + Math.sqrt(variable));

        int x1 = 5;
        int y1 = 10;
        int x2 = 85;
        int y2 = 50;

        double distance = Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));

        System.out.println("The answer is " + distance);

        double value = -3.8;

        System.out.println("The answer is " + abs(value));

        double randomNumber = Math.random();

        System.out.println("The answer is " + randomNumber);
    }
}
