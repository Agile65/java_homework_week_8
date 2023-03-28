package java_homework_week_8;
/**
 * 14. Write a program in Java to display the pattern like a diamond.
 * While loop
 */

import java.util.Scanner;

public class Program_14DiamondPattern {
    //static method for printing pattern
    public static void diamondPattern(int r, char ch) {
        int i = 1;
        int j;
        //while loop for top half
        while (i <= r) {
            j = 1;
            while (j++ <= r - i) {
                System.out.print(" ");
            }
            j = 1;
            while (j++ <= i * 2 - 1) {
                System.out.print(ch);
            }
            System.out.println();
            i++;
        }
        i = r - 1;
        //while loop for bottom half
        while (i > 0) {
            j = 1;
            while (j++ <= r - i) {
               System.out.print(" ");
            }
            j = 1;
            while (j++ <= i * 2 - 1) {
                System.out.print(ch);
            }
            System.out.println();
            i--;
        }
    }
    //main method
    public static void main(String[] args) {
        //Scanner declaration for reading input form console
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Number of row : ");
        int a = scanner.nextInt();
        System.out.print("Enter the symbol : ");
        char c = scanner.next().charAt(0);
        diamondPattern(a, c);
        // closing the scanner object
        scanner.close();
    }
}
