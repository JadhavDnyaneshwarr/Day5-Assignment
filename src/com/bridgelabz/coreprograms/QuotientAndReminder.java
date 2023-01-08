package com.bridgelabz.coreprograms;

import java.util.Scanner;

public class QuotientAndReminder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter number => ");
        int num = scanner.nextInt();
        System.out.println("enter divider => ");
        int divider = scanner.nextInt();

        int quotient = num/divider;
        int reminder = num%divider;
        System.out.println("the quotient is " + quotient + " and Reminder is " + reminder);
    }
}
