package com.bridgelabz.functionalprograms;

import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter number for row => ");
        int num0 = scanner.nextInt();
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        System.out.println("enter number for column => ");
        int numb0 = scanner.nextInt();
        int numb1 = scanner.nextInt();
        int numb2= scanner.nextInt();
        int[][] array = {{num0, num1, num2},{numb0,numb1,numb2}};

        for (int i = 0; i<array.length;i++){
            for (int j = 0;j<array[i].length;j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
