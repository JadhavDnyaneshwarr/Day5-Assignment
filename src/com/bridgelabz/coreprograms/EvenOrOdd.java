package com.bridgelabz.coreprograms;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter number => ");
        int num = scanner.nextInt();
        if (num%2==0){
            System.out.println("the enter number is even number");
        }else {
            System.out.println("the enter number is odd number");
        }
    }
}
