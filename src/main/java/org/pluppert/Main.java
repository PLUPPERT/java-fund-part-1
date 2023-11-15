package org.pluppert;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
        // Exercise 1:
        System.out.println("Hello");
        System.out.println("Christian!");
        */

        // Exercise 2:
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter year: ");
        int year = scanner.nextInt();
        boolean leapYear = (year % 4) == 0;

        if (year < 0) {
            System.out.println("Invalid entry. Please enter a valid year.");
        } else if (leapYear) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }
}