package java_homework_week_8;

import java.util.Scanner;
/*
8. Display right angle triangle of @ using nested for loops
@
@@
@@@
@@@@
@@@@@
 */
public class Program_8RightTriangle {
    //static method for printing right angle triangle
    public static void rightTriangle(int number){
        for(int i=0;i<=number;i++){
            for(int j=0;j<i;j++){
                System.out.print("@");
            }
            System.out.println(" ");
        }
    }
    //main method
    public static void main(String[] args) {
        //scanner declaration for reading input from console
        Scanner scanner=new Scanner(System.in);
        System.out.print("Input number of rows : ");
        rightTriangle(scanner.nextInt()); //calling static method
        //closing the scanner object
        scanner.close();
    }
}
