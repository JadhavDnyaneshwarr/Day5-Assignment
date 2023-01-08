package com.bridgelabz.coreprograms;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter year => ");
        int num = scanner.nextInt();
        if(num%4==0){
            System.out.println("entered year is leap year");
        }else {
            System.out.println("entered year is not leap year");
        }

    }
}
