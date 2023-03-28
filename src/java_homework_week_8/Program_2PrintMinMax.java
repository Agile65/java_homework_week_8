package java_homework_week_8;
import java.util.Scanner;
/**
 * 2. -Read the numbers from the console entered by the user and print the minimum
 * and maximum number the user has entered.
 * -Before the user enters the number, print the message Enter number:
 * -If the user enters an invalid number, break out of the loop and print the minimum and maximum
 * number.
 * Hint:
 * -Use an endless while loop.
 * -Create a class with the name MinAndMaxInputChallenge.
 */

public class Program_2PrintMinMax {
    //static method
    public static void findMinMax() {
        //Scanner declaration for reading input form console
        Scanner scanner = new Scanner(System.in);
        int max = 0;
        int min = 0;
        boolean first = true;
        //endless while loop
        while (true) {
            System.out.print("Enter the Number : ");
            boolean isAnInt = scanner.hasNextInt();
            if (isAnInt) {
                int number = scanner.nextInt();
                if (first) {
                    first = false;
                    max = number;
                    min = number;
                }
                if (number > max) {
                    max = number;
                }
                if (number < min) {
                    min = number;
                }
            } else {
                break;
            }
            scanner.nextLine();//handle input
        }
        System.out.println("Min = " + min + "   " +"Max = " +max);
        scanner.close();//closing the scanner
    }
    //main method
    public static void main(String[] args) {
        findMinMax();//calling static method
    }
}
