package com.bridgelabz.coreprograms;

import java.util.Scanner;

public class SwapTwoNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter number1 => ");
        int num1 = scanner.nextInt();
        System.out.println("enter number2 => ");
        int num2 = scanner.nextInt();
        int x = num1;
        num1 = num2;
        num2 = x;
        System.out.println(num1);
        System.out.println(num2);
    }
}
