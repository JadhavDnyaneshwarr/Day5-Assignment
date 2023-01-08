package com.bridgelabz.coreprograms;

import java.util.Scanner;

public class GreatestAmongAll {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter number1 => ");
        int num1 = scanner.nextInt();
        System.out.println("enter number2 => ");
        int num2 = scanner.nextInt();
        System.out.println("enter number3 => ");
        int num3 = scanner.nextInt();

        if (num1>num2){
            if(num1>num3){
                System.out.println("the enter number " + num1 + " is greatest among all");
            }else {
                System.out.println("the enter number " + num3 + " is greatest among all");
            }
        }else{
            if(num2>num3){
                System.out.println("the enter number " + num2 + " is greatest among all");
            }else {
                System.out.println("the enter number " + num3 + " is greatest among all");
            }
        }
    }
}
