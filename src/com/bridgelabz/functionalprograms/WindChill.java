package com.bridgelabz.functionalprograms;

public class WindChill {
    public static void main(String[] args) {
        int t =35;
//        int t =Integer.parseInt(args[0]);
        int v =90;
//        int v =Integer.parseInt(args[1]);
        double a = (0.4275 * t) - 35.75;
        double b = (double)Math.pow(v,0.16);
        double w =(double)( 35.74 + (0.6215 * t )+ a * b);
        System.out.println(w);
    }
}
