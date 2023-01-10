package com.bridgelabz.coreprograms;

public class PowerOf2 {
    public static void main(String[] args) {
        int table = 2;
        for (int i = 1; i<31; i++ ){
            double value = Math.pow(table,i);
            System.out.println("2 ^ " + i + "="+ value);
        }
    }
}
