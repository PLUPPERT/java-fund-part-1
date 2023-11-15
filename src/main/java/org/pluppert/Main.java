package org.pluppert;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Exercise 1:
        /*
        System.out.println("Hello");
        System.out.println("Christian!");
        */

        // Exercise 2:
        /* System.out.print("Enter year: ");
        int year = scanner.nextInt();
        boolean leapYear = (year % 4) == 0;

        if (year < 0) {
            System.out.println("Invalid entry. Please enter a valid year.");
        } else if (leapYear) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
        */

        // Exercise 3:
        System.out.print("Write a number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Write a second number: ");
        double num2 = scanner.nextDouble();
        double addition = num1 + num2;
        double subtraction = num1 - num2;
        double multiplier = num1 * num2;
        double divisor = num1 / num2;

        System.out.println(num1 +" + " + num2 + " = " + addition);
        System.out.println(num1 +" - " + num2 + " = " + subtraction);
        System.out.println(num1 +" * " + num2 + " = " + multiplier);
        System.out.println(num1 +" / " + num2 + " = " + divisor);

    }
}