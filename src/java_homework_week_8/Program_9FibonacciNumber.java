package java_homework_week_8;
/*
9. Print the sequence 1 1 2 3 5 8 13 21 (Fibonacci number)
 */

import java.util.Scanner;

public class Program_9FibonacciNumber {
    //static method
    public static void fiboNumber(int number) {
        int n1 = 0, n2 = 1, n3;
        System.out.print(n1 + " " + n2);
        //loop starts from 2 because 0 and 1 are already printed
        for (int i = 2; i < number; i++) {
            n3 = n1 + n2;
            System.out.print("  " + n3);
            n1 = n2;
            n2 = n3;
        }
    }
    //main method
    public static void main(String[] args) {
        //Scanner declaration for reading input from console
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input number for digits : ");
        int a = scanner.nextInt();
        fiboNumber(a); //calls static method
        //closing the scanner
        scanner.close();
    }
}
