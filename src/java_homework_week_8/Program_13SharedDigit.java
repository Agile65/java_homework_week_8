package java_homework_week_8;

import java.util.Scanner;

/**
 * 13. Shared Digit
 * Write a method named hasSharedDigit with two parameters of type int.
 * Each number should be within the range of 10 (inclusive) - 99 (inclusive). If one of the numbers is not
 * within the range, the method should return false.
 * The method should return true if there is a digit that appears in both numbers, such as 2 in 12 and 23;
 * otherwise, the method should return false.
 * EXAMPLE INPUT/OUTPUT:
 * hasSharedDigit(12, 23); → should return true since the digit 2 appears in both numbers
 * hasSharedDigit(9, 99); → should return false since 9 is not within the range of 10-99
 * hasSharedDigit(15, 55); → should return true since the digit 5 appears in both numbers
 * NOTE: The method hasSharedDigit should be defined as public static
 */

public class Program_13SharedDigit {
    //static method with two parameter and with return type
    public static boolean hasSharedDigit(int num1, int num2) {
        if ((num1 >=10 && num1 <= 99)&& (num1 >=10 && num1 <= 99)){
            int fnLastDigit=num1%10;//storing last digit of first number
            int snLastDigit=num2%10;//storing last digit of second number
            num1=num1/10;
            num2=num2/10;
            int fnFirstDigit=num1;//storing first digit of first number
            int snFirstDigit=num2;//storing first digit of second number
            return((fnFirstDigit==snFirstDigit)||(fnFirstDigit==snLastDigit)||(fnLastDigit==snFirstDigit)||(fnLastDigit==snLastDigit));
        }
        return false;
    }
    //main method
    public static void main(String[] args) {
        //Scanner declaration for reading input from console
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input number 1 : ");
        int num1=scanner.nextInt();
        System.out.print("Input number 2 : ");
        int num2=scanner.nextInt();
        boolean ans=hasSharedDigit(num1,num2);
        System.out.println(ans);//displaying true or false on the console
        //closing the scanner
        scanner.close();
    }
}
