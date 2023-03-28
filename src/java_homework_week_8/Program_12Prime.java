package java_homework_week_8;

import java.util.Scanner;

/**
 * 12. Write a programme to input any number and check if it is prime or not.
 * (Prime number is a number that is greater than 1 and divided by 1 or itself only. In other words,
 * prime numbers can't be divided by other numbers than itself or 1. For example 2, 3, 5, 7, 11, 13,
 * 17.... are the prime numbers.)
 */

public class Program_12Prime {
    //static method for finding prime number
    public static void primeNumber(int number) {
        boolean flag = false;
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                flag = true;
                break;
            }
        }
        if (flag)
            System.out.println(number + " is not a prime number");
        else
            System.out.println(number + " is a prime number");
    }
//main method
    public static void main(String[] args) {
        //Scanner declaration for reading input from console
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a number : ");
        int number = scanner.nextInt();
        primeNumber(number);
        //close the scanner
        scanner.close();
    }
}
