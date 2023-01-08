package com.bridgelabz.coreprograms;

import java.util.Scanner;

public class HarmonicNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter harmonic number limit => ");
        int num = scanner.nextInt();
        double harmonic = 0;

        for(int i = 1; i<= num; i++){
            harmonic += (double) 1/i;
        }
        System.out.println(harmonic);
    }
}
