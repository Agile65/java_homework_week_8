package java_homework_week_8;
/*15. Display left angle triangle of * using nested for loops
*
* *
* **
* ****
* *****
*/

import java.util.Scanner;

public class Program_15TriangleForLoop {
    //static method for printing triangle
    public static void printTriangle(int number){
        for(int i=0;i<number;i++){
            for(int j=0;j<number;j++) {
                if(j<=i) {//to print in triangle pattern
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
    //main method
    public static void main(String[] args) {
        //Scanner declaration for reading input from console
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input number of rows : ");
        int a=scanner.nextInt();
        printTriangle(a); //calls static method
        //closing the scanner
        scanner.close();
    }
}
