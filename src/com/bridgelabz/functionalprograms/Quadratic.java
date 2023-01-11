package com.bridgelabz.functionalprograms;

public class Quadratic {
    public static void main(String[] args) {
        int a = 3;
        int b = 10;
        int c = 5;
        int delta = b*b - (4*a*c);
        double x1 = (double)(-b + Math.sqrt(delta))/(2*a);
        double x2 = (double)(-b - Math.sqrt(delta))/(2*a);
        double quadratic = (double)((a*x1*x1)+(b*x1) + c);
        System.out.println(quadratic);
    }
}
