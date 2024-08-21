/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javaassignmentrecursion;

/**
 *
 * @author ldxt460s
 */

import java.util.Scanner;

public class Recursion {
        public static int recursiveMultiply(int a, int b) {
        // Base cases
        if (a == 0 || b == 0) {
            return 0;
        }

        // Recursive case
        if (b < 0) {
            return -recursiveMultiply(a, -b);
        } else {
            return a + recursiveMultiply(a, b - 1);
        }
    }

    public static void start() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first integer: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second integer: ");
        int num2 = scanner.nextInt();  


        int product = recursiveMultiply(num1, num2);
        System.out.println("The product of " + num1 + " and " + num2 + " is: " + product);
    }    
}
