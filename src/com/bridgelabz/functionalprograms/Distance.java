package com.bridgelabz.functionalprograms;

public class Distance {
    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);
        int xx = (int) Math.pow(x,2);
        int yy = (int) Math.pow(y,2);
        int distance = (int) Math.sqrt(xx+yy);
        System.out.println(distance);
    }
}
