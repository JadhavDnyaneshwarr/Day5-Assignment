package com.bridgelabz.coreprograms;

import java.util.Scanner;

public class FlipCoin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter number => ");
        int num = scanner.nextInt();
        int head = 0;
        int tail = 0;
        for (int i = 1; i <= num; i++ ) {
            double j = Math.random();
            if (j < 0.5) {
                tail++;
            } else {
                head++;
            }
        }
        if (tail>head){
            int per =tail *100;
            int percentage = per/ num;
            System.out.println("tail is winner and winning percentage is " + percentage);
        }else if (head>tail) {
            int per = head * 100;
            int percentage = per /num;
            System.out.println("tail is winner and winning percentage is " + percentage);
        } else {
            System.out.println("both win same times");
        }


    }
}
