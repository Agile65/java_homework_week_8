package java_homework_week_8;

import java.util.Scanner;

/**
 * 11. Even Digit Sum
 * Write a method named getEvenDigitSum with one parameter of type int called number.
 * The method should return the sum of the even digits within the number.
 * If the number is negative, the method should return -1 to indicate an invalid value.
 * EXAMPLE INPUT/OUTPUT:
 * * getEvenDigitSum(123456789); → should return 20 since 2 + 4 + 6 + 8 = 20
 * * getEvenDigitSum(252); → should return 4 since 2 + 2 = 4
 * * getEvenDigitSum(-22); → should return -1 since the number is negative
 * NOTE: The method getEvenDigitSum should be defined as public static
 */

public class Program_11EvenDigitSum {
    //static method for finding even digit sum
    public static int getEvenDigitSum(int number){
        if(number<0){
            return -1;
        }
        int d,sum=0;
        while(number>0){
            d=number%10;
            //do sum only if the digit is even
            if(d%2==0) {
                sum = sum + d;
            }
            number=number/10;
        }
       return sum;
    }
    //main method
    public static void main(String[] args) {
        //Scanner declaration for reading input from console
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a number : ");
        int number = scanner.nextInt();
        int sum=getEvenDigitSum(number);
        System.out.println(sum);
        //closing the scanner
        scanner.close();

    }

}
