package org.example;

public class TimeCalculation {
    public static void main(String[] args) {
        System.out.println("Time calculation: " + calculateTime(100.0, 100.0));
    }

    public static double calculateTime(double x, double y) {
        return x / y;
    }
}
