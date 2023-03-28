package java_homework_week_8;

import java.util.Scanner;

/**
 * 10. Write a program to input any number and check if it Armstrong number or not
 * 153 = (1*1*1)+(5*5*5)+(3*3*3)
 * where:
 * (1*1*1)=1
 * (5*5*5)=125
 * (3*3*3)=27
 * So:
 * 1+125+27=153
 */
public class Program_10ArmstrongNumber {
    //static method
    public static boolean isItArmstronNumber(int number) {
        int sum = 0;
        int tempCopy = number;//creating tempCopy of entered number for calculation
        while (tempCopy != 0) {
            int lastDigit = tempCopy % 10;
            sum=sum+(lastDigit*lastDigit*lastDigit);
            tempCopy=tempCopy/10;
        }
        //if number is same as sum returns true
        if(sum==number){
            return true;
        }
        return false;
    }
    //main method
    public static void main(String[] args) {
        //Scanner declaration for reading input from console
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a number : ");
        int number = scanner.nextInt();
        boolean ans=isItArmstronNumber(number); //calls static method
        if(ans==true){
            System.out.println("The number is Armstrong number");
        }else{
            System.out.println("The number is not Armstrong number");
        }

        //closing the scanner
        scanner.close();
    }
}
