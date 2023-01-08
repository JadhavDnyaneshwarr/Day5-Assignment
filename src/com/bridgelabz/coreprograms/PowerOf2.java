package com.bridgelabz.coreprograms;

public class PowerOf2 {
    public static void main(String[] args) {
        int table = 2;
        int value=1;
        int j = 1;
        for (int i = 30; i!=0; i-- ){
            value *= table;
            System.out.println("2 ^ " + j + "="+ value);
            j++;
        }
    }
}
