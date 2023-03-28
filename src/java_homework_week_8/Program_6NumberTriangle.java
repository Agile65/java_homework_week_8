package java_homework_week_8;

import java.util.Scanner;

/*
6. Write a program in Java to display the pattern like a triangle with a number.
For eg.
Input number of rows: 10
Expected Output:
1
12
123
1234
12345
123456
1234567
12345678
123456789
12345678910
 */
public class Program_6NumberTriangle {
    //static method
    public static void pattern(int a){
        for(int i=0;i<=a;i++){
            for(int j=0;j<i;j++) {
                System.out.print(j+1);
            }
            System.out.println(" ");
        }
    }
    //main method
    public static void main(String[] args) {
        //Scanner declaration for reading input from console
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input number of rows : ");
        int a=scanner.nextInt();
        pattern(a); //calls static method
        //closing the scanner
        scanner.close();
    }
}
