package com.bridgelabz.functionalprograms;

public class Distance {
    public static void main(String[] args) {
//        int x = Integer.parseInt(args[0]);
//        int y = Integer.parseInt(args[1]);
        int x=4;
        int y=5;
        int xx = (int) Math.pow(x,2);
        int yy = (int) Math.pow(y,2);
        double distance = (double) Math.sqrt(xx+yy);
        System.out.println(distance);
    }
}
