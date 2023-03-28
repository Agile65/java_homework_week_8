package java_homework_week_8;

import java.util.Scanner;

/**
 * 3. Write a Java program that takes the user to provide a single character from the
 * alphabet. Print Vowel of Consonant, depending on the user input. If the user input
 * Is not a letter (between a and z or A and Z), or is a string of length > 1, print an
 * error message.
 * For eg:
 * Input an alphabet: p
 * Expected Output:
 * Input letter is Consonant
 */
public class Program_3VowelConsonant {
    //static method
    public static void isItVowelOrConsonant() {
        //Scanner declaration for reading input form console
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input an alphabet : ");
        String alphabet = scanner.next().toLowerCase();
        //checks length of String
        //if user enters more than 1 character an error message is printed
        if (alphabet.length() > 1) {
            System.out.println("Error : It is not a single character ");
            //if user enters a symbol
        } else if (!isItALetter(alphabet)) {
            System.out.println("Error. Not a letter. Enter alphabet");
        } else if (alphabet.equals("a") || alphabet.equals("e")||alphabet.equals("i")||alphabet.equals("o")||alphabet.equals("u")) {
            System.out.println("Letter is a Vowel");
        }else{
            System.out.println("Letter is a consonant");
        }
        // closing the scanner object
        scanner.close();
    }
    //method to check is it letter or not
    public static boolean isItALetter(String alphabet){
        return alphabet.charAt(0)>96 && alphabet.charAt(0)<123;
    }
    //main method
    public static void main(String[] args) {
        //calling static method directly
        isItVowelOrConsonant();
    }
}
